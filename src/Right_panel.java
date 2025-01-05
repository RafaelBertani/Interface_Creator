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
    private JButton add_radiobuttons = new JButton();
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

        Toolbox.implementa_button(add_radiobuttons,"Radiobuttons",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3+PANEL_HEIGHT/30,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edita_button(add_radiobuttons,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_radiobuttons.addActionListener(this);

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
    

    public void restart_detais_panel(){
        details.removeAll();
        details.setOpaque(true);
        details.setBackground(new Color(64,64,64));
        Toolbox.implementa_button(add_item,"ADD",0,PANEL_HEIGHT-21*PANEL_HEIGHT/35,2685*PANEL_WIDTH/10000,PANEL_HEIGHT/35,details);
        Toolbox.edita_button(add_item,new Font("Dialog",Font.PLAIN,12),new Color(0,128,0),Color.WHITE);
        add_item.addActionListener(this);

        Toolbox.implementa_label(type_variable_name,"Variable name:",false,PANEL_WIDTH/15,PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/35,details);
        Toolbox.edita_label(type_variable_name,null,null,Color.WHITE);
        Toolbox.implementa_textfield(variable_name,"",2*PANEL_WIDTH/15,PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/35,true,true,details);
        Toolbox.edita_textfield(variable_name,null,new Color(128,128,128),Color.WHITE,null,null);

        Toolbox.implementa_label(type_X,"X:",false,0,PANEL_HEIGHT/80+PANEL_HEIGHT/35,PANEL_WIDTH/45,PANEL_HEIGHT/35,details);
        Toolbox.edita_label(type_X,null,null,Color.WHITE);
        Toolbox.implementa_combobox(X_pos,null,PANEL_WIDTH/45,PANEL_HEIGHT/80+PANEL_HEIGHT/35,PANEL_WIDTH/25,PANEL_HEIGHT/35,10,0,details);
        Toolbox.edita_combobox(X_pos,null,new Color(32,32,32),Color.WHITE);

        Toolbox.implementa_label(type_Y,"Y:",false,PANEL_WIDTH/45+PANEL_WIDTH/25,PANEL_HEIGHT/80+PANEL_HEIGHT/35,PANEL_WIDTH/45,PANEL_HEIGHT/35,details);
        Toolbox.edita_label(type_Y,null,null,Color.WHITE);
        Toolbox.implementa_combobox(Y_pos,null,PANEL_WIDTH/45+PANEL_WIDTH/25+PANEL_WIDTH/45,PANEL_HEIGHT/80+PANEL_HEIGHT/35,PANEL_WIDTH/25,PANEL_HEIGHT/35,10,0,details);
        Toolbox.edita_combobox(Y_pos,null,new Color(32,32,32),Color.WHITE);

        Toolbox.implementa_label(type_width,"Width:",false,2*PANEL_WIDTH/45+2*PANEL_WIDTH/25,PANEL_HEIGHT/80+PANEL_HEIGHT/35,PANEL_WIDTH/40,PANEL_HEIGHT/35,details);
        Toolbox.edita_label(type_width,null,null,Color.WHITE);
        Toolbox.implementa_combobox(width,null,2*PANEL_WIDTH/45+2*PANEL_WIDTH/25+PANEL_WIDTH/40,PANEL_HEIGHT/80+PANEL_HEIGHT/35,PANEL_WIDTH/25,PANEL_HEIGHT/35,10,0,details);
        Toolbox.edita_combobox(width,null,new Color(32,32,32),Color.WHITE);

        Toolbox.implementa_label(type_height,"Height:",false,2*PANEL_WIDTH/45+3*PANEL_WIDTH/25+PANEL_WIDTH/40,PANEL_HEIGHT/80+PANEL_HEIGHT/35,PANEL_WIDTH/35,PANEL_HEIGHT/35,details);
        Toolbox.edita_label(type_height,null,null,Color.WHITE);
        Toolbox.implementa_combobox(height,null,3*PANEL_WIDTH/40+3*PANEL_WIDTH/25+PANEL_WIDTH/40,PANEL_HEIGHT/80+PANEL_HEIGHT/35,PANEL_WIDTH/25,PANEL_HEIGHT/35,10,0,details);
        Toolbox.edita_combobox(height,null,new Color(32,32,32),Color.WHITE);

        Toolbox.implementa_button(content_background_color,"Background",PANEL_WIDTH/55,PANEL_HEIGHT/70+2*PANEL_HEIGHT/35,PANEL_WIDTH/12,PANEL_HEIGHT/35,details);
        content_background_color.addActionListener(this);

        Toolbox.implementa_button(content_foreground_color,"Foreground",PANEL_WIDTH/55+PANEL_WIDTH/12,PANEL_HEIGHT/70+2*PANEL_HEIGHT/35,PANEL_WIDTH/12,PANEL_HEIGHT/35,details);
        content_foreground_color.addActionListener(this);

        Toolbox.implementa_checkbox(border,"Border",PANEL_WIDTH/40+PANEL_WIDTH/6,PANEL_HEIGHT/70+2*PANEL_HEIGHT/35,PANEL_WIDTH/20,PANEL_HEIGHT/35,false,details);
        Toolbox.edita_checkbox(border,null,new Color(64,64,64),Color.WHITE);

        Toolbox.implementa_label(type_text,"Text:",false,0,PANEL_HEIGHT/70+3*PANEL_HEIGHT/35,PANEL_WIDTH/25,PANEL_HEIGHT/35,details);
        Toolbox.edita_label(type_text,null,null,Color.WHITE);
        Toolbox.implementa_textfield(text,"",PANEL_WIDTH/25,PANEL_HEIGHT/70+3*PANEL_HEIGHT/35,PANEL_WIDTH/8,PANEL_HEIGHT/35,true,true,details);
        Toolbox.edita_textfield(text,null,new Color(128,128,128),Color.WHITE,null,null);

        Toolbox.implementa_checkbox(editable,"Editable",PANEL_WIDTH/40+PANEL_WIDTH/6,PANEL_HEIGHT/70+3*PANEL_HEIGHT/35,PANEL_WIDTH/20,PANEL_HEIGHT/35,false,details);
        Toolbox.edita_checkbox(editable,null,new Color(64,64,64),Color.WHITE);

        Toolbox.implementa_label(type_font_family,"Font family:",false,0,PANEL_HEIGHT/60+4*PANEL_HEIGHT/35,PANEL_WIDTH/20,PANEL_HEIGHT/35,details);
        Toolbox.edita_label(type_font_family,null,null,Color.WHITE);
        Toolbox.implementa_combobox(font_family,null,PANEL_WIDTH/20,PANEL_HEIGHT/60+4*PANEL_HEIGHT/35,PANEL_WIDTH/15,PANEL_HEIGHT/35,4,0,details);
        Toolbox.edita_combobox(font_family,null,new Color(64,64,64),Color.WHITE);

        Toolbox.implementa_label(type_font_size,"Font size:",false,PANEL_WIDTH/20+PANEL_WIDTH/15,PANEL_HEIGHT/60+4*PANEL_HEIGHT/35,PANEL_WIDTH/25,PANEL_HEIGHT/35,details);
        Toolbox.edita_label(type_font_size,null,null,Color.WHITE);
        Toolbox.implementa_combobox(font_size,null,PANEL_WIDTH/20+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/60+4*PANEL_HEIGHT/35,PANEL_WIDTH/30,PANEL_HEIGHT/35,4,11,details);
        Toolbox.edita_combobox(font_size,null,new Color(64,64,64),Color.WHITE);

        Toolbox.implementa_checkbox(checked,"Checked",PANEL_WIDTH/40+PANEL_WIDTH/6,PANEL_HEIGHT/60+4*PANEL_HEIGHT/35,PANEL_WIDTH/20,PANEL_HEIGHT/35,false,details);
        Toolbox.edita_checkbox(checked,null,new Color(64,64,64),Color.WHITE);

        Toolbox.implementa_label(type_link,"Link:",false,0,PANEL_HEIGHT/50+5*PANEL_HEIGHT/35,PANEL_WIDTH/25,PANEL_HEIGHT/35,details);
        Toolbox.edita_label(type_link,null,null,Color.WHITE);
        Toolbox.implementa_textfield(link,"",PANEL_WIDTH/25,PANEL_HEIGHT/50+5*PANEL_HEIGHT/35,PANEL_WIDTH/8,PANEL_HEIGHT/35,true,true,details);
        Toolbox.edita_textfield(link,null,new Color(128,128,128),Color.WHITE,null,null);

        Toolbox.implementa_label(type_min,"Min:",false,0,PANEL_HEIGHT/40+6*PANEL_HEIGHT/35,PANEL_WIDTH/25,PANEL_HEIGHT/35,details);
        Toolbox.edita_label(type_min,null,null,Color.WHITE);
        Toolbox.implementa_textfield(min,"",PANEL_WIDTH/25,PANEL_HEIGHT/40+6*PANEL_HEIGHT/35,PANEL_WIDTH/35,PANEL_HEIGHT/35,true,true,details);
        Toolbox.edita_textfield(min,null,new Color(128,128,128),Color.WHITE,null,null);
        
        Toolbox.implementa_label(type_max,"Max:",false,PANEL_WIDTH/25+PANEL_WIDTH/35,PANEL_HEIGHT/40+6*PANEL_HEIGHT/35,PANEL_WIDTH/25,PANEL_HEIGHT/35,details);
        Toolbox.edita_label(type_max,null,null,Color.WHITE);
        Toolbox.implementa_textfield(max,"",PANEL_WIDTH/20+2*PANEL_WIDTH/35,PANEL_HEIGHT/40+6*PANEL_HEIGHT/35,PANEL_WIDTH/35,PANEL_HEIGHT/35,true,true,details);
        Toolbox.edita_textfield(max,null,new Color(128,128,128),Color.WHITE,null,null);

        Toolbox.implementa_label(type_value,"Value:",false,PANEL_WIDTH/20+3*PANEL_WIDTH/35,PANEL_HEIGHT/40+6*PANEL_HEIGHT/35,PANEL_WIDTH/25,PANEL_HEIGHT/35,details);
        Toolbox.edita_label(type_value,null,null,Color.WHITE);
        Toolbox.implementa_textfield(value,"",PANEL_WIDTH/17+4*PANEL_WIDTH/35,PANEL_HEIGHT/40+6*PANEL_HEIGHT/35,PANEL_WIDTH/35,PANEL_HEIGHT/35,true,true,details);
        Toolbox.edita_textfield(value,null,new Color(128,128,128),Color.WHITE,null,null);

        Toolbox.implementa_label(type_button_group,"Bottom_group_name:",false,0,PANEL_HEIGHT/30+7*PANEL_HEIGHT/35,PANEL_WIDTH/10,PANEL_HEIGHT/35,details);
        Toolbox.edita_label(type_button_group,null,null,Color.WHITE);
        Toolbox.implementa_textfield(button_group,"",PANEL_WIDTH/10,PANEL_HEIGHT/30+7*PANEL_HEIGHT/35,PANEL_WIDTH/8,PANEL_HEIGHT/35,true,true,details);
        Toolbox.edita_textfield(button_group,null,new Color(128,128,128),Color.WHITE,null,null);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==background_color){
            Color newColor = JColorChooser.showDialog(null, "Select a color", new Color(238,238,238));
            if(newColor!=null){background_color.setBackground(newColor);}
        }
        else if(e.getSource()==add_label){
            restart_detais_panel();

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_textfield){
            restart_detais_panel();

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);    
            details.setVisible(true);
        }
        else if(e.getSource()==add_passwordfield){
            restart_detais_panel();

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);            
            details.setVisible(true);
        }
        else if(e.getSource()==add_textarea){
            restart_detais_panel();

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_scrollpane){
            restart_detais_panel();

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);            
            details.setVisible(true);
        }
        else if(e.getSource()==add_button){
            restart_detais_panel();

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_combobox){
            restart_detais_panel();

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_radiobuttons){
            restart_detais_panel();

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_table){
            restart_detais_panel();

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_image){
            restart_detais_panel();

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_bar){
            restart_detais_panel();

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_checkbox){
            restart_detais_panel();

            Toolbox.implementa_panel_no_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_item){
            details.removeAll();
            details.setVisible(false);
        }

    }

}
