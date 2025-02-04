import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemListener;

import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Toolbox{

    public static void implements_frame(JFrame frame_name, boolean setVisible, int setDefaultCloseOperation, int width, int height){
        frame_name.setDefaultCloseOperation(setDefaultCloseOperation);
        frame_name.setVisible(true);
        frame_name.setSize(width,height);
    }

    public static void edit_frame(JFrame frame_name, String title, Color back){
        frame_name.setTitle(title);
        if(back!=null){frame_name.getContentPane().setBackground(back);}
    }

    public static void implements_panel(JPanel panel_name, JFrame panel_frame, int x, int y, int width, int height){

        panel_name.setBounds(x,y,width,height);
        panel_name.setLayout(null);
        
        panel_frame.add(panel_name);
        
    }

    public static void implements_panel_in_a_panel(JPanel panel_name, JPanel parent_panel, int x, int y, int width, int height){

        panel_name.setBounds(x,y,width,height);
        panel_name.setLayout(null);
        
        parent_panel.add(panel_name);
        
    }

    public static void edit_panel(JPanel panel_name, boolean transparent, Color back){
        if(transparent){panel_name.setOpaque(false); panel_name.setBackground(new Color(0,0,0,64));}
        else{panel_name.setOpaque(true); panel_name.setBackground(back);}
    }

    public static void implements_label(JLabel label_name, String label_text, boolean border, int x, int y, int width, int height, JPanel label_panel){

        label_name.setText(label_text);
        label_name.setBounds(x, y, width, height);
        if(border==false){label_name.setBorder(null);}
        else{label_name.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));}
        label_name.setHorizontalAlignment(JLabel.CENTER);
        
        label_panel.add(label_name);

    }
    
    public static void edit_label(JLabel label_name, Font f, Color back, Color fore){
        if(f!=null){label_name.setFont(f);}
        if(back!=null){label_name.setOpaque(true);label_name.setBackground(back);}
        if(fore!=null){label_name.setForeground(fore);}
    }

    public static void implements_textfield(JTextField textfield_name, String textfield_text, int x, int y, int width, int height, boolean editable, boolean border, JPanel textfield_panel){

        textfield_name.setBounds(x, y, width, height);
        textfield_name.setEditable(editable);
        textfield_name.setText(textfield_text);
        if(border==false){textfield_name.setBorder(null);}
        textfield_name.setHorizontalAlignment(JTextField.LEFT);

        textfield_panel.add(textfield_name);

    }

    public static void edit_textfield(JTextField textfield_name, Font f, Color back, Color fore){
        if(f!=null){textfield_name.setFont(f);}
        if(back!=null){textfield_name.setBackground(back);}
        if(fore!=null){textfield_name.setForeground(fore);}
    }

    public static void implements_textarea(JTextArea textarea_name, String textarea_text, int x, int y, int width, int height, boolean editable, boolean border, JPanel textarea_panel){

        textarea_name.setText(textarea_text);
        textarea_name.setBounds(x, y, width, height);
        textarea_name.setEditable(editable);
        if(border==false){textarea_name.setBorder(null);}
    
        textarea_panel.add(textarea_name);

    }

    public static void edit_textarea(JTextArea textarea_name, Font f, Color back, Color fore){
        if(f!=null){textarea_name.setFont(f);}
        if(back!=null){textarea_name.setBackground(back);}
        if(fore!=null){textarea_name.setForeground(fore);}
    }

    public static void implements_button(JButton button_name, String button_text, int x, int y, int width, int height, JPanel button_panel){
        
        button_name.setText(button_text);
        button_name.setBounds(x,y,width,height);

        button_panel.add(button_name);

    }

    public static void edit_button(JButton button_name, Font f, Color back, Color fore){
        if(f!=null){button_name.setFont(f);}
        if(back!=null){button_name.setBackground(back);}
        if(fore!=null){button_name.setForeground(fore);}
    }

    public static void implements_combobox(JComboBox<String> combobox_name, ItemListener il, int x, int y, int width, int height, int rows_displayed_at_once, int initial_item, JPanel combobox_panel){
    
        combobox_name.setMaximumRowCount(rows_displayed_at_once);
        combobox_name.setEditable(false);
        combobox_name.setBounds(x,y,width,height);
        combobox_name.setAlignmentX(JComboBox.CENTER_ALIGNMENT);
        if(il!=null){combobox_name.addItemListener(il);}
        combobox_name.setSelectedIndex(initial_item);
        
        DefaultListCellRenderer dlcr = new DefaultListCellRenderer();
        dlcr.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
        combobox_name.setRenderer(dlcr);
        
        combobox_panel.add(combobox_name);
        
    }

    public static void edit_combobox(JComboBox<String> combobox_name, Font f, Color back, Color fore){
        if(f!=null){combobox_name.setFont(f);}
        if(back!=null){combobox_name.setBackground(back);}
        if(fore!=null){combobox_name.setForeground(fore);}
    }
   
    public static void implements_checkbox(JCheckBox checkbox_name, String checkbox_text, int x, int y, int width, int height, boolean selected, JPanel checkbox_panel){
        checkbox_name.setText(checkbox_text);
        checkbox_name.setBounds(x, y, width, height);
        checkbox_name.setSelected(selected);
        checkbox_panel.add(checkbox_name);
    }

    public static void edit_checkbox(JCheckBox checkbox_name, Font font, Color back, Color fore){
        if(font!=null){checkbox_name.setFont(font);}
        if(back!=null){checkbox_name.setBackground(back);}
        if(fore!=null){checkbox_name.setForeground(fore);}
    }

    public static File implements_folderchooser(String title){
        
        JFileChooser j = new JFileChooser();
        j.setDialogTitle(title);
        j.setAcceptAllFileFilterUsed(false);
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        j.showOpenDialog(null);
    
        return j.getSelectedFile();
    
    }

    public static void error_message(String message, String title){
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
    }

}