import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Generate{    
    
    public static int write_file(String path_plus_name, List<String> lines){
        try{
            FileWriter myWriter = new FileWriter(path_plus_name);
            for(String line : lines){
                myWriter.write(line);
                myWriter.write("\n");
            }
            myWriter.close();
            return 1;
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    public static void generate(){

        //imports
        List<String> imports = new ArrayList<String>();
        imports.add(    "import javax.swing.JFrame;\n"+
                        "import javax.swing.JPanel;\n"+
                        "import javax.swing.BorderFactory;"
                    );
        if(!Center_panel.list_label.isEmpty()){imports.add("import javax.swing.JLabel;");}
        if(!Center_panel.list_textfield.isEmpty()){imports.add("import javax.swing.JTextField;");}
        if(!Center_panel.list_passwordfield.isEmpty()){imports.add("import javax.swing.JPasswordField;");}
        if(!Center_panel.list_textarea.isEmpty()){imports.add("import javax.swing.JTextArea;");}
        if(!Center_panel.list_scrollpane.isEmpty()){imports.add("import javax.swing.JScrollPane;");if(imports.indexOf("import javax.swing.JTextArea;")==-1){imports.add("import javax.swing.JTextArea;");}}
        if(!Center_panel.list_button.isEmpty()){imports.add("import javax.swing.JButton;");}
        if(!Center_panel.list_combobox.isEmpty()){imports.add("import javax.swing.JComboBox;");imports.add("import javax.swing.DefaultListCellRenderer;");}
        if(!Center_panel.list_radiobutton.isEmpty()){imports.add("import javax.swing.JRadioButton;");imports.add("import javax.swing.ButtonGroup;");}
        if(!Center_panel.list_table.isEmpty()){}
        if(!Center_panel.list_image.isEmpty()){
            if(imports.indexOf("import javax.swing.JLabel;")==-1){imports.add("import javax.swing.JLabel;");}
            imports.add("import javax.swing.ImageIcon;\n" +
                        "import javax.imageio.ImageIO;\n" +
                        "import java.awt.image.BufferedImage;\n" +
                        "import java.io.File;\n" +
                        "import java.awt.Graphics2D;\n" +
                        "import java.awt.Image;"
                    );
        }
        if(!Center_panel.list_bar.isEmpty()){imports.add("import javax.swing.JProgressBar;");}
        if(!Center_panel.list_checkbox.isEmpty()){imports.add("import javax.swing.JCheckBox;");}
        imports.add(    "\nimport java.util.List;\n\n"+
                        "import java.awt.Color;\n" +
                        "import java.awt.Dimension;\n" +
                        "import java.awt.Font;\n" +
                        "import java.awt.Toolkit;\n"
                    );

        //main code
        List<String> main_code_1 = new ArrayList<String>();
        List<String> main_code_2 = new ArrayList<String>();
        
        main_code_1.add("public class "+Right_panel.panel_name_textfield.getText()+"_panel"+" extends JFrame {\n");
        main_code_2.add("\tpublic static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();\n" +
                        "\tpublic static final int WIDTH = (int) screenSize.getWidth();\n" +
                        "\tpublic static final int HEIGHT = (int) screenSize.getHeight();\n");
        main_code_2.add("\n\tpublic static JPanel return_"+Right_panel.panel_name_textfield.getText()+"_panel(){\n");

        //add panel
        main_code_1.add("\tpublic static JPanel "+Right_panel.panel_name_textfield.getText()+" = new JPanel();");
        main_code_2.add("\t\t"+Right_panel.panel_name_textfield.getText()+".setBounds("+
                    (int)((float)Right_panel.x_combobox.getSelectedIndex()/100)+"*WIDTH,"+
                    (int)((float)Right_panel.y_combobox.getSelectedIndex()/100)+"*HEIGHT,"+
                    (int)((float)Right_panel.width_combobox.getSelectedIndex()/100)+"*WIDTH,"+
                    (int)((float)Right_panel.height_combobox.getSelectedIndex()/100)+"*HEIGHT"
                        +");");
        main_code_2.add("\t\t"+Right_panel.panel_name_textfield.getText()+".setLayout(null);");
        if(Right_panel.opaque_panel.isSelected()){main_code_2.add("\t\t"+Right_panel.panel_name_textfield.getText()+".setOpaque(true);\n"+"\t\t"+Right_panel.panel_name_textfield.getText()+".setBackground(new Color("+Right_panel.background_color.getBackground().getRed()+","+Right_panel.background_color.getBackground().getGreen()+","+Right_panel.background_color.getBackground().getBlue()+"));");}
        else{main_code_2.add("\t\t"+Right_panel.panel_name_textfield.getText()+".setOpaque(true);\n"+"\t\t"+Right_panel.panel_name_textfield.getText()+".setBackground(new Color(0,0,0,255));");}        
        main_code_2.add("");

        //add labels
        JLabel label;
        for(int i=0;i<Center_panel.list_label.size();i++){
            
            label = Center_panel.list_label.get(i);
            
            main_code_1.add("\tpublic static JLabel "+Center_panel.label_names.get(i)+" = new JLabel();");
            main_code_2.add("\t\t"+Center_panel.label_names.get(i)+".setBounds("+
                            "(int)(WIDTH*"+((float)(2*label.getX())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*label.getY())/(float)Interface.HEIGHT)+"),"+
                            "(int)(WIDTH*"+((float)(2*label.getWidth())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*label.getHeight())/(float)Interface.HEIGHT)+")"+
                            ");");
            
            main_code_2.add("\t\t"+Center_panel.label_names.get(i)+".setText(\""+label.getText()+"\");");
            
            if(label.isOpaque()){main_code_2.add("\t\t"+Center_panel.label_names.get(i)+".setOpaque(true);\n"+"\t\t"+Center_panel.label_names.get(i)+".setBackground(new Color("+label.getBackground().getRed()+","+label.getBackground().getGreen()+","+label.getBackground().getBlue()+"));");}
            else{main_code_2.add("\t\t"+Center_panel.label_names.get(i)+".setOpaque(true);\n"+"\t\t"+Center_panel.label_names.get(i)+".setBackground(new Color(0,0,0,64));");}
            main_code_2.add("\t\t"+Center_panel.label_names.get(i)+".setForeground(new Color("+label.getForeground().getRed()+","+label.getForeground().getGreen()+","+label.getForeground().getBlue()+"));");
            
            main_code_2.add("\t\t"+Center_panel.label_names.get(i)+".setFont(new Font("+
                            "\""+label.getFont().getFamily()+"\","+
                            "Font.PLAIN,"+
                            label.getFont().getSize()
                            +"));");

            main_code_2.add("\t\t"+Center_panel.label_names.get(i)+".setHorizontalAlignment(JLabel.CENTER);");
                
            if(label.getBorder()!=null){main_code_2.add("\t\t"+Center_panel.label_names.get(i)+".setBorder(BorderFactory.createLineBorder(Color.BLACK,1));");}
            else{main_code_2.add("\t\t"+Center_panel.label_names.get(i)+".setBorder(null);");}

            main_code_2.add("\t\t"+Right_panel.panel_name_textfield.getText()+".add("+Center_panel.label_names.get(i)+");");

            main_code_2.add("");
        }

        //add textfields
        JTextField textfield;
        for(int i=0;i<Center_panel.list_textfield.size();i++){
            
            textfield = Center_panel.list_textfield.get(i);
            
            main_code_1.add("\tpublic static JTextField "+Center_panel.textfield_names.get(i)+" = new JTextField();");
            main_code_2.add("\t\t"+Center_panel.textfield_names.get(i)+".setBounds("+
                            "(int)(WIDTH*"+((float)(2*textfield.getX())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*textfield.getY())/(float)Interface.HEIGHT)+"),"+
                            "(int)(WIDTH*"+((float)(2*textfield.getWidth())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*textfield.getHeight())/(float)Interface.HEIGHT)+")"+
                            ");");
            
            main_code_2.add("\t\t"+Center_panel.textfield_names.get(i)+".setText(\""+textfield.getText()+"\");");
            
            if(textfield.isOpaque()){main_code_2.add("\t\t"+Center_panel.textfield_names.get(i)+".setOpaque(true);\n"+"\t\t"+Center_panel.textfield_names.get(i)+".setBackground(new Color("+textfield.getBackground().getRed()+","+textfield.getBackground().getGreen()+","+textfield.getBackground().getBlue()+"));");}
            else{main_code_2.add("\t\t"+Center_panel.textfield_names.get(i)+".setOpaque(true);\n"+"\t\t"+Center_panel.textfield_names.get(i)+".setBackground(new Color(0,0,0,64));");}
            main_code_2.add("\t\t"+Center_panel.textfield_names.get(i)+".setForeground(new Color("+textfield.getForeground().getRed()+","+textfield.getForeground().getGreen()+","+textfield.getForeground().getBlue()+"));");

            main_code_2.add("\t\t"+Center_panel.textfield_names.get(i)+".setFont(new Font("+
                            "\""+textfield.getFont().getFamily()+"\","+
                            "Font.PLAIN,"+
                            textfield.getFont().getSize()
                            +"));");

            main_code_2.add("\t\t"+Center_panel.textfield_names.get(i)+".setHorizontalAlignment(JTextField.CENTER);");
            
            if(textfield.getBorder()!=null){main_code_2.add("\t\t"+Center_panel.textfield_names.get(i)+".setBorder(BorderFactory.createLineBorder(Color.BLACK,1));");}
            else{main_code_2.add("\t\t"+Center_panel.textfield_names.get(i)+".setBorder(null);");}

            if(textfield.isEditable()){main_code_2.add("\t\t"+Center_panel.textfield_names.get(i)+".setEditable(true);");}
            else{main_code_2.add("\t\t"+Center_panel.textfield_names.get(i)+".setEditable(false);");}

            main_code_2.add("\t\t"+Right_panel.panel_name_textfield.getText()+".add("+Center_panel.textfield_names.get(i)+");");

            main_code_2.add("");
        }

        //add passwordfields
        JPasswordField passwordfield;
        for(int i=0;i<Center_panel.list_passwordfield.size();i++){
            
            passwordfield = Center_panel.list_passwordfield.get(i);
            
            main_code_1.add("\tpublic static JPasswordField "+Center_panel.passwordfield_names.get(i)+" = new JPasswordField();");
            main_code_2.add("\t\t"+Center_panel.passwordfield_names.get(i)+".setBounds("+
                            "(int)(WIDTH*"+((float)(2*passwordfield.getX())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*passwordfield.getY())/(float)Interface.HEIGHT)+"),"+
                            "(int)(WIDTH*"+((float)(2*passwordfield.getWidth())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*passwordfield.getHeight())/(float)Interface.HEIGHT)+")"+
                            ");");
                        
            if(passwordfield.isOpaque()){main_code_2.add("\t\t"+Center_panel.passwordfield_names.get(i)+".setOpaque(true);\n"+"\t\t"+Center_panel.passwordfield_names.get(i)+".setBackground(new Color("+passwordfield.getBackground().getRed()+","+passwordfield.getBackground().getGreen()+","+passwordfield.getBackground().getBlue()+"));");}
            else{main_code_2.add("\t\t"+Center_panel.passwordfield_names.get(i)+".setOpaque(true);\n"+"\t\t"+Center_panel.passwordfield_names.get(i)+".setBackground(new Color(0,0,0,64));");}
            main_code_2.add("\t\t"+Center_panel.passwordfield_names.get(i)+".setForeground(new Color("+passwordfield.getForeground().getRed()+","+passwordfield.getForeground().getGreen()+","+passwordfield.getForeground().getBlue()+"));");

            main_code_2.add("\t\t"+Center_panel.passwordfield_names.get(i)+".setFont(new Font("+
                            "\"Dialog\","+
                            "Font.PLAIN,"+
                            passwordfield.getFont().getSize()
                            +"));");

            main_code_2.add("\t\t"+Center_panel.passwordfield_names.get(i)+".setHorizontalAlignment(JPasswordField.CENTER);");
            
            if(passwordfield.getBorder()!=null){main_code_2.add("\t\t"+Center_panel.passwordfield_names.get(i)+".setBorder(BorderFactory.createLineBorder(Color.BLACK,1));");}
            else{main_code_2.add("\t\t"+Center_panel.passwordfield_names.get(i)+".setBorder(null);");}

            main_code_2.add("\t\t"+Right_panel.panel_name_textfield.getText()+".add("+Center_panel.passwordfield_names.get(i)+");");

            main_code_2.add("");
        }

        //add textareas
        JTextArea textarea;
        for(int i=0;i<Center_panel.list_textarea.size();i++){
            
            textarea = Center_panel.list_textarea.get(i);
            
            main_code_1.add("\tpublic static JTextArea "+Center_panel.textarea_names.get(i)+" = new JTextArea();");
            main_code_2.add("\t\t"+Center_panel.textarea_names.get(i)+".setBounds("+
                            "(int)(WIDTH*"+((float)(2*textarea.getX())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*textarea.getY())/(float)Interface.HEIGHT)+"),"+
                            "(int)(WIDTH*"+((float)(2*textarea.getWidth())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*textarea.getHeight())/(float)Interface.HEIGHT)+")"+
                            ");");
            
            main_code_2.add("\t\t"+Center_panel.textarea_names.get(i)+".setText(\""+textarea.getText()+"\");");
            
            main_code_2.add("\t\t"+Center_panel.textarea_names.get(i)+".setOpaque(true);\n"+"\t\t"+Center_panel.textarea_names.get(i)+".setBackground(new Color("+textarea.getBackground().getRed()+","+textarea.getBackground().getGreen()+","+textarea.getBackground().getBlue()+"));");
            main_code_2.add("\t\t"+Center_panel.textarea_names.get(i)+".setForeground(new Color("+textarea.getForeground().getRed()+","+textarea.getForeground().getGreen()+","+textarea.getForeground().getBlue()+"));");

            main_code_2.add("\t\t"+Center_panel.textarea_names.get(i)+".setFont(new Font("+
                            "\""+textarea.getFont().getFamily()+"\","+
                            "Font.PLAIN,"+
                            textarea.getFont().getSize()
                            +"));");

            if(textarea.getBorder()!=null){main_code_2.add("\t\t"+Center_panel.textarea_names.get(i)+".setBorder(BorderFactory.createLineBorder(Color.BLACK,1));");}
            else{main_code_2.add("\t\t"+Center_panel.textarea_names.get(i)+".setBorder(null);");}

            if(textarea.isEditable()){main_code_2.add("\t\t"+Center_panel.textarea_names.get(i)+".setEditable(true);");}
            else{main_code_2.add("\t\t"+Center_panel.textarea_names.get(i)+".setEditable(false);");}

            main_code_2.add("\t\t"+Right_panel.panel_name_textfield.getText()+".add("+Center_panel.textarea_names.get(i)+");");

            main_code_2.add("");
        }

        //add scrollpanes
        JPanel scrollpane_panel;
        JTextArea scrollpane_textarea;
        for(int i=0;i<Center_panel.list_scrollpane.size();i++){
            
            scrollpane_panel = Center_panel.list_scrollpane.get(i);
            scrollpane_textarea = Center_panel.list_scrollpane_textarea.get(i);
            
            main_code_1.add("\tpublic static JPanel "+Center_panel.scrollpane_names.get(i)+" = new JPanel();");

            main_code_2.add("\t\tJPanel "+Center_panel.scrollpane_names.get(i)+" = new JPanel();");
            main_code_2.add("\t\tJTextArea scrollpane_textarea"+i+" = new JTextArea();");
            main_code_2.add("\t\tJScrollPane scrollpane"+i+" = new JScrollPane(scrollpane_textarea"+i+");");
            main_code_2.add("\t\tscrollpane"+i+".setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);");
            
            main_code_2.add("\t\t"+Center_panel.scrollpane_names.get(i)+".setBounds("+
                            "(int)(WIDTH*"+((float)(2*scrollpane_panel.getX())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*scrollpane_panel.getY())/(float)Interface.HEIGHT)+"),"+
                            "(int)(WIDTH*"+((float)(2*scrollpane_panel.getWidth())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*scrollpane_panel.getHeight())/(float)Interface.HEIGHT)+")"+
                            ");");

            main_code_2.add("\t\tscrollpane_textarea"+i+".setRows("+scrollpane_textarea.getRows()+");");
            main_code_2.add("\t\tscrollpane_textarea"+i+".setColumns("+scrollpane_textarea.getColumns()+");");
                            
            main_code_2.add("\t\tscrollpane_textarea"+i+".setText(\""+scrollpane_textarea.getText()+"\");");
            
            if(scrollpane_panel.isOpaque()){main_code_2.add("\t\t"+Center_panel.scrollpane_names.get(i)+".setOpaque(true);\n"+"\t\t"+Center_panel.scrollpane_names.get(i)+".setBackground(new Color("+scrollpane_panel.getBackground().getRed()+","+scrollpane_panel.getBackground().getGreen()+","+scrollpane_panel.getBackground().getBlue()+"));");}
            else{main_code_2.add("\t\t"+Center_panel.scrollpane_names.get(i)+".setOpaque(true);\n"+"\t\t"+Center_panel.scrollpane_names.get(i)+".setBackground(new Color(0,0,0,64));");}

            main_code_2.add("\t\tscrollpane_textarea"+i+".setOpaque(true);");
            main_code_2.add("\t\tscrollpane_textarea"+i+".setBackground(new Color("+scrollpane_textarea.getBackground().getRed()+","+scrollpane_textarea.getBackground().getGreen()+","+scrollpane_textarea.getBackground().getBlue()+"));");
            main_code_2.add("\t\tscrollpane_textarea"+i+".setForeground(new Color("+scrollpane_textarea.getForeground().getRed()+","+scrollpane_textarea.getForeground().getGreen()+","+scrollpane_textarea.getForeground().getBlue()+"));");

            main_code_2.add("\t\tscrollpane_textarea"+i+".setFont(new Font("+
                            "\""+scrollpane_textarea.getFont().getFamily()+"\","+
                            "Font.PLAIN,"+
                            scrollpane_textarea.getFont().getSize()
                            +"));");
            
            if(scrollpane_textarea.getBorder()!=null){main_code_2.add("\t\tscrollpane_textarea"+i+".setBorder(BorderFactory.createLineBorder(Color.BLACK,1));");}
            else{main_code_2.add("\t\tscrollpane_textarea"+i+".setBorder(null);");}

            if(scrollpane_textarea.isEditable()){main_code_2.add("\t\tscrollpane_textarea"+i+".setEditable(true);");}
            else{main_code_2.add("\t\tscrollpane_textarea"+i+".setEditable(false);");}



            main_code_2.add("\t\t"+Center_panel.scrollpane_names.get(i)+".add(scrollpane"+i+");");
            main_code_2.add("\t\t"+Right_panel.panel_name_textfield.getText()+".add("+Center_panel.scrollpane_names.get(i)+");");

            main_code_2.add("");
        }

        //add buttons
        JButton button;
        for(int i=0;i<Center_panel.list_button.size();i++){
            
            button = Center_panel.list_button.get(i);
            
            main_code_1.add("\tpublic static JButton "+Center_panel.button_names.get(i)+" = new JButton();");
            main_code_2.add("\t\t"+Center_panel.button_names.get(i)+".setBounds("+
                            "(int)(WIDTH*"+((float)(2*button.getX())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*button.getY())/(float)Interface.HEIGHT)+"),"+
                            "(int)(WIDTH*"+((float)(2*button.getWidth())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*button.getHeight())/(float)Interface.HEIGHT)+")"+
                            ");");
            
            main_code_2.add("\t\t"+Center_panel.button_names.get(i)+".setText(\""+button.getText()+"\");");
            
            main_code_2.add("\t\t"+Center_panel.button_names.get(i)+".setBackground(new Color("+button.getBackground().getRed()+","+button.getBackground().getGreen()+","+button.getBackground().getBlue()+"));");
            main_code_2.add("\t\t"+Center_panel.button_names.get(i)+".setForeground(new Color("+button.getForeground().getRed()+","+button.getForeground().getGreen()+","+button.getForeground().getBlue()+"));");

            main_code_2.add("\t\t"+Center_panel.button_names.get(i)+".setFont(new Font("+
                            "\""+button.getFont().getFamily()+"\","+
                            "Font.PLAIN,"+
                            button.getFont().getSize()
                            +"));");

            main_code_2.add("\t\t"+Center_panel.button_names.get(i)+".setHorizontalAlignment(JButton.CENTER);");
            
            if(button.getBorder()!=null){main_code_2.add("\t\t"+Center_panel.button_names.get(i)+".setBorder(BorderFactory.createLineBorder(Color.BLACK,1));");}
            else{main_code_2.add("\t\t"+Center_panel.button_names.get(i)+".setBorder(null);");}

            main_code_2.add("\t\t\\\\"+Center_panel.button_names.get(i)+".addActionListener(this);");

            main_code_2.add("\t\t"+Right_panel.panel_name_textfield.getText()+".add("+Center_panel.button_names.get(i)+");");

            main_code_2.add("");
        }

        //add comboboxes
        JComboBox<String> combobox;
        for(int i=0;i<Center_panel.list_combobox.size();i++){
            
            combobox = Center_panel.list_combobox.get(i);
                   
            String items = new String();
            for(int index=0;index<combobox.getItemCount();index++){
                if(index!=0){items+=",\"";}
                else{items+="\"";}
                items+=combobox.getItemAt(index);
                items+="\"";
            }
            main_code_1.add("\tpublic static JComboBox<String> "+Center_panel.combobox_names.get(i)+" = new JComboBox<String>(new String[]{"+items+"});");

            main_code_2.add("\t\t"+Center_panel.combobox_names.get(i)+".setBounds("+
                            "(int)(WIDTH*"+((float)(2*combobox.getX())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*combobox.getY())/(float)Interface.HEIGHT)+"),"+
                            "(int)(WIDTH*"+((float)(2*combobox.getWidth())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*combobox.getHeight())/(float)Interface.HEIGHT)+")"+
                            ");");
            
            main_code_2.add("\t\t"+Center_panel.combobox_names.get(i)+".setOpaque(true);\n"+"\t\t"+Center_panel.combobox_names.get(i)+".setBackground(new Color("+combobox.getBackground().getRed()+","+combobox.getBackground().getGreen()+","+combobox.getBackground().getBlue()+"));");
            main_code_2.add("\t\t"+Center_panel.combobox_names.get(i)+".setForeground(new Color("+combobox.getForeground().getRed()+","+combobox.getForeground().getGreen()+","+combobox.getForeground().getBlue()+"));");

            main_code_2.add("\t\t"+Center_panel.combobox_names.get(i)+".setFont(new Font("+
                            "\""+combobox.getFont().getFamily()+"\","+
                            "Font.PLAIN,"+
                            combobox.getFont().getSize()
                            +"));");

            main_code_2.add("\t\t"+Center_panel.combobox_names.get(i)+".setAlignmentX(JComboBox.CENTER_ALIGNMENT);");
            main_code_2.add("\t\t"+Center_panel.combobox_names.get(i)+".setMaximumRowCount("+combobox.getMaximumRowCount()+");");
            main_code_2.add("\t\t"+Center_panel.combobox_names.get(i)+".setSelectedIndex("+combobox.getSelectedIndex()+");");

            main_code_2.add("\t\tDefaultListCellRenderer dlcr"+i+" = new DefaultListCellRenderer();");
            main_code_2.add("\t\tdlcr"+i+".setHorizontalAlignment(DefaultListCellRenderer.CENTER);");
            main_code_2.add("\t\t"+Center_panel.combobox_names.get(i)+".setRenderer(dlcr"+i+");");
            
            main_code_2.add("\t\t"+Right_panel.panel_name_textfield.getText()+".add("+Center_panel.combobox_names.get(i)+");");

            main_code_2.add("");
        }

        //add radiobutton
        ArrayList<String> buttongroups_already_declared = new ArrayList<String>();
        for(int i=0;i<Center_panel.buttongroup_names.size();i++){
            if(!buttongroups_already_declared.contains(Center_panel.buttongroup_names.get(i))){
                main_code_1.add("\tpublic static ButtonGroup "+Center_panel.buttongroup_names.get(i)+" = new ButtonGroup();");
                buttongroups_already_declared.add(Center_panel.buttongroup_names.get(i));
            }
        }
        JRadioButton radiobutton;
        for(int i=0;i<Center_panel.list_radiobutton.size();i++){
            
            radiobutton = Center_panel.list_radiobutton.get(i);
            
            main_code_1.add("\tpublic static JRadioButton "+Center_panel.radiobutton_names.get(i)+" = new JRadioButton();");
            main_code_2.add("\t\t"+Center_panel.radiobutton_names.get(i)+".setBounds("+
                            "(int)(WIDTH*"+((float)(2*radiobutton.getX())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*radiobutton.getY())/(float)Interface.HEIGHT)+"),"+
                            "(int)(WIDTH*"+((float)(2*radiobutton.getWidth())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*radiobutton.getHeight())/(float)Interface.HEIGHT)+")"+
                            ");");
            
            main_code_2.add("\t\t"+Center_panel.radiobutton_names.get(i)+".setText(\""+radiobutton.getText()+"\");");
            
            if(radiobutton.isOpaque()){main_code_2.add("\t\t"+Center_panel.radiobutton_names.get(i)+".setOpaque(true);\n"+"\t\t"+Center_panel.radiobutton_names.get(i)+".setBackground(new Color("+radiobutton.getBackground().getRed()+","+radiobutton.getBackground().getGreen()+","+radiobutton.getBackground().getBlue()+"));");}
            else{main_code_2.add("\t\t"+Center_panel.radiobutton_names.get(i)+".setOpaque(true);\n"+"\t\t"+Center_panel.radiobutton_names.get(i)+".setBackground(new Color(0,0,0,64));");}
            main_code_2.add("\t\t"+Center_panel.radiobutton_names.get(i)+".setForeground(new Color("+radiobutton.getForeground().getRed()+","+radiobutton.getForeground().getGreen()+","+radiobutton.getForeground().getBlue()+"));");

            main_code_2.add("\t\t"+Center_panel.radiobutton_names.get(i)+".setFont(new Font("+
                            "\""+radiobutton.getFont().getFamily()+"\","+
                            "Font.PLAIN,"+
                            radiobutton.getFont().getSize()
                            +"));");

            main_code_2.add("\t\t"+Center_panel.radiobutton_names.get(i)+".setActionCommand("+Center_panel.radiobutton_names.get(i)+".getText());");

            main_code_2.add("\t\t"+Center_panel.buttongroup_names.get(i)+".add("+Center_panel.radiobutton_names.get(i)+");");

            main_code_2.add("\t\t"+Center_panel.radiobutton_names.get(i)+".setHorizontalAlignment(JRadioButton.CENTER);");
                
            main_code_2.add("\t\t"+Right_panel.panel_name_textfield.getText()+".add("+Center_panel.radiobutton_names.get(i)+");");

            main_code_2.add("");
        }

        //add images
        JLabel image;
        for(int i=0;i<Center_panel.list_image.size();i++){
            
            image = Center_panel.list_image.get(i);
            
            main_code_1.add("\tpublic static JLabel "+Center_panel.image_names.get(i)+" = new JLabel();");
            main_code_2.add("\t\t"+Center_panel.image_names.get(i)+".setBounds("+
                            "(int)(WIDTH*"+((float)(2*image.getX())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*image.getY())/(float)Interface.HEIGHT)+"),"+
                            "(int)(WIDTH*"+((float)(2*image.getWidth())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*image.getHeight())/(float)Interface.HEIGHT)+")"+
                            ");");

            main_code_2.add("\t\ttry{");
            main_code_2.add("\t\t\tBufferedImage originalImage = ImageIO.read(new File(\""+Center_panel.sources_names.get(i)+"\"));");
            main_code_2.add("\t\t\tBufferedImage resizedImage = new BufferedImage("+2*image.getWidth()+","+2*image.getHeight()+",BufferedImage.TYPE_INT_RGB);");
            main_code_2.add("\t\t\tGraphics2D graphics2d = resizedImage.createGraphics();");
            main_code_2.add("\t\t\tgraphics2d.drawImage(originalImage,0,0,"+"(int)(WIDTH*"+((float)(2*image.getWidth())/(float)Interface.WIDTH)+"),"+"(int)(HEIGHT*"+((float)(2*image.getHeight())/(float)Interface.HEIGHT)+"),null);");
            main_code_2.add("\t\t\tgraphics2d.dispose();");
            //main_code_2.add("\t\t"+Center_panel.image_names.get(i)+".setIcon(new ImageIcon("+Center_panel.sources_names.get(i)+"));");
            main_code_2.add("\t\t\t"+Center_panel.image_names.get(i)+".setIcon(new ImageIcon((Image)resizedImage));");  
            main_code_2.add("\t\t}catch(Exception exception_resized){exception_resized.printStackTrace();}");

            main_code_2.add("\t\t"+Right_panel.panel_name_textfield.getText()+".add("+Center_panel.image_names.get(i)+");");

            main_code_2.add("");
        }

        //add bars
        JProgressBar bar;
        for(int i=0;i<Center_panel.list_bar.size();i++){
            
            bar = Center_panel.list_bar.get(i);
            
            main_code_1.add("\tpublic static JProgressBar "+Center_panel.bar_names.get(i)+" = new JProgressBar();");
            main_code_2.add("\t\t"+Center_panel.bar_names.get(i)+".setBounds("+
                            "(int)(WIDTH*"+((float)(2*bar.getX())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*bar.getY())/(float)Interface.HEIGHT)+"),"+
                            "(int)(WIDTH*"+((float)(2*bar.getWidth())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*bar.getHeight())/(float)Interface.HEIGHT)+")"+
                            ");");
                        
            main_code_2.add("\t\t"+Center_panel.bar_names.get(i)+".setOpaque(true);\n"+"\t\t"+Center_panel.bar_names.get(i)+".setBackground(new Color("+bar.getBackground().getRed()+","+bar.getBackground().getGreen()+","+bar.getBackground().getBlue()+"));");
            main_code_2.add("\t\t"+Center_panel.bar_names.get(i)+".setForeground(new Color("+bar.getForeground().getRed()+","+bar.getForeground().getGreen()+","+bar.getForeground().getBlue()+"));");

            main_code_2.add("\t\t"+Center_panel.bar_names.get(i)+".setFont(new Font("+
                            "\""+bar.getFont().getFamily()+"\","+
                            "Font.PLAIN,"+
                            bar.getFont().getSize()
                            +"));");

            main_code_2.add("\t\t"+Center_panel.bar_names.get(i)+".setMaximum("+bar.getMaximum()+");");
            main_code_2.add("\t\t"+Center_panel.bar_names.get(i)+".setMinimum("+bar.getMinimum()+");");
            main_code_2.add("\t\t"+Center_panel.bar_names.get(i)+".setValue("+bar.getValue()+");");
            
            main_code_2.add("\t\t"+Right_panel.panel_name_textfield.getText()+".add("+Center_panel.bar_names.get(i)+");");

            main_code_2.add("");
        }

        //add checkboxes
        JCheckBox checkbox;
        for(int i=0;i<Center_panel.list_checkbox.size();i++){
            
            checkbox = Center_panel.list_checkbox.get(i);
            
            main_code_1.add("\tpublic static JCheckBox "+Center_panel.checkbox_names.get(i)+" = new JCheckBox();");
            main_code_2.add("\t\t"+Center_panel.checkbox_names.get(i)+".setBounds("+
                            "(int)(WIDTH*"+((float)(2*checkbox.getX())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*checkbox.getY())/(float)Interface.HEIGHT)+"),"+
                            "(int)(WIDTH*"+((float)(2*checkbox.getWidth())/(float)Interface.WIDTH)+"),"+
                            "(int)(HEIGHT*"+((float)(2*checkbox.getHeight())/(float)Interface.HEIGHT)+")"+
                            ");");
            
            main_code_2.add("\t\t"+Center_panel.checkbox_names.get(i)+".setText(\""+checkbox.getText()+"\");");
            
            if(checkbox.isOpaque()){main_code_2.add("\t\t"+Center_panel.checkbox_names.get(i)+".setOpaque(true);\n"+"\t\t"+Center_panel.checkbox_names.get(i)+".setBackground(new Color("+checkbox.getBackground().getRed()+","+checkbox.getBackground().getGreen()+","+checkbox.getBackground().getBlue()+"));");}
            else{main_code_2.add("\t\t"+Center_panel.checkbox_names.get(i)+".setOpaque(true);\n"+"\t\t"+Center_panel.checkbox_names.get(i)+".setBackground(new Color(0,0,0,64));");}
            main_code_2.add("\t\t"+Center_panel.checkbox_names.get(i)+".setForeground(new Color("+checkbox.getForeground().getRed()+","+checkbox.getForeground().getGreen()+","+checkbox.getForeground().getBlue()+"));");

            main_code_2.add("\t\t"+Center_panel.checkbox_names.get(i)+".setFont(new Font("+
                            "\""+checkbox.getFont().getFamily()+"\","+
                            "Font.PLAIN,"+
                            checkbox.getFont().getSize()
                            +"));");

            main_code_2.add("\t\t"+Center_panel.checkbox_names.get(i)+".setHorizontalAlignment(JCheckBox.CENTER);");
                
            if(checkbox.isSelected()){main_code_2.add("\t\t"+Center_panel.checkbox_names.get(i)+".setSelected(true);");}
            else{main_code_2.add("\t\t"+Center_panel.checkbox_names.get(i)+".setSelected(false);");}

            main_code_2.add("\t\t"+Right_panel.panel_name_textfield.getText()+".add("+Center_panel.checkbox_names.get(i)+");");

            main_code_2.add("");
        }

        main_code_2.add("\t\treturn "+Right_panel.panel_name_textfield.getText()+";");
        main_code_2.add("\t}\n\n}");

        List<String> all_lines = new ArrayList<String>();
        for(String string : imports){
            all_lines.add(string);
        }
        for(String string : main_code_1){
            all_lines.add(string);
        }
        for(String string : main_code_2){
            all_lines.add(string);
        }

        File file = Toolbox.implements_folderchooser("Select folder");
        write_file(file.toString()+"\\"+Right_panel.panel_name_textfield.getText()+"_panel.java",all_lines);

    }

    //check if the string only contains numbers
    public static boolean only_numbers(String str){
        boolean only=true;
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){only=false;}
        }
        return only;
    }

}