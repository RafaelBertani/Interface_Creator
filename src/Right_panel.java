import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.tools.Tool;

public class Right_panel extends JFrame implements ActionListener{
    
    public static JPanel right = new JPanel();

    private static int PANEL_WIDTH=-1;
    private static int PANEL_HEIGHT=-1;

    private JButton background_color = new JButton();
    
    private JButton add_label = new JButton();
    private JButton add_textfield = new JButton();
    private JButton add_passwordfield = new JButton();
    private JButton add_textarea = new JButton();
    private JButton add_scrollpane = new JButton();
    private JButton add_button = new JButton();
    private JButton add_combobox = new JButton();
    private JButton add_radiobutton = new JButton();
    private JButton add_table = new JButton();
    private JButton add_image = new JButton();
    //private JButton add_drag_drop = new JButton();
    private JButton add_bar = new JButton();
    private JButton add_checkbox = new JButton();

    private JPanel details = new JPanel();
    private JButton add_item = new JButton();

    public JPanel return_Right_panel(int PANEL_WIDTH, int PANEL_HEIGHT){

        Right_panel.PANEL_WIDTH=PANEL_WIDTH;
        Right_panel.PANEL_HEIGHT=PANEL_HEIGHT;

        JLabel title = new JLabel();
        Toolbox.implementa_label(title,"Edit panel",false,0,0,3*PANEL_WIDTH/10,PANEL_HEIGHT/20,right);
        Toolbox.edita_label(title,new Font("Dialog",Font.PLAIN,16),null,Color.WHITE);


        JLabel panel_name = new JLabel();
        Toolbox.implementa_label(panel_name,"Panel_name:",false,PANEL_WIDTH/25,PANEL_HEIGHT/15,PANEL_WIDTH/10,PANEL_HEIGHT/25,right);
        Toolbox.edita_label(panel_name,new Font("Dialog",Font.PLAIN,14),null,Color.WHITE);

        JTextField panel_name_textfield = new JTextField();
        Toolbox.implementa_textfield(panel_name_textfield,"",7*PANEL_WIDTH/50,PANEL_HEIGHT/15,1*PANEL_WIDTH/10,PANEL_HEIGHT/25,true,true,right);
        Toolbox.edita_textfield(panel_name_textfield,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE,null,null);


        JLabel width = new JLabel();
        Toolbox.implementa_label(width,"Width:",false,0,2*PANEL_HEIGHT/15,PANEL_WIDTH/20,PANEL_HEIGHT/25,right);
        Toolbox.edita_label(width,new Font("Dialog",Font.PLAIN,14),null,Color.WHITE);
        JComboBox width_combobox = new JComboBox();
        width_combobox=new JComboBox(new String[]{"0%","1%","2%","3%","4%","5%","6%","7%","8%","9%","10%","11%","12%","13%","14%","15%","16%","17%","18%","19%","20%","21%","22%","23%","24%","25%","26%","27%","28%","29%","30%","31%","32%","33%","34%","35%","36%","37%","38%","39%","40%","41%","42%","43%","44%","45%","46%","47%","48%","49%","50%","51%","52%","53%","54%","55%","56%","57%","58%","59%","60%","61%","62%","63%","64%","65%","66%","67%","68%","69%","70%","71%","72%","73%","74%","75%","76%","77%","78%","79%","80%","81%","82%","83%","84%","85%","86%","87%","88%","89%","90%","91%","92%","93%","94%","95%","96%","97%","98%","99%","100%"});
        Toolbox.implementa_combobox(width_combobox,null,PANEL_WIDTH/20,2*PANEL_HEIGHT/15,PANEL_WIDTH/20,PANEL_HEIGHT/25,10,100,right);
        Toolbox.edita_combobox(width_combobox,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);


        JLabel height = new JLabel();
        Toolbox.implementa_label(height,"Height:",false,PANEL_WIDTH/9,2*PANEL_HEIGHT/15,PANEL_WIDTH/20,PANEL_HEIGHT/25,right);
        Toolbox.edita_label(height,new Font("Dialog",Font.PLAIN,14),null,Color.WHITE);
        JComboBox height_combobox = new JComboBox();
        height_combobox=new JComboBox(new String[]{"0%","1%","2%","3%","4%","5%","6%","7%","8%","9%","10%","11%","12%","13%","14%","15%","16%","17%","18%","19%","20%","21%","22%","23%","24%","25%","26%","27%","28%","29%","30%","31%","32%","33%","34%","35%","36%","37%","38%","39%","40%","41%","42%","43%","44%","45%","46%","47%","48%","49%","50%","51%","52%","53%","54%","55%","56%","57%","58%","59%","60%","61%","62%","63%","64%","65%","66%","67%","68%","69%","70%","71%","72%","73%","74%","75%","76%","77%","78%","79%","80%","81%","82%","83%","84%","85%","86%","87%","88%","89%","90%","91%","92%","93%","94%","95%","96%","97%","98%","99%","100%"});
        Toolbox.implementa_combobox(height_combobox,null,PANEL_WIDTH/9+PANEL_WIDTH/20,2*PANEL_HEIGHT/15,PANEL_WIDTH/20,PANEL_HEIGHT/25,10,100,right);
        Toolbox.edita_combobox(height_combobox,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);


        JLabel x = new JLabel();
        Toolbox.implementa_label(x,"X:",false,0,2*PANEL_HEIGHT/15+PANEL_HEIGHT/20,PANEL_WIDTH/20,PANEL_HEIGHT/25,right);
        Toolbox.edita_label(x,new Font("Dialog",Font.PLAIN,14),null,Color.WHITE);
        JComboBox x_combobox = new JComboBox();
        x_combobox=new JComboBox(new String[]{"0%","1%","2%","3%","4%","5%","6%","7%","8%","9%","10%","11%","12%","13%","14%","15%","16%","17%","18%","19%","20%","21%","22%","23%","24%","25%","26%","27%","28%","29%","30%","31%","32%","33%","34%","35%","36%","37%","38%","39%","40%","41%","42%","43%","44%","45%","46%","47%","48%","49%","50%","51%","52%","53%","54%","55%","56%","57%","58%","59%","60%","61%","62%","63%","64%","65%","66%","67%","68%","69%","70%","71%","72%","73%","74%","75%","76%","77%","78%","79%","80%","81%","82%","83%","84%","85%","86%","87%","88%","89%","90%","91%","92%","93%","94%","95%","96%","97%","98%","99%","100%"});
        Toolbox.implementa_combobox(x_combobox,null,PANEL_WIDTH/20,2*PANEL_HEIGHT/15+PANEL_HEIGHT/20,PANEL_WIDTH/20,PANEL_HEIGHT/25,10,100,right);
        Toolbox.edita_combobox(x_combobox,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);

        
        JLabel y = new JLabel();
        Toolbox.implementa_label(y,"Y:",false,PANEL_WIDTH/9,2*PANEL_HEIGHT/15+PANEL_HEIGHT/20,PANEL_WIDTH/20,PANEL_HEIGHT/25,right);
        Toolbox.edita_label(y,new Font("Dialog",Font.PLAIN,14),null,Color.WHITE);
        JComboBox y_combobox = new JComboBox();
        y_combobox=new JComboBox(new String[]{"0%","1%","2%","3%","4%","5%","6%","7%","8%","9%","10%","11%","12%","13%","14%","15%","16%","17%","18%","19%","20%","21%","22%","23%","24%","25%","26%","27%","28%","29%","30%","31%","32%","33%","34%","35%","36%","37%","38%","39%","40%","41%","42%","43%","44%","45%","46%","47%","48%","49%","50%","51%","52%","53%","54%","55%","56%","57%","58%","59%","60%","61%","62%","63%","64%","65%","66%","67%","68%","69%","70%","71%","72%","73%","74%","75%","76%","77%","78%","79%","80%","81%","82%","83%","84%","85%","86%","87%","88%","89%","90%","91%","92%","93%","94%","95%","96%","97%","98%","99%","100%"});
        Toolbox.implementa_combobox(y_combobox,null,PANEL_WIDTH/9+PANEL_WIDTH/20,2*PANEL_HEIGHT/15+PANEL_HEIGHT/20,PANEL_WIDTH/20,PANEL_HEIGHT/25,10,100,right);
        Toolbox.edita_combobox(y_combobox,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        

        JCheckBox opaque = new JCheckBox();
        Toolbox.implementa_checkbox(opaque,"Opaque",PANEL_WIDTH/5+PANEL_WIDTH/25,2*PANEL_HEIGHT/15,PANEL_WIDTH/20,PANEL_HEIGHT/25,false,right);
        Toolbox.edita_checkbox(opaque,new Font("Dialog",Font.PLAIN,12),new Color(32,32,32),Color.WHITE);

        
        Toolbox.implementa_button(background_color,"Color",PANEL_WIDTH/5+PANEL_WIDTH/25,2*PANEL_HEIGHT/15+PANEL_HEIGHT/20,PANEL_WIDTH/20,PANEL_HEIGHT/25,right);
        Toolbox.edita_button(background_color,new Font("Dialog",Font.PLAIN,12),new Color(238,238,238),Color.BLACK);
        background_color.addActionListener(this);


        JLabel advice = new JLabel();
        Toolbox.implementa_label(advice,"(Percentages refer to screen size.)",false,0,2*PANEL_HEIGHT/15+PANEL_HEIGHT/10,3*PANEL_WIDTH/10,PANEL_HEIGHT/20,right);
        Toolbox.edita_label(advice,new Font("Dialog",Font.PLAIN,12),null,Color.WHITE);


        JLabel add_to_panel = new JLabel();
        Toolbox.implementa_label(add_to_panel,"Add to the panel:",false,0,2*PANEL_HEIGHT/15+PANEL_HEIGHT/10+PANEL_HEIGHT/20,3*PANEL_WIDTH/10,PANEL_HEIGHT/20,right);
        Toolbox.edita_label(add_to_panel,new Font("Dialog",Font.PLAIN,16),null,Color.WHITE);


        Toolbox.implementa_button(add_label,"Label",15*PANEL_WIDTH/1000,PANEL_HEIGHT/3,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edita_button(add_label,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_label.addActionListener(this);

        Toolbox.implementa_button(add_textfield,"Textfield",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edita_button(add_textfield,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_textfield.addActionListener(this);

        Toolbox.implementa_button(add_passwordfield,"Passwordfield",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edita_button(add_passwordfield,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_passwordfield.addActionListener(this);

        Toolbox.implementa_button(add_textarea,"Textarea",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edita_button(add_textarea,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_textarea.addActionListener(this);

        Toolbox.implementa_button(add_scrollpane,"ScrollPane",15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+PANEL_HEIGHT/30,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edita_button(add_scrollpane,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_scrollpane.addActionListener(this);

        Toolbox.implementa_button(add_button,"Button",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3+PANEL_HEIGHT/30,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edita_button(add_button,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_button.addActionListener(this);

        Toolbox.implementa_button(add_combobox,"Combobox",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3+PANEL_HEIGHT/30,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edita_button(add_combobox,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_combobox.addActionListener(this);

        Toolbox.implementa_button(add_radiobutton,"Radiobuttons",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3+PANEL_HEIGHT/30,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edita_button(add_radiobutton,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_radiobutton.addActionListener(this);

        Toolbox.implementa_button(add_table,"Table",15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+PANEL_HEIGHT/15,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edita_button(add_table,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_table.addActionListener(this);

        Toolbox.implementa_button(add_image,"Image",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3+PANEL_HEIGHT/15,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edita_button(add_image,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_image.addActionListener(this);

        Toolbox.implementa_button(add_bar,"Bar",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3+PANEL_HEIGHT/15,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edita_button(add_bar,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_bar.addActionListener(this);

        Toolbox.implementa_button(add_checkbox,"Checkbox",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3+PANEL_HEIGHT/15,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edita_button(add_checkbox,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_checkbox.addActionListener(this);

        details.setVisible(false);

        right.setOpaque(true);
        right.setBackground(new Color(32,32,32));
        return right;
        
    }

    public JLabel type_variable_name = new JLabel();
    public JTextField variable_name = new JTextField();
    public JLabel type_X = new JLabel();
    public JComboBox X_pos = new JComboBox(new String[]{"0%","1%","2%","3%","4%","5%","6%","7%","8%","9%","10%","11%","12%","13%","14%","15%","16%","17%","18%","19%","20%","21%","22%","23%","24%","25%","26%","27%","28%","29%","30%","31%","32%","33%","34%","35%","36%","37%","38%","39%","40%","41%","42%","43%","44%","45%","46%","47%","48%","49%","50%","51%","52%","53%","54%","55%","56%","57%","58%","59%","60%","61%","62%","63%","64%","65%","66%","67%","68%","69%","70%","71%","72%","73%","74%","75%","76%","77%","78%","79%","80%","81%","82%","83%","84%","85%","86%","87%","88%","89%","90%","91%","92%","93%","94%","95%","96%","97%","98%","99%","100%"});
    public JLabel type_Y = new JLabel();
    public JComboBox Y_pos = new JComboBox(new String[]{"0%","1%","2%","3%","4%","5%","6%","7%","8%","9%","10%","11%","12%","13%","14%","15%","16%","17%","18%","19%","20%","21%","22%","23%","24%","25%","26%","27%","28%","29%","30%","31%","32%","33%","34%","35%","36%","37%","38%","39%","40%","41%","42%","43%","44%","45%","46%","47%","48%","49%","50%","51%","52%","53%","54%","55%","56%","57%","58%","59%","60%","61%","62%","63%","64%","65%","66%","67%","68%","69%","70%","71%","72%","73%","74%","75%","76%","77%","78%","79%","80%","81%","82%","83%","84%","85%","86%","87%","88%","89%","90%","91%","92%","93%","94%","95%","96%","97%","98%","99%","100%"});
    public JLabel type_width = new JLabel();
    public JComboBox width = new JComboBox(new String[]{"0%","1%","2%","3%","4%","5%","6%","7%","8%","9%","10%","11%","12%","13%","14%","15%","16%","17%","18%","19%","20%","21%","22%","23%","24%","25%","26%","27%","28%","29%","30%","31%","32%","33%","34%","35%","36%","37%","38%","39%","40%","41%","42%","43%","44%","45%","46%","47%","48%","49%","50%","51%","52%","53%","54%","55%","56%","57%","58%","59%","60%","61%","62%","63%","64%","65%","66%","67%","68%","69%","70%","71%","72%","73%","74%","75%","76%","77%","78%","79%","80%","81%","82%","83%","84%","85%","86%","87%","88%","89%","90%","91%","92%","93%","94%","95%","96%","97%","98%","99%","100%"});
    public JLabel type_height = new JLabel();
    public JComboBox height = new JComboBox(new String[]{"0%","1%","2%","3%","4%","5%","6%","7%","8%","9%","10%","11%","12%","13%","14%","15%","16%","17%","18%","19%","20%","21%","22%","23%","24%","25%","26%","27%","28%","29%","30%","31%","32%","33%","34%","35%","36%","37%","38%","39%","40%","41%","42%","43%","44%","45%","46%","47%","48%","49%","50%","51%","52%","53%","54%","55%","56%","57%","58%","59%","60%","61%","62%","63%","64%","65%","66%","67%","68%","69%","70%","71%","72%","73%","74%","75%","76%","77%","78%","79%","80%","81%","82%","83%","84%","85%","86%","87%","88%","89%","90%","91%","92%","93%","94%","95%","96%","97%","98%","99%","100%"});
    public JButton content_foreground_color = new JButton();
    public JButton content_background_color = new JButton();
    public JCheckBox border = new JCheckBox();
    public JLabel type_text = new JLabel();
    public JTextField text = new JTextField();
    public JCheckBox editable = new JCheckBox();
    public JLabel type_font_family = new JLabel();
    public JComboBox font_family = new JComboBox(new String[]{"Dialog","Serif","SansSerif","Monospaced"});
    public JLabel type_font_size = new JLabel();
    public JComboBox font_size = new JComboBox(new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60"});
    public JCheckBox checked = new JCheckBox();
    public JLabel type_link = new JLabel();
    public JTextField link = new JTextField();
    public JLabel type_min = new JLabel();
    public JTextField min = new JTextField();
    public JLabel type_max = new JLabel();
    public JTextField max = new JTextField();
    public JLabel type_value = new JLabel();
    public JTextField value = new JTextField();
    public JLabel type_button_group = new JLabel();
    public JTextField button_group = new JTextField();
    public JLabel type_combobox_items = new JLabel();
    public JTextField combobox_items = new JTextField();
    public JLabel type_combobox_initial_item = new JLabel();
    public JTextField combobox_initial_item = new JTextField();    

    public void restart_detais_panel(){
        details.setVisible(false);
        details.removeAll();
        details.setOpaque(true);
        details.setBackground(new Color(64,64,64));
        Toolbox.implementa_button(add_item,"ADD",0,PANEL_HEIGHT-21*PANEL_HEIGHT/35,2685*PANEL_WIDTH/10000,PANEL_HEIGHT/35,details);
        Toolbox.edita_button(add_item,new Font("Dialog",Font.PLAIN,12),new Color(0,128,0),Color.WHITE);
        add_item.addActionListener(this);

        type_variable_name.setVisible(false);
        variable_name.setVisible(false);
        type_X.setVisible(false);
        X_pos.setVisible(false);
        type_Y.setVisible(false);
        Y_pos.setVisible(false);
        type_width.setVisible(false);
        width.setVisible(false);
        type_height.setVisible(false);
        height.setVisible(false);
        content_foreground_color.setVisible(false);
        content_background_color.setVisible(false);
        border.setVisible(false);
        type_text.setVisible(false);
        text.setVisible(false);
        editable.setVisible(false);
        type_font_family.setVisible(false);
        font_family.setVisible(false);
        type_font_size.setVisible(false);
        font_size.setVisible(false);
        checked.setVisible(false);
        type_link.setVisible(false);
        link.setVisible(false);
        type_min.setVisible(false);
        min.setVisible(false);
        type_max.setVisible(false);
        max.setVisible(false);
        type_value.setVisible(false);
        value.setVisible(false);
        type_button_group.setVisible(false);
        button_group.setVisible(false);

    }

    public String type = "null";

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==background_color){
            Color newColor = JColorChooser.showDialog(null, "Select a color", new Color(238,238,238));
            if(newColor!=null){background_color.setBackground(newColor);}
        }
        else if(e.getSource()==add_label){
            type="label";
            restart_detais_panel();

            type_variable_name.setVisible(true);
            variable_name.setVisible(true);
            Toolbox.implementa_label(type_variable_name,"Type variable name:",false,0,PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_variable_name,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_textfield(variable_name,"",PANEL_WIDTH/10,PANEL_HEIGHT/100,PANEL_WIDTH/6,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edita_textfield(variable_name,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE,null,null);

            type_X.setVisible(true);
            X_pos.setVisible(true);
            Toolbox.implementa_label(type_X,"X:",false,PANEL_WIDTH/20,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_X,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(X_pos,null,PANEL_WIDTH/20+PANEL_WIDTH/30,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(X_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_Y.setVisible(true);
            Y_pos.setVisible(true);
            Toolbox.implementa_label(type_Y,"Y:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_Y,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(Y_pos,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(Y_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_width.setVisible(true);
            width.setVisible(true);
            Toolbox.implementa_label(type_width,"Width:",false,PANEL_WIDTH/20,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_width,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(width,null,PANEL_WIDTH/20+PANEL_WIDTH/30,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(width,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_height.setVisible(true);
            height.setVisible(true);
            Toolbox.implementa_label(type_height,"Height:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_height,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(height,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(height,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            content_background_color.setVisible(true);
            Toolbox.implementa_button(content_background_color,"Background color",PANEL_WIDTH/50,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);

            content_foreground_color.setVisible(true);
            Toolbox.implementa_button(content_foreground_color,"Foreground color",PANEL_WIDTH/20+PANEL_WIDTH/10,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);

            type_text.setVisible(true);
            text.setVisible(true);
            Toolbox.implementa_label(type_text,"Text:",false,PANEL_WIDTH/130,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_text,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_textfield(text,"",PANEL_WIDTH/25,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/5,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edita_textfield(text,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE,null,null);

            type_font_family.setVisible(true);
            font_family.setVisible(true);
            Toolbox.implementa_label(type_font_family,"Font family:",false,PANEL_WIDTH/80,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_font_family,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(font_family,null,PANEL_WIDTH/80+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(font_family,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_font_size.setVisible(true);
            font_size.setVisible(true);
            Toolbox.implementa_label(type_font_size,"Font size:",false,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_font_size,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(font_size,null,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(font_size,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            border.setVisible(true);
            Toolbox.implementa_checkbox(border,"Border",PANEL_WIDTH/9,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edita_checkbox(border,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_textfield){
            type="textfield";
            restart_detais_panel();

            type_variable_name.setVisible(true);
            variable_name.setVisible(true);
            Toolbox.implementa_label(type_variable_name,"Type variable name:",false,0,PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_variable_name,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_textfield(variable_name,"",PANEL_WIDTH/10,PANEL_HEIGHT/100,PANEL_WIDTH/6,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edita_textfield(variable_name,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE,null,null);

            type_X.setVisible(true);
            X_pos.setVisible(true);
            Toolbox.implementa_label(type_X,"X:",false,PANEL_WIDTH/20,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_X,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(X_pos,null,PANEL_WIDTH/20+PANEL_WIDTH/30,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(X_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_Y.setVisible(true);
            Y_pos.setVisible(true);
            Toolbox.implementa_label(type_Y,"Y:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_Y,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(Y_pos,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(Y_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_width.setVisible(true);
            width.setVisible(true);
            Toolbox.implementa_label(type_width,"Width:",false,PANEL_WIDTH/20,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_width,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(width,null,PANEL_WIDTH/20+PANEL_WIDTH/30,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(width,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_height.setVisible(true);
            height.setVisible(true);
            Toolbox.implementa_label(type_height,"Height:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_height,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(height,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(height,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            content_background_color.setVisible(true);
            Toolbox.implementa_button(content_background_color,"Background color",PANEL_WIDTH/50,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);

            content_foreground_color.setVisible(true);
            Toolbox.implementa_button(content_foreground_color,"Foreground color",PANEL_WIDTH/20+PANEL_WIDTH/10,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);

            type_text.setVisible(true);
            text.setVisible(true);
            Toolbox.implementa_label(type_text,"Text:",false,PANEL_WIDTH/130,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_text,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_textfield(text,"",PANEL_WIDTH/25,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/5,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edita_textfield(text,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE,null,null);

            type_font_family.setVisible(true);
            font_family.setVisible(true);
            Toolbox.implementa_label(type_font_family,"Font family:",false,PANEL_WIDTH/80,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_font_family,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(font_family,null,PANEL_WIDTH/80+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(font_family,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_font_size.setVisible(true);
            font_size.setVisible(true);
            Toolbox.implementa_label(type_font_size,"Font size:",false,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_font_size,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(font_size,null,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(font_size,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            border.setVisible(true);
            Toolbox.implementa_checkbox(border,"Border",PANEL_WIDTH/18,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edita_checkbox(border,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            
            editable.setVisible(true);
            Toolbox.implementa_checkbox(editable,"Editable",PANEL_WIDTH/6,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edita_checkbox(editable,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_passwordfield){
            type="passwordfield";
            restart_detais_panel();

            type_variable_name.setVisible(true);
            variable_name.setVisible(true);
            Toolbox.implementa_label(type_variable_name,"Type variable name:",false,0,PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_variable_name,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_textfield(variable_name,"",PANEL_WIDTH/10,PANEL_HEIGHT/100,PANEL_WIDTH/6,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edita_textfield(variable_name,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE,null,null);

            type_X.setVisible(true);
            X_pos.setVisible(true);
            Toolbox.implementa_label(type_X,"X:",false,PANEL_WIDTH/20,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_X,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(X_pos,null,PANEL_WIDTH/20+PANEL_WIDTH/30,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(X_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_Y.setVisible(true);
            Y_pos.setVisible(true);
            Toolbox.implementa_label(type_Y,"Y:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_Y,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(Y_pos,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(Y_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_width.setVisible(true);
            width.setVisible(true);
            Toolbox.implementa_label(type_width,"Width:",false,PANEL_WIDTH/20,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_width,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(width,null,PANEL_WIDTH/20+PANEL_WIDTH/30,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(width,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_height.setVisible(true);
            height.setVisible(true);
            Toolbox.implementa_label(type_height,"Height:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_height,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(height,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(height,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            content_background_color.setVisible(true);
            Toolbox.implementa_button(content_background_color,"Background color",PANEL_WIDTH/50,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);

            content_foreground_color.setVisible(true);
            Toolbox.implementa_button(content_foreground_color,"Foreground color",PANEL_WIDTH/20+PANEL_WIDTH/10,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);

            type_font_size.setVisible(true);
            font_size.setVisible(true);
            Toolbox.implementa_label(type_font_size,"Font size:",false,PANEL_WIDTH/12,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_font_size,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(font_size,null,PANEL_WIDTH/12+PANEL_WIDTH/20,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(font_size,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            border.setVisible(true);
            Toolbox.implementa_checkbox(border,"Border",PANEL_WIDTH/9,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edita_checkbox(border,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            
            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);            
            details.setVisible(true);

        }
        else if(e.getSource()==add_textarea){
            type="textarea";
            restart_detais_panel();

            type_variable_name.setVisible(true);
            variable_name.setVisible(true);
            Toolbox.implementa_label(type_variable_name,"Type variable name:",false,0,PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_variable_name,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_textfield(variable_name,"",PANEL_WIDTH/10,PANEL_HEIGHT/100,PANEL_WIDTH/6,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edita_textfield(variable_name,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE,null,null);

            type_X.setVisible(true);
            X_pos.setVisible(true);
            Toolbox.implementa_label(type_X,"X:",false,PANEL_WIDTH/20,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_X,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(X_pos,null,PANEL_WIDTH/20+PANEL_WIDTH/30,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(X_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_Y.setVisible(true);
            Y_pos.setVisible(true);
            Toolbox.implementa_label(type_Y,"Y:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_Y,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(Y_pos,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(Y_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_width.setVisible(true);
            width.setVisible(true);
            Toolbox.implementa_label(type_width,"Width:",false,PANEL_WIDTH/20,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_width,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(width,null,PANEL_WIDTH/20+PANEL_WIDTH/30,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(width,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_height.setVisible(true);
            height.setVisible(true);
            Toolbox.implementa_label(type_height,"Height:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_height,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(height,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(height,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            content_background_color.setVisible(true);
            Toolbox.implementa_button(content_background_color,"Background color",PANEL_WIDTH/50,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);

            content_foreground_color.setVisible(true);
            Toolbox.implementa_button(content_foreground_color,"Foreground color",PANEL_WIDTH/20+PANEL_WIDTH/10,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);

            type_text.setVisible(true);
            text.setVisible(true);
            Toolbox.implementa_label(type_text,"Text:",false,PANEL_WIDTH/130,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_text,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_textfield(text,"",PANEL_WIDTH/25,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/5,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edita_textfield(text,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE,null,null);

            type_font_family.setVisible(true);
            font_family.setVisible(true);
            Toolbox.implementa_label(type_font_family,"Font family:",false,PANEL_WIDTH/80,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_font_family,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(font_family,null,PANEL_WIDTH/80+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(font_family,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_font_size.setVisible(true);
            font_size.setVisible(true);
            Toolbox.implementa_label(type_font_size,"Font size:",false,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_font_size,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(font_size,null,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(font_size,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            border.setVisible(true);
            Toolbox.implementa_checkbox(border,"Border",PANEL_WIDTH/18,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edita_checkbox(border,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            
            editable.setVisible(true);
            Toolbox.implementa_checkbox(editable,"Editable",PANEL_WIDTH/6,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edita_checkbox(editable,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_scrollpane){
            type="scrollpane";
            restart_detais_panel();


            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);            
            details.setVisible(true);
        }
        else if(e.getSource()==add_button){
            type="button";
            restart_detais_panel();

            type_variable_name.setVisible(true);
            variable_name.setVisible(true);
            Toolbox.implementa_label(type_variable_name,"Type variable name:",false,0,PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_variable_name,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_textfield(variable_name,"",PANEL_WIDTH/10,PANEL_HEIGHT/100,PANEL_WIDTH/6,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edita_textfield(variable_name,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE,null,null);

            type_X.setVisible(true);
            X_pos.setVisible(true);
            Toolbox.implementa_label(type_X,"X:",false,PANEL_WIDTH/20,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_X,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(X_pos,null,PANEL_WIDTH/20+PANEL_WIDTH/30,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(X_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_Y.setVisible(true);
            Y_pos.setVisible(true);
            Toolbox.implementa_label(type_Y,"Y:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_Y,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(Y_pos,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(Y_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_width.setVisible(true);
            width.setVisible(true);
            Toolbox.implementa_label(type_width,"Width:",false,PANEL_WIDTH/20,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_width,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(width,null,PANEL_WIDTH/20+PANEL_WIDTH/30,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(width,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_height.setVisible(true);
            height.setVisible(true);
            Toolbox.implementa_label(type_height,"Height:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_height,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(height,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(height,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            content_background_color.setVisible(true);
            Toolbox.implementa_button(content_background_color,"Background color",PANEL_WIDTH/50,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);

            content_foreground_color.setVisible(true);
            Toolbox.implementa_button(content_foreground_color,"Foreground color",PANEL_WIDTH/20+PANEL_WIDTH/10,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);

            type_text.setVisible(true);
            text.setVisible(true);
            Toolbox.implementa_label(type_text,"Text:",false,PANEL_WIDTH/130,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_text,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_textfield(text,"",PANEL_WIDTH/25,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/5,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edita_textfield(text,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE,null,null);

            type_font_family.setVisible(true);
            font_family.setVisible(true);
            Toolbox.implementa_label(type_font_family,"Font family:",false,PANEL_WIDTH/80,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_font_family,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(font_family,null,PANEL_WIDTH/80+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(font_family,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_font_size.setVisible(true);
            font_size.setVisible(true);
            Toolbox.implementa_label(type_font_size,"Font size:",false,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edita_label(type_font_size,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implementa_combobox(font_size,null,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edita_combobox(font_size,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_combobox){
            type="combobox";
            restart_detais_panel();

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_radiobutton){
            type="radiobutton";
            restart_detais_panel();


            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_table){
            type="table";
            restart_detais_panel();

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_image){
            type="image";
            restart_detais_panel();


            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_bar){
            type="bar";
            restart_detais_panel();

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_checkbox){
            type="checkbox";
            restart_detais_panel();

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_item){
            //add
            
            type="null";
            details.removeAll();
            details.setVisible(false);
        }

    }

}
