import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Right_panel extends JFrame implements ActionListener{
    
    public static JPanel right = new JPanel();

    private static int PANEL_WIDTH=-1;
    private static int PANEL_HEIGHT=-1;

    public static JTextField panel_name_textfield = new JTextField();
    public static JCheckBox opaque_panel = new JCheckBox();
    public static JButton background_color = new JButton();
    public static JComboBox<String> width_combobox = new JComboBox<String>();
    public static JComboBox<String> height_combobox = new JComboBox<String>();
    public static JComboBox<String> x_combobox = new JComboBox<String>();
    public static JComboBox<String> y_combobox = new JComboBox<String>();

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
    private JButton add_bar = new JButton();
    private JButton add_checkbox = new JButton();

    private JPanel details = new JPanel();
    private JButton preview_item = new JButton();
    private JButton add_item = new JButton();

    public JPanel return_Right_panel(int PANEL_WIDTH, int PANEL_HEIGHT){

        Right_panel.PANEL_WIDTH=PANEL_WIDTH;
        Right_panel.PANEL_HEIGHT=PANEL_HEIGHT;

        JLabel title = new JLabel();
        Toolbox.implements_label(title,"Edit panel",false,0,0,3*PANEL_WIDTH/10,PANEL_HEIGHT/20,right);
        Toolbox.edit_label(title,new Font("Dialog",Font.PLAIN,16),null,Color.WHITE);


        JLabel panel_name = new JLabel();
        Toolbox.implements_label(panel_name,"Panel_name:",false,PANEL_WIDTH/25,PANEL_HEIGHT/15,PANEL_WIDTH/10,PANEL_HEIGHT/25,right);
        Toolbox.edit_label(panel_name,new Font("Dialog",Font.PLAIN,14),null,Color.WHITE);

        Toolbox.implements_textfield(panel_name_textfield,"",7*PANEL_WIDTH/50,PANEL_HEIGHT/15,1*PANEL_WIDTH/10,PANEL_HEIGHT/25,true,true,right);
        Toolbox.edit_textfield(panel_name_textfield,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);


        JLabel width = new JLabel();
        Toolbox.implements_label(width,"Width:",false,0,2*PANEL_HEIGHT/15,PANEL_WIDTH/20,PANEL_HEIGHT/25,right);
        Toolbox.edit_label(width,new Font("Dialog",Font.PLAIN,14),null,Color.WHITE);
        width_combobox=new JComboBox<String>(new String[]{"0%","1%","2%","3%","4%","5%","6%","7%","8%","9%","10%","11%","12%","13%","14%","15%","16%","17%","18%","19%","20%","21%","22%","23%","24%","25%","26%","27%","28%","29%","30%","31%","32%","33%","34%","35%","36%","37%","38%","39%","40%","41%","42%","43%","44%","45%","46%","47%","48%","49%","50%","51%","52%","53%","54%","55%","56%","57%","58%","59%","60%","61%","62%","63%","64%","65%","66%","67%","68%","69%","70%","71%","72%","73%","74%","75%","76%","77%","78%","79%","80%","81%","82%","83%","84%","85%","86%","87%","88%","89%","90%","91%","92%","93%","94%","95%","96%","97%","98%","99%","100%"});
        Toolbox.implements_combobox(width_combobox,null,PANEL_WIDTH/20,2*PANEL_HEIGHT/15,PANEL_WIDTH/20,PANEL_HEIGHT/25,10,100,right);
        Toolbox.edit_combobox(width_combobox,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        width_combobox.addItemListener(il);

        JLabel height = new JLabel();
        Toolbox.implements_label(height,"Height:",false,PANEL_WIDTH/9,2*PANEL_HEIGHT/15,PANEL_WIDTH/20,PANEL_HEIGHT/25,right);
        Toolbox.edit_label(height,new Font("Dialog",Font.PLAIN,14),null,Color.WHITE);
        height_combobox=new JComboBox<String>(new String[]{"0%","1%","2%","3%","4%","5%","6%","7%","8%","9%","10%","11%","12%","13%","14%","15%","16%","17%","18%","19%","20%","21%","22%","23%","24%","25%","26%","27%","28%","29%","30%","31%","32%","33%","34%","35%","36%","37%","38%","39%","40%","41%","42%","43%","44%","45%","46%","47%","48%","49%","50%","51%","52%","53%","54%","55%","56%","57%","58%","59%","60%","61%","62%","63%","64%","65%","66%","67%","68%","69%","70%","71%","72%","73%","74%","75%","76%","77%","78%","79%","80%","81%","82%","83%","84%","85%","86%","87%","88%","89%","90%","91%","92%","93%","94%","95%","96%","97%","98%","99%","100%"});
        Toolbox.implements_combobox(height_combobox,null,PANEL_WIDTH/9+PANEL_WIDTH/20,2*PANEL_HEIGHT/15,PANEL_WIDTH/20,PANEL_HEIGHT/25,10,100,right);
        Toolbox.edit_combobox(height_combobox,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        height_combobox.addItemListener(il);


        JLabel x = new JLabel();
        Toolbox.implements_label(x,"X:",false,0,2*PANEL_HEIGHT/15+PANEL_HEIGHT/20,PANEL_WIDTH/20,PANEL_HEIGHT/25,right);
        Toolbox.edit_label(x,new Font("Dialog",Font.PLAIN,14),null,Color.WHITE);
        x_combobox=new JComboBox<String>(new String[]{"0%","1%","2%","3%","4%","5%","6%","7%","8%","9%","10%","11%","12%","13%","14%","15%","16%","17%","18%","19%","20%","21%","22%","23%","24%","25%","26%","27%","28%","29%","30%","31%","32%","33%","34%","35%","36%","37%","38%","39%","40%","41%","42%","43%","44%","45%","46%","47%","48%","49%","50%","51%","52%","53%","54%","55%","56%","57%","58%","59%","60%","61%","62%","63%","64%","65%","66%","67%","68%","69%","70%","71%","72%","73%","74%","75%","76%","77%","78%","79%","80%","81%","82%","83%","84%","85%","86%","87%","88%","89%","90%","91%","92%","93%","94%","95%","96%","97%","98%","99%","100%"});
        Toolbox.implements_combobox(x_combobox,null,PANEL_WIDTH/20,2*PANEL_HEIGHT/15+PANEL_HEIGHT/20,PANEL_WIDTH/20,PANEL_HEIGHT/25,10,0,right);
        Toolbox.edit_combobox(x_combobox,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        x_combobox.addItemListener(il);

        
        JLabel y = new JLabel();
        Toolbox.implements_label(y,"Y:",false,PANEL_WIDTH/9,2*PANEL_HEIGHT/15+PANEL_HEIGHT/20,PANEL_WIDTH/20,PANEL_HEIGHT/25,right);
        Toolbox.edit_label(y,new Font("Dialog",Font.PLAIN,14),null,Color.WHITE);
        y_combobox=new JComboBox<String>(new String[]{"0%","1%","2%","3%","4%","5%","6%","7%","8%","9%","10%","11%","12%","13%","14%","15%","16%","17%","18%","19%","20%","21%","22%","23%","24%","25%","26%","27%","28%","29%","30%","31%","32%","33%","34%","35%","36%","37%","38%","39%","40%","41%","42%","43%","44%","45%","46%","47%","48%","49%","50%","51%","52%","53%","54%","55%","56%","57%","58%","59%","60%","61%","62%","63%","64%","65%","66%","67%","68%","69%","70%","71%","72%","73%","74%","75%","76%","77%","78%","79%","80%","81%","82%","83%","84%","85%","86%","87%","88%","89%","90%","91%","92%","93%","94%","95%","96%","97%","98%","99%","100%"});
        Toolbox.implements_combobox(y_combobox,null,PANEL_WIDTH/9+PANEL_WIDTH/20,2*PANEL_HEIGHT/15+PANEL_HEIGHT/20,PANEL_WIDTH/20,PANEL_HEIGHT/25,10,0,right);
        Toolbox.edit_combobox(y_combobox,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        y_combobox.addItemListener(il);


        Toolbox.implements_checkbox(opaque_panel,"Opaque",PANEL_WIDTH/5+PANEL_WIDTH/25,2*PANEL_HEIGHT/15,PANEL_WIDTH/20,PANEL_HEIGHT/25,false,right);
        Toolbox.edit_checkbox(opaque_panel,new Font("Dialog",Font.PLAIN,12),new Color(32,32,32),Color.WHITE);
        opaque_panel.addActionListener(this);
        opaque_panel.setSelected(true);

        
        Toolbox.implements_button(background_color,"Color",PANEL_WIDTH/5+PANEL_WIDTH/25,2*PANEL_HEIGHT/15+PANEL_HEIGHT/20,PANEL_WIDTH/20,PANEL_HEIGHT/25,right);
        Toolbox.edit_button(background_color,new Font("Dialog",Font.PLAIN,12),new Color(238,238,238),Color.BLACK);
        background_color.addActionListener(this);


        JLabel advice = new JLabel();
        Toolbox.implements_label(advice,"(Percentages refer to screen size.)",false,0,2*PANEL_HEIGHT/15+PANEL_HEIGHT/10,3*PANEL_WIDTH/10,PANEL_HEIGHT/20,right);
        Toolbox.edit_label(advice,new Font("Dialog",Font.PLAIN,12),null,Color.WHITE);


        JLabel add_to_panel = new JLabel();
        Toolbox.implements_label(add_to_panel,"Add to the panel:",false,0,2*PANEL_HEIGHT/15+PANEL_HEIGHT/10+PANEL_HEIGHT/20,3*PANEL_WIDTH/10,PANEL_HEIGHT/20,right);
        Toolbox.edit_label(add_to_panel,new Font("Dialog",Font.PLAIN,16),null,Color.WHITE);


        Toolbox.implements_button(add_label,"Label",15*PANEL_WIDTH/1000,PANEL_HEIGHT/3,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edit_button(add_label,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_label.addActionListener(this);

        Toolbox.implements_button(add_textfield,"Textfield",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edit_button(add_textfield,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_textfield.addActionListener(this);

        Toolbox.implements_button(add_passwordfield,"Passwordfield",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edit_button(add_passwordfield,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_passwordfield.addActionListener(this);

        Toolbox.implements_button(add_textarea,"Textarea",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edit_button(add_textarea,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_textarea.addActionListener(this);

        Toolbox.implements_button(add_scrollpane,"ScrollPane",15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+PANEL_HEIGHT/30,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edit_button(add_scrollpane,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_scrollpane.addActionListener(this);

        Toolbox.implements_button(add_button,"Button",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3+PANEL_HEIGHT/30,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edit_button(add_button,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_button.addActionListener(this);

        Toolbox.implements_button(add_combobox,"Combobox",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3+PANEL_HEIGHT/30,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edit_button(add_combobox,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_combobox.addActionListener(this);

        Toolbox.implements_button(add_radiobutton,"Radiobutton",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3+PANEL_HEIGHT/30,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edit_button(add_radiobutton,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_radiobutton.addActionListener(this);

        Toolbox.implements_button(add_table,"Table",15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+PANEL_HEIGHT/15,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edit_button(add_table,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_table.addActionListener(this);

        Toolbox.implements_button(add_image,"Image",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3+PANEL_HEIGHT/15,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edit_button(add_image,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_image.addActionListener(this);

        Toolbox.implements_button(add_bar,"Bar",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3+PANEL_HEIGHT/15,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edit_button(add_bar,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_bar.addActionListener(this);

        Toolbox.implements_button(add_checkbox,"Checkbox",15*PANEL_WIDTH/1000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000+675*PANEL_WIDTH/10000,PANEL_HEIGHT/3+PANEL_HEIGHT/15,675*PANEL_WIDTH/10000,PANEL_HEIGHT/30,right);
        Toolbox.edit_button(add_checkbox,new Font("Dialog",Font.PLAIN,12),new Color(64,64,64),Color.WHITE);
        add_checkbox.addActionListener(this);

        //UNIQUE ATRIBUITION OF ACTIONLISTENERS TO BUTTONS
        preview_item.addActionListener(this);
        add_item.addActionListener(this);
        content_background_color.addActionListener(this);
        content_foreground_color.addActionListener(this);
        scrollpane_background_color.addActionListener(this);

        details.setVisible(false);

        right.setOpaque(true);
        right.setBackground(new Color(32,32,32));

        return right;
        
    }

    public static JLabel type_variable_name = new JLabel();
    public static JTextField variable_name = new JTextField();
    public static JLabel type_X = new JLabel();
    public static JComboBox<String> X_pos = new JComboBox<String>(new String[]{"0%","1%","2%","3%","4%","5%","6%","7%","8%","9%","10%","11%","12%","13%","14%","15%","16%","17%","18%","19%","20%","21%","22%","23%","24%","25%","26%","27%","28%","29%","30%","31%","32%","33%","34%","35%","36%","37%","38%","39%","40%","41%","42%","43%","44%","45%","46%","47%","48%","49%","50%","51%","52%","53%","54%","55%","56%","57%","58%","59%","60%","61%","62%","63%","64%","65%","66%","67%","68%","69%","70%","71%","72%","73%","74%","75%","76%","77%","78%","79%","80%","81%","82%","83%","84%","85%","86%","87%","88%","89%","90%","91%","92%","93%","94%","95%","96%","97%","98%","99%","100%"});
    public static JLabel type_Y = new JLabel();
    public static JComboBox<String> Y_pos = new JComboBox<String>(new String[]{"0%","1%","2%","3%","4%","5%","6%","7%","8%","9%","10%","11%","12%","13%","14%","15%","16%","17%","18%","19%","20%","21%","22%","23%","24%","25%","26%","27%","28%","29%","30%","31%","32%","33%","34%","35%","36%","37%","38%","39%","40%","41%","42%","43%","44%","45%","46%","47%","48%","49%","50%","51%","52%","53%","54%","55%","56%","57%","58%","59%","60%","61%","62%","63%","64%","65%","66%","67%","68%","69%","70%","71%","72%","73%","74%","75%","76%","77%","78%","79%","80%","81%","82%","83%","84%","85%","86%","87%","88%","89%","90%","91%","92%","93%","94%","95%","96%","97%","98%","99%","100%"});
    public static JLabel type_width = new JLabel();
    public static JComboBox<String> width = new JComboBox<String>(new String[]{"0%","1%","2%","3%","4%","5%","6%","7%","8%","9%","10%","11%","12%","13%","14%","15%","16%","17%","18%","19%","20%","21%","22%","23%","24%","25%","26%","27%","28%","29%","30%","31%","32%","33%","34%","35%","36%","37%","38%","39%","40%","41%","42%","43%","44%","45%","46%","47%","48%","49%","50%","51%","52%","53%","54%","55%","56%","57%","58%","59%","60%","61%","62%","63%","64%","65%","66%","67%","68%","69%","70%","71%","72%","73%","74%","75%","76%","77%","78%","79%","80%","81%","82%","83%","84%","85%","86%","87%","88%","89%","90%","91%","92%","93%","94%","95%","96%","97%","98%","99%","100%"});
    public static JLabel type_height = new JLabel();
    public static JComboBox<String> height = new JComboBox<String>(new String[]{"0%","1%","2%","3%","4%","5%","6%","7%","8%","9%","10%","11%","12%","13%","14%","15%","16%","17%","18%","19%","20%","21%","22%","23%","24%","25%","26%","27%","28%","29%","30%","31%","32%","33%","34%","35%","36%","37%","38%","39%","40%","41%","42%","43%","44%","45%","46%","47%","48%","49%","50%","51%","52%","53%","54%","55%","56%","57%","58%","59%","60%","61%","62%","63%","64%","65%","66%","67%","68%","69%","70%","71%","72%","73%","74%","75%","76%","77%","78%","79%","80%","81%","82%","83%","84%","85%","86%","87%","88%","89%","90%","91%","92%","93%","94%","95%","96%","97%","98%","99%","100%"});
    public static JButton content_foreground_color = new JButton();
    public static JButton content_background_color = new JButton();
    public static JCheckBox border = new JCheckBox();
    public static JLabel type_text = new JLabel();
    public static JTextField text = new JTextField();
    public static JCheckBox editable = new JCheckBox();
    public static JLabel type_font_family = new JLabel();
    public static JComboBox<String> font_family = new JComboBox<String>(new String[]{"Dialog","Serif","SansSerif","Monospaced"});
    public static JLabel type_font_size = new JLabel();
    public static JComboBox<String> font_size = new JComboBox<String>(new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60"});
    public static JCheckBox checked = new JCheckBox();
    public static JLabel type_link = new JLabel();
    public static JTextField link = new JTextField();
    public static JLabel type_min = new JLabel();
    public static JTextField min = new JTextField();
    public static JLabel type_max = new JLabel();
    public static JTextField max = new JTextField();
    public static JLabel type_value = new JLabel();
    public static JTextField value = new JTextField();
    public static JLabel type_button_group = new JLabel();
    public static JTextField button_group = new JTextField();
    public static JLabel type_combobox_items = new JLabel();
    public static JTextField combobox_items = new JTextField();
    public static JLabel type_combobox_initial_item = new JLabel();
    public static JTextField combobox_initial_item = new JTextField();
    public static JLabel type_combobox_rows_displayed = new JLabel();
    public static JTextField combobox_combobox_rows_displayed = new JTextField();
    public static JCheckBox opaque = new JCheckBox();
    public static JLabel type_columns = new JLabel();
    public static JTextField columns = new JTextField();
    public static JLabel type_rows = new JLabel();
    public static JTextField rows = new JTextField();
    public static JButton scrollpane_background_color = new JButton();
    public static JLabel type_columns_names = new JLabel();
    public static JTextField columns_names = new JTextField();

    public void restart_detais_panel(){
        details.setVisible(false);
        details.removeAll();
        details.setOpaque(true);
        details.setBackground(new Color(64,64,64));

        Toolbox.implements_button(add_item,"ADD",2685*PANEL_WIDTH/20000,PANEL_HEIGHT-21*PANEL_HEIGHT/35,2685*PANEL_WIDTH/20000,PANEL_HEIGHT/35,details);
        Toolbox.edit_button(add_item,new Font("Dialog",Font.PLAIN,12),new Color(0,128,0),Color.WHITE);
        add_item.setVisible(true);

        Toolbox.implements_button(preview_item,"PREVIEW",0,PANEL_HEIGHT-21*PANEL_HEIGHT/35,2685*PANEL_WIDTH/20000,PANEL_HEIGHT/35,details);
        Toolbox.edit_button(preview_item,new Font("Dialog",Font.PLAIN,12),new Color(128,0,0),Color.WHITE);
        preview_item.setVisible(true);

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
        type_combobox_items.setVisible(false);
        combobox_items.setVisible(false);
        type_combobox_initial_item.setVisible(false);
        combobox_initial_item.setVisible(false);
        type_combobox_rows_displayed.setVisible(false);
        combobox_combobox_rows_displayed.setVisible(false);
        opaque.setVisible(false);

    }

    public String type = "null";
    public JComponent preview = null;

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==background_color){
            Color newColor = JColorChooser.showDialog(null, "Select a color", new Color(238,238,238));
            if(newColor!=null){
                Interface.center.setBackground(newColor);
                background_color.setBackground(newColor);
            }
        }
        else if(e.getSource()==opaque_panel){
            if(opaque_panel.isSelected()){Interface.center.setOpaque(true);}
            else{Interface.center.setOpaque(false);}
        }
        else if(e.getSource()==content_background_color){
            Color newColor = JColorChooser.showDialog(null, "Select a color", new Color(238,238,238));
            if(newColor!=null){content_background_color.setBackground(newColor);}
        }
        else if(e.getSource()==content_foreground_color){
            Color newColor = JColorChooser.showDialog(null, "Select a color", new Color(238,238,238));
            if(newColor!=null){content_foreground_color.setBackground(newColor);}
        }
        else if(e.getSource()==scrollpane_background_color){
            Color newColor = JColorChooser.showDialog(null, "Select a color", new Color(238,238,238));
            if(newColor!=null){scrollpane_background_color.setBackground(newColor);}
        }
        else if(e.getSource()==add_label){
            type="label";
            restart_detais_panel();

            type_variable_name.setVisible(true);
            variable_name.setVisible(true);
            Toolbox.implements_label(type_variable_name,"Type variable name:",false,0,PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_variable_name,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(variable_name,"",PANEL_WIDTH/10,PANEL_HEIGHT/100,PANEL_WIDTH/6,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(variable_name,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_X.setVisible(true);
            X_pos.setVisible(true);
            Toolbox.implements_label(type_X,"X:",false,PANEL_WIDTH/20,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_X,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(X_pos,null,PANEL_WIDTH/20+PANEL_WIDTH/30,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(X_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_Y.setVisible(true);
            Y_pos.setVisible(true);
            Toolbox.implements_label(type_Y,"Y:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_Y,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(Y_pos,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(Y_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_width.setVisible(true);
            width.setVisible(true);
            Toolbox.implements_label(type_width,"Width:",false,PANEL_WIDTH/20,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_width,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(width,null,PANEL_WIDTH/20+PANEL_WIDTH/30,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(width,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_height.setVisible(true);
            height.setVisible(true);
            Toolbox.implements_label(type_height,"Height:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_height,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(height,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(height,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            content_background_color.setVisible(true);
            Toolbox.implements_button(content_background_color,"Background color",PANEL_WIDTH/50,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            content_foreground_color.setVisible(true);
            Toolbox.implements_button(content_foreground_color,"Foreground color",PANEL_WIDTH/20+PANEL_WIDTH/10,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            type_text.setVisible(true);
            text.setVisible(true);
            Toolbox.implements_label(type_text,"Text:",false,PANEL_WIDTH/130,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_text,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(text,"",PANEL_WIDTH/25,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/5,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(text,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_font_family.setVisible(true);
            font_family.setVisible(true);
            Toolbox.implements_label(type_font_family,"Font family:",false,PANEL_WIDTH/80,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_font_family,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(font_family,null,PANEL_WIDTH/80+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(font_family,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_font_size.setVisible(true);
            font_size.setVisible(true);
            Toolbox.implements_label(type_font_size,"Font size:",false,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_font_size,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(font_size,null,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,9,details);
            Toolbox.edit_combobox(font_size,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            border.setVisible(true);
            Toolbox.implements_checkbox(border,"Border",PANEL_WIDTH/18,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edit_checkbox(border,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            
            opaque.setVisible(true);
            Toolbox.implements_checkbox(opaque,"Opaque",PANEL_WIDTH/6,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edit_checkbox(opaque,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);

            Toolbox.implements_panel_in_a_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_textfield){
            type="textfield";
            restart_detais_panel();

            type_variable_name.setVisible(true);
            variable_name.setVisible(true);
            Toolbox.implements_label(type_variable_name,"Type variable name:",false,0,PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_variable_name,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(variable_name,"",PANEL_WIDTH/10,PANEL_HEIGHT/100,PANEL_WIDTH/6,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(variable_name,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_X.setVisible(true);
            X_pos.setVisible(true);
            Toolbox.implements_label(type_X,"X:",false,PANEL_WIDTH/20,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_X,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(X_pos,null,PANEL_WIDTH/20+PANEL_WIDTH/30,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(X_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_Y.setVisible(true);
            Y_pos.setVisible(true);
            Toolbox.implements_label(type_Y,"Y:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_Y,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(Y_pos,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(Y_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_width.setVisible(true);
            width.setVisible(true);
            Toolbox.implements_label(type_width,"Width:",false,PANEL_WIDTH/20,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_width,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(width,null,PANEL_WIDTH/20+PANEL_WIDTH/30,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(width,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_height.setVisible(true);
            height.setVisible(true);
            Toolbox.implements_label(type_height,"Height:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_height,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(height,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(height,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            content_background_color.setVisible(true);
            Toolbox.implements_button(content_background_color,"Background color",PANEL_WIDTH/50,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            content_foreground_color.setVisible(true);
            Toolbox.implements_button(content_foreground_color,"Foreground color",PANEL_WIDTH/20+PANEL_WIDTH/10,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            type_text.setVisible(true);
            text.setVisible(true);
            Toolbox.implements_label(type_text,"Text:",false,PANEL_WIDTH/130,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_text,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(text,"",PANEL_WIDTH/25,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/5,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(text,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_font_family.setVisible(true);
            font_family.setVisible(true);
            Toolbox.implements_label(type_font_family,"Font family:",false,PANEL_WIDTH/80,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_font_family,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(font_family,null,PANEL_WIDTH/80+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(font_family,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_font_size.setVisible(true);
            font_size.setVisible(true);
            Toolbox.implements_label(type_font_size,"Font size:",false,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_font_size,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(font_size,null,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,9,details);
            Toolbox.edit_combobox(font_size,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            border.setVisible(true);
            Toolbox.implements_checkbox(border,"Border",PANEL_WIDTH/40,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edit_checkbox(border,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            
            opaque.setVisible(true);
            Toolbox.implements_checkbox(opaque,"Opaque",PANEL_WIDTH/9,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edit_checkbox(opaque,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);

            editable.setVisible(true);
            Toolbox.implements_checkbox(editable,"Editable",PANEL_WIDTH/5,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edit_checkbox(editable,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);

            Toolbox.implements_panel_in_a_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_passwordfield){
            type="passwordfield";
            restart_detais_panel();

            type_variable_name.setVisible(true);
            variable_name.setVisible(true);
            Toolbox.implements_label(type_variable_name,"Type variable name:",false,0,PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_variable_name,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(variable_name,"",PANEL_WIDTH/10,PANEL_HEIGHT/100,PANEL_WIDTH/6,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(variable_name,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_X.setVisible(true);
            X_pos.setVisible(true);
            Toolbox.implements_label(type_X,"X:",false,PANEL_WIDTH/20,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_X,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(X_pos,null,PANEL_WIDTH/20+PANEL_WIDTH/30,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(X_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_Y.setVisible(true);
            Y_pos.setVisible(true);
            Toolbox.implements_label(type_Y,"Y:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_Y,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(Y_pos,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(Y_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_width.setVisible(true);
            width.setVisible(true);
            Toolbox.implements_label(type_width,"Width:",false,PANEL_WIDTH/20,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_width,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(width,null,PANEL_WIDTH/20+PANEL_WIDTH/30,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(width,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_height.setVisible(true);
            height.setVisible(true);
            Toolbox.implements_label(type_height,"Height:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_height,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(height,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(height,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            content_background_color.setVisible(true);
            Toolbox.implements_button(content_background_color,"Background color",PANEL_WIDTH/50,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            content_foreground_color.setVisible(true);
            Toolbox.implements_button(content_foreground_color,"Foreground color",PANEL_WIDTH/20+PANEL_WIDTH/10,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);

            type_font_size.setVisible(true);
            font_size.setVisible(true);
            Toolbox.implements_label(type_font_size,"Font size:",false,PANEL_WIDTH/12,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_font_size,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(font_size,null,PANEL_WIDTH/12+PANEL_WIDTH/20,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,9,details);
            Toolbox.edit_combobox(font_size,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            border.setVisible(true);
            Toolbox.implements_checkbox(border,"Border",PANEL_WIDTH/18,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edit_checkbox(border,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            
            opaque.setVisible(true);
            Toolbox.implements_checkbox(opaque,"Opaque",PANEL_WIDTH/6,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edit_checkbox(opaque,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            
            Toolbox.implements_panel_in_a_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);            
            details.setVisible(true);

        }
        else if(e.getSource()==add_textarea){
            type="textarea";
            restart_detais_panel();

            type_variable_name.setVisible(true);
            variable_name.setVisible(true);
            Toolbox.implements_label(type_variable_name,"Type variable name:",false,0,PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_variable_name,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(variable_name,"",PANEL_WIDTH/10,PANEL_HEIGHT/100,PANEL_WIDTH/6,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(variable_name,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_X.setVisible(true);
            X_pos.setVisible(true);
            Toolbox.implements_label(type_X,"X:",false,PANEL_WIDTH/20,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_X,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(X_pos,null,PANEL_WIDTH/20+PANEL_WIDTH/30,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(X_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_Y.setVisible(true);
            Y_pos.setVisible(true);
            Toolbox.implements_label(type_Y,"Y:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_Y,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(Y_pos,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(Y_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_width.setVisible(true);
            width.setVisible(true);
            Toolbox.implements_label(type_width,"Width:",false,PANEL_WIDTH/20,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_width,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(width,null,PANEL_WIDTH/20+PANEL_WIDTH/30,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(width,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_height.setVisible(true);
            height.setVisible(true);
            Toolbox.implements_label(type_height,"Height:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_height,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(height,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(height,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            content_background_color.setVisible(true);
            Toolbox.implements_button(content_background_color,"Background color",PANEL_WIDTH/50,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            content_foreground_color.setVisible(true);
            Toolbox.implements_button(content_foreground_color,"Foreground color",PANEL_WIDTH/20+PANEL_WIDTH/10,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            type_text.setVisible(true);
            text.setVisible(true);
            Toolbox.implements_label(type_text,"Text:",false,PANEL_WIDTH/130,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_text,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(text,"",PANEL_WIDTH/25,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/5,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(text,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_font_family.setVisible(true);
            font_family.setVisible(true);
            Toolbox.implements_label(type_font_family,"Font family:",false,PANEL_WIDTH/80,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_font_family,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(font_family,null,PANEL_WIDTH/80+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(font_family,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_font_size.setVisible(true);
            font_size.setVisible(true);
            Toolbox.implements_label(type_font_size,"Font size:",false,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_font_size,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(font_size,null,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,9,details);
            Toolbox.edit_combobox(font_size,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            border.setVisible(true);
            Toolbox.implements_checkbox(border,"Border",PANEL_WIDTH/18,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edit_checkbox(border,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            
            editable.setVisible(true);
            Toolbox.implements_checkbox(editable,"Editable",PANEL_WIDTH/6,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edit_checkbox(editable,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);

            Toolbox.implements_panel_in_a_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_scrollpane){
            type="scrollpane";
            restart_detais_panel();

            type_variable_name.setVisible(true);
            variable_name.setVisible(true);
            Toolbox.implements_label(type_variable_name,"Type variable name:",false,0,PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_variable_name,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(variable_name,"",PANEL_WIDTH/10,PANEL_HEIGHT/100,PANEL_WIDTH/6,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(variable_name,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_X.setVisible(true);
            X_pos.setVisible(true);
            Toolbox.implements_label(type_X,"X:",false,PANEL_WIDTH/20,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_X,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(X_pos,null,PANEL_WIDTH/20+PANEL_WIDTH/30,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(X_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_Y.setVisible(true);
            Y_pos.setVisible(true);
            Toolbox.implements_label(type_Y,"Y:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_Y,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(Y_pos,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(Y_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_width.setVisible(true);
            width.setVisible(true);
            Toolbox.implements_label(type_width,"Width:",false,PANEL_WIDTH/20,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_width,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(width,null,PANEL_WIDTH/20+PANEL_WIDTH/30,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(width,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_height.setVisible(true);
            height.setVisible(true);
            Toolbox.implements_label(type_height,"Height:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_height,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(height,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(height,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            content_background_color.setVisible(true);
            Toolbox.implements_button(content_background_color,"Background color",PANEL_WIDTH/50,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            content_foreground_color.setVisible(true);
            Toolbox.implements_button(content_foreground_color,"Foreground color",PANEL_WIDTH/20+PANEL_WIDTH/10,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            type_text.setVisible(true);
            text.setVisible(true);
            Toolbox.implements_label(type_text,"Text:",false,PANEL_WIDTH/130,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_text,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(text,"",PANEL_WIDTH/25,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/5,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(text,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_font_family.setVisible(true);
            font_family.setVisible(true);
            Toolbox.implements_label(type_font_family,"Font family:",false,PANEL_WIDTH/80,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_font_family,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(font_family,null,PANEL_WIDTH/80+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(font_family,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_font_size.setVisible(true);
            font_size.setVisible(true);
            Toolbox.implements_label(type_font_size,"Font size:",false,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_font_size,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(font_size,null,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,9,details);
            Toolbox.edit_combobox(font_size,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_rows.setVisible(true);
            rows.setVisible(true);
            Toolbox.implements_label(type_rows,"Rows:",false,PANEL_WIDTH/100,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_rows,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(rows,"",PANEL_WIDTH/80+PANEL_WIDTH/30,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/40,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(rows,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);
            
            type_columns.setVisible(true);
            columns.setVisible(true);
            Toolbox.implements_label(type_columns,"Columns:",false,PANEL_WIDTH/20+PANEL_WIDTH/30,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_columns,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(columns,"",PANEL_WIDTH/20+PANEL_WIDTH/30+PANEL_WIDTH/20,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/40,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(columns,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            scrollpane_background_color.setVisible(true);
            Toolbox.implements_button(scrollpane_background_color,"Panel color",PANEL_WIDTH/6,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);

            border.setVisible(true);
            Toolbox.implements_checkbox(border,"Border",PANEL_WIDTH/40,7*PANEL_HEIGHT/25+8*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edit_checkbox(border,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            
            opaque.setVisible(true);
            Toolbox.implements_checkbox(opaque,"Opaque",PANEL_WIDTH/9,7*PANEL_HEIGHT/25+8*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edit_checkbox(opaque,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);

            editable.setVisible(true);
            Toolbox.implements_checkbox(editable,"Editable",PANEL_WIDTH/5,7*PANEL_HEIGHT/25+8*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edit_checkbox(editable,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);

            Toolbox.implements_panel_in_a_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);            
            details.setVisible(true);
        }
        else if(e.getSource()==add_button){
            type="button";
            restart_detais_panel();

            type_variable_name.setVisible(true);
            variable_name.setVisible(true);
            Toolbox.implements_label(type_variable_name,"Type variable name:",false,0,PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_variable_name,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(variable_name,"",PANEL_WIDTH/10,PANEL_HEIGHT/100,PANEL_WIDTH/6,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(variable_name,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_X.setVisible(true);
            X_pos.setVisible(true);
            Toolbox.implements_label(type_X,"X:",false,PANEL_WIDTH/20,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_X,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(X_pos,null,PANEL_WIDTH/20+PANEL_WIDTH/30,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(X_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_Y.setVisible(true);
            Y_pos.setVisible(true);
            Toolbox.implements_label(type_Y,"Y:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_Y,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(Y_pos,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(Y_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_width.setVisible(true);
            width.setVisible(true);
            Toolbox.implements_label(type_width,"Width:",false,PANEL_WIDTH/20,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_width,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(width,null,PANEL_WIDTH/20+PANEL_WIDTH/30,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(width,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_height.setVisible(true);
            height.setVisible(true);
            Toolbox.implements_label(type_height,"Height:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_height,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(height,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(height,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            content_background_color.setVisible(true);
            Toolbox.implements_button(content_background_color,"Background color",PANEL_WIDTH/50,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            content_foreground_color.setVisible(true);
            Toolbox.implements_button(content_foreground_color,"Foreground color",PANEL_WIDTH/20+PANEL_WIDTH/10,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            type_text.setVisible(true);
            text.setVisible(true);
            Toolbox.implements_label(type_text,"Text:",false,PANEL_WIDTH/130,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_text,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(text,"",PANEL_WIDTH/25,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/5,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(text,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_font_family.setVisible(true);
            font_family.setVisible(true);
            Toolbox.implements_label(type_font_family,"Font family:",false,PANEL_WIDTH/80,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_font_family,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(font_family,null,PANEL_WIDTH/80+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(font_family,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_font_size.setVisible(true);
            font_size.setVisible(true);
            Toolbox.implements_label(type_font_size,"Font size:",false,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_font_size,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(font_size,null,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,9,details);
            Toolbox.edit_combobox(font_size,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            Toolbox.implements_panel_in_a_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_combobox){
            type="combobox";
            restart_detais_panel();

            type_variable_name.setVisible(true);
            variable_name.setVisible(true);
            Toolbox.implements_label(type_variable_name,"Type variable name:",false,0,PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_variable_name,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(variable_name,"",PANEL_WIDTH/10,PANEL_HEIGHT/100,PANEL_WIDTH/6,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(variable_name,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_X.setVisible(true);
            X_pos.setVisible(true);
            Toolbox.implements_label(type_X,"X:",false,PANEL_WIDTH/20,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_X,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(X_pos,null,PANEL_WIDTH/20+PANEL_WIDTH/30,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(X_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_Y.setVisible(true);
            Y_pos.setVisible(true);
            Toolbox.implements_label(type_Y,"Y:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_Y,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(Y_pos,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(Y_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_width.setVisible(true);
            width.setVisible(true);
            Toolbox.implements_label(type_width,"Width:",false,PANEL_WIDTH/20,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_width,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(width,null,PANEL_WIDTH/20+PANEL_WIDTH/30,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(width,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_height.setVisible(true);
            height.setVisible(true);
            Toolbox.implements_label(type_height,"Height:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_height,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(height,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(height,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            content_background_color.setVisible(true);
            Toolbox.implements_button(content_background_color,"Background color",PANEL_WIDTH/50,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            content_foreground_color.setVisible(true);
            Toolbox.implements_button(content_foreground_color,"Foreground color",PANEL_WIDTH/20+PANEL_WIDTH/10,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);

            type_font_family.setVisible(true);
            font_family.setVisible(true);
            Toolbox.implements_label(type_font_family,"Font family:",false,PANEL_WIDTH/80,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_font_family,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(font_family,null,PANEL_WIDTH/80+PANEL_WIDTH/20,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(font_family,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_font_size.setVisible(true);
            font_size.setVisible(true);
            Toolbox.implements_label(type_font_size,"Font size:",false,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_font_size,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(font_size,null,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25+PANEL_WIDTH/20,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,9,details);
            Toolbox.edit_combobox(font_size,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_combobox_items.setVisible(true);
            combobox_items.setVisible(true);
            Toolbox.implements_label(type_combobox_items,"Type,combobox,items:",false,PANEL_WIDTH/130,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_combobox_items,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(combobox_items,"",PANEL_WIDTH/9,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/7,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(combobox_items,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_combobox_initial_item.setVisible(true);
            combobox_initial_item.setVisible(true);
            Toolbox.implements_label(type_combobox_initial_item,"Initial item index:",false,PANEL_WIDTH/80,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_combobox_initial_item,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(combobox_initial_item,"",PANEL_WIDTH/80+PANEL_WIDTH/10,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/40,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(combobox_initial_item,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);
            
            type_combobox_rows_displayed.setVisible(true);
            combobox_combobox_rows_displayed.setVisible(true);
            Toolbox.implements_label(type_combobox_rows_displayed,"Rows displayed:",false,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/12,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_combobox_rows_displayed,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(combobox_combobox_rows_displayed,"",PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25+PANEL_WIDTH/12,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/40,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(combobox_combobox_rows_displayed,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);
            
            Toolbox.implements_panel_in_a_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_radiobutton){
            type="radiobutton";
            restart_detais_panel();

            type_variable_name.setVisible(true);
            variable_name.setVisible(true);
            Toolbox.implements_label(type_variable_name,"Type variable name:",false,0,PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_variable_name,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(variable_name,"",PANEL_WIDTH/10,PANEL_HEIGHT/100,PANEL_WIDTH/6,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(variable_name,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_X.setVisible(true);
            X_pos.setVisible(true);
            Toolbox.implements_label(type_X,"X:",false,PANEL_WIDTH/20,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_X,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(X_pos,null,PANEL_WIDTH/20+PANEL_WIDTH/30,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(X_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_Y.setVisible(true);
            Y_pos.setVisible(true);
            Toolbox.implements_label(type_Y,"Y:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_Y,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(Y_pos,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(Y_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_width.setVisible(true);
            width.setVisible(true);
            Toolbox.implements_label(type_width,"Width:",false,PANEL_WIDTH/20,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_width,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(width,null,PANEL_WIDTH/20+PANEL_WIDTH/30,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(width,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_height.setVisible(true);
            height.setVisible(true);
            Toolbox.implements_label(type_height,"Height:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_height,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(height,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(height,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            content_background_color.setVisible(true);
            Toolbox.implements_button(content_background_color,"Background color",PANEL_WIDTH/50,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            content_foreground_color.setVisible(true);
            Toolbox.implements_button(content_foreground_color,"Foreground color",PANEL_WIDTH/20+PANEL_WIDTH/10,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            type_text.setVisible(true);
            text.setVisible(true);
            Toolbox.implements_label(type_text,"Text:",false,PANEL_WIDTH/130,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_text,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(text,"",PANEL_WIDTH/25,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/5,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(text,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_font_family.setVisible(true);
            font_family.setVisible(true);
            Toolbox.implements_label(type_font_family,"Font family:",false,PANEL_WIDTH/80,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_font_family,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(font_family,null,PANEL_WIDTH/80+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(font_family,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_font_size.setVisible(true);
            font_size.setVisible(true);
            Toolbox.implements_label(type_font_size,"Font size:",false,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_font_size,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(font_size,null,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,9,details);
            Toolbox.edit_combobox(font_size,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_button_group.setVisible(true);
            button_group.setVisible(true);
            Toolbox.implements_label(type_button_group,"Button_group_variable:",false,PANEL_WIDTH/130,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_button_group,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(button_group,"",PANEL_WIDTH/9,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/8,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(button_group,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            opaque.setVisible(true);
            Toolbox.implements_checkbox(opaque,"Opaque",PANEL_WIDTH/9,7*PANEL_HEIGHT/25+8*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edit_checkbox(opaque,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);

            Toolbox.implements_panel_in_a_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_table){
            type="table";
            restart_detais_panel();

            type_variable_name.setVisible(true);
            variable_name.setVisible(true);
            Toolbox.implements_label(type_variable_name,"Type variable name:",false,0,PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_variable_name,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(variable_name,"",PANEL_WIDTH/10,PANEL_HEIGHT/100,PANEL_WIDTH/6,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(variable_name,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_X.setVisible(true);
            X_pos.setVisible(true);
            Toolbox.implements_label(type_X,"X:",false,PANEL_WIDTH/20,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_X,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(X_pos,null,PANEL_WIDTH/20+PANEL_WIDTH/30,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(X_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_Y.setVisible(true);
            Y_pos.setVisible(true);
            Toolbox.implements_label(type_Y,"Y:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_Y,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(Y_pos,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(Y_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_width.setVisible(true);
            width.setVisible(true);
            Toolbox.implements_label(type_width,"Width:",false,PANEL_WIDTH/20,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_width,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(width,null,PANEL_WIDTH/20+PANEL_WIDTH/30,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(width,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_height.setVisible(true);
            height.setVisible(true);
            Toolbox.implements_label(type_height,"Height:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_height,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(height,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(height,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_columns_names.setVisible(true);
            columns_names.setVisible(true);
            Toolbox.implements_label(type_columns_names,"Type,columns,names:",false,PANEL_WIDTH/130,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_columns_names,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(columns_names,"",PANEL_WIDTH/9,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/7,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(columns_names,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            Toolbox.implements_panel_in_a_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_image){
            type="image";
            restart_detais_panel();

            type_variable_name.setVisible(true);
            variable_name.setVisible(true);
            Toolbox.implements_label(type_variable_name,"Type variable name:",false,0,PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_variable_name,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(variable_name,"",PANEL_WIDTH/10,PANEL_HEIGHT/100,PANEL_WIDTH/6,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(variable_name,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_X.setVisible(true);
            X_pos.setVisible(true);
            Toolbox.implements_label(type_X,"X:",false,PANEL_WIDTH/20,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_X,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(X_pos,null,PANEL_WIDTH/20+PANEL_WIDTH/30,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(X_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_Y.setVisible(true);
            Y_pos.setVisible(true);
            Toolbox.implements_label(type_Y,"Y:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_Y,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(Y_pos,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(Y_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_width.setVisible(true);
            width.setVisible(true);
            Toolbox.implements_label(type_width,"Width:",false,PANEL_WIDTH/20,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_width,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(width,null,PANEL_WIDTH/20+PANEL_WIDTH/30,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(width,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_height.setVisible(true);
            height.setVisible(true);
            Toolbox.implements_label(type_height,"Height:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_height,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(height,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(height,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_link.setVisible(true);
            link.setVisible(true);
            Toolbox.implements_label(type_link,"Source:",false,PANEL_WIDTH/140,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_link,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(link,"",PANEL_WIDTH/25,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/5,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(link,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            Toolbox.implements_panel_in_a_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_bar){
            type="bar";
            restart_detais_panel();

            type_variable_name.setVisible(true);
            variable_name.setVisible(true);
            Toolbox.implements_label(type_variable_name,"Type variable name:",false,0,PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_variable_name,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(variable_name,"",PANEL_WIDTH/10,PANEL_HEIGHT/100,PANEL_WIDTH/6,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(variable_name,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_X.setVisible(true);
            X_pos.setVisible(true);
            Toolbox.implements_label(type_X,"X:",false,PANEL_WIDTH/20,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_X,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(X_pos,null,PANEL_WIDTH/20+PANEL_WIDTH/30,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(X_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_Y.setVisible(true);
            Y_pos.setVisible(true);
            Toolbox.implements_label(type_Y,"Y:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_Y,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(Y_pos,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(Y_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_width.setVisible(true);
            width.setVisible(true);
            Toolbox.implements_label(type_width,"Width:",false,PANEL_WIDTH/20,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_width,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(width,null,PANEL_WIDTH/20+PANEL_WIDTH/30,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(width,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_height.setVisible(true);
            height.setVisible(true);
            Toolbox.implements_label(type_height,"Height:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_height,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(height,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(height,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            content_background_color.setVisible(true);
            Toolbox.implements_button(content_background_color,"Background color",PANEL_WIDTH/50,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            content_foreground_color.setVisible(true);
            Toolbox.implements_button(content_foreground_color,"Foreground color",PANEL_WIDTH/20+PANEL_WIDTH/10,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            type_value.setVisible(true);
            value.setVisible(true);
            Toolbox.implements_label(type_value,"Value:",false,0,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_value,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(value,"",PANEL_WIDTH/25,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(value,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_min.setVisible(true);
            min.setVisible(true);
            Toolbox.implements_label(type_min,"Min:",false,2*PANEL_WIDTH/25,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_min,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(min,"",3*PANEL_WIDTH/25,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(min,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_max.setVisible(true);
            max.setVisible(true);
            Toolbox.implements_label(type_max,"Max:",false,4*PANEL_WIDTH/25,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_max,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(max,"",5*PANEL_WIDTH/25,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(max,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            Toolbox.implements_panel_in_a_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==add_checkbox){
            type="checkbox";
            restart_detais_panel();

            type_variable_name.setVisible(true);
            variable_name.setVisible(true);
            Toolbox.implements_label(type_variable_name,"Type variable name:",false,0,PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_variable_name,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(variable_name,"",PANEL_WIDTH/10,PANEL_HEIGHT/100,PANEL_WIDTH/6,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(variable_name,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_X.setVisible(true);
            X_pos.setVisible(true);
            Toolbox.implements_label(type_X,"X:",false,PANEL_WIDTH/20,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_X,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(X_pos,null,PANEL_WIDTH/20+PANEL_WIDTH/30,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(X_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_Y.setVisible(true);
            Y_pos.setVisible(true);
            Toolbox.implements_label(type_Y,"Y:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_Y,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(Y_pos,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,PANEL_HEIGHT/25+2*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(Y_pos,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_width.setVisible(true);
            width.setVisible(true);
            Toolbox.implements_label(type_width,"Width:",false,PANEL_WIDTH/20,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_width,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(width,null,PANEL_WIDTH/20+PANEL_WIDTH/30,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(width,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_height.setVisible(true);
            height.setVisible(true);
            Toolbox.implements_label(type_height,"Height:",false,PANEL_WIDTH/15+PANEL_WIDTH/30+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_height,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(height,null,PANEL_WIDTH/15+PANEL_WIDTH/15+PANEL_WIDTH/25,2*PANEL_HEIGHT/25+3*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(height,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            content_background_color.setVisible(true);
            Toolbox.implements_button(content_background_color,"Background color",PANEL_WIDTH/50,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            content_foreground_color.setVisible(true);
            Toolbox.implements_button(content_foreground_color,"Foreground color",PANEL_WIDTH/20+PANEL_WIDTH/10,3*PANEL_HEIGHT/25+4*PANEL_HEIGHT/100,PANEL_WIDTH/10,PANEL_HEIGHT/25,details);
            
            type_text.setVisible(true);
            text.setVisible(true);
            Toolbox.implements_label(type_text,"Text:",false,PANEL_WIDTH/130,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/30,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_text,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_textfield(text,"",PANEL_WIDTH/25,4*PANEL_HEIGHT/25+5*PANEL_HEIGHT/100,PANEL_WIDTH/5,PANEL_HEIGHT/25,true,true,details);
            Toolbox.edit_textfield(text,new Font("Dialog",Font.PLAIN,14),new Color(128,128,128),Color.WHITE);

            type_font_family.setVisible(true);
            font_family.setVisible(true);
            Toolbox.implements_label(type_font_family,"Font family:",false,PANEL_WIDTH/80,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_font_family,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(font_family,null,PANEL_WIDTH/80+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,10,0,details);
            Toolbox.edit_combobox(font_family,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            type_font_size.setVisible(true);
            font_size.setVisible(true);
            Toolbox.implements_label(type_font_size,"Font size:",false,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/20,PANEL_HEIGHT/25,details);
            Toolbox.edit_label(type_font_size,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            Toolbox.implements_combobox(font_size,null,PANEL_WIDTH/15+PANEL_WIDTH/25+PANEL_WIDTH/25+PANEL_WIDTH/20,5*PANEL_HEIGHT/25+6*PANEL_HEIGHT/100,PANEL_WIDTH/25,PANEL_HEIGHT/25,10,9,details);
            Toolbox.edit_combobox(font_size,new Font("Dialog",Font.PLAIN,12),new Color(128,128,128),Color.WHITE);

            checked.setVisible(true);
            Toolbox.implements_checkbox(checked,"Checked",PANEL_WIDTH/18,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edit_checkbox(checked,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);
            
            opaque.setVisible(true);
            Toolbox.implements_checkbox(opaque,"Opaque",PANEL_WIDTH/6,6*PANEL_HEIGHT/25+7*PANEL_HEIGHT/100,PANEL_WIDTH/15,PANEL_HEIGHT/25,false,details);
            Toolbox.edit_checkbox(opaque,new Font("Dialog",Font.PLAIN,14),new Color(64,64,64),Color.WHITE);

            Toolbox.implements_panel_in_a_panel(details,right,15*PANEL_WIDTH/1000,PANEL_HEIGHT/3+2*PANEL_HEIGHT/18,2685*PANEL_WIDTH/10000,PANEL_HEIGHT-20*PANEL_HEIGHT/35);
            details.setVisible(true);
        }
        else if(e.getSource()==preview_item){
            if(type.equals("label")){
                
                if(preview!=null){
                    Interface.center.setVisible(false);
                    Interface.center.remove(preview);
                    Interface.center.setVisible(true);
                }
                preview = null;
                preview = new JLabel();
                
                preview.setBounds(
                    (int)(Interface.center.getWidth()*((float)X_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)Y_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getWidth()*((float)width.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)height.getSelectedIndex()/100))
                );

                if(opaque.isSelected()){preview.setOpaque(true);}
                else{preview.setOpaque(false);preview.setBackground(new Color(0,0,0,64));}

                preview.setBackground(content_background_color.getBackground());
                preview.setForeground(content_foreground_color.getBackground());
                preview.setFont(new Font(font_family.getSelectedItem().toString(),Font.PLAIN,font_size.getSelectedIndex()+1));

                ((JLabel)preview).setHorizontalAlignment(JLabel.CENTER);
                ((JLabel)preview).setText(text.getText());

                if(border.isSelected()){preview.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));}
                else{preview.setBorder(null);}

                Interface.center.setVisible(false);
                Interface.center.add(preview);
                Interface.center.setVisible(true);
            
            }
            else if(type.equals("textfield")){
                
                if(preview!=null){
                    Interface.center.setVisible(false);
                    Interface.center.remove(preview);
                    Interface.center.setVisible(true);
                }
                preview=null;
                preview=new JTextField();
            
                preview.setBounds(
                    (int)(Interface.center.getWidth()*((float)X_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)Y_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getWidth()*((float)width.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)height.getSelectedIndex()/100))
                );
                
                if(opaque.isSelected()){preview.setOpaque(true);}
                else{preview.setOpaque(false);preview.setBackground(new Color(0,0,0,64));}
                
                preview.setBackground(content_background_color.getBackground());
                preview.setForeground(content_foreground_color.getBackground());
                preview.setFont(new Font(font_family.getSelectedItem().toString(),Font.PLAIN,font_size.getSelectedIndex()+1));
            
                ((JTextField)preview).setHorizontalAlignment(JTextField.CENTER);
                ((JTextField)preview).setText(text.getText());
                
                if(editable.isSelected()){((JTextField)preview).setEditable(true);}
                else{((JTextField)preview).setEditable(false);}

                if(border.isSelected()){preview.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));}
                else{preview.setBorder(null);}
                
                Interface.center.setVisible(false);
                Interface.center.add(preview);
                Interface.center.setVisible(true);

            }
            else if(type.equals("passwordfield")){
                
                if(preview!=null){
                    Interface.center.setVisible(false);
                    Interface.center.remove(preview);
                    Interface.center.setVisible(true);
                }
                preview=null;
                preview=new JPasswordField();
            
                preview.setBounds(
                    (int)(Interface.center.getWidth()*((float)X_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)Y_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getWidth()*((float)width.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)height.getSelectedIndex()/100))
                );
                if(opaque.isSelected()){preview.setOpaque(true);}
                else{preview.setOpaque(false);preview.setBackground(new Color(0,0,0,64));}
                preview.setBackground(content_background_color.getBackground());
                preview.setForeground(content_foreground_color.getBackground());
                preview.setFont(new Font("Dialog",Font.PLAIN,font_size.getSelectedIndex()+1));
            
                ((JPasswordField)preview).setHorizontalAlignment(JTextField.CENTER);
                ((JPasswordField)preview).setText("");
                
                if(border.isSelected()){preview.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));}
                else{preview.setBorder(null);}
                Interface.center.setVisible(false);
                Interface.center.add(preview);
                Interface.center.setVisible(true);

            }
            else if(type.equals("textarea")){
                
                if(preview!=null){
                    Interface.center.setVisible(false);
                    Interface.center.remove(preview);
                    Interface.center.setVisible(true);
                }
                preview=null;
                preview=new JTextArea();
            
                preview.setBounds(
                    (int)(Interface.center.getWidth()*((float)X_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)Y_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getWidth()*((float)width.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)height.getSelectedIndex()/100))
                );
                if(opaque.isSelected()){preview.setOpaque(true);}
                else{preview.setOpaque(false);preview.setBackground(new Color(0,0,0,64));}
                preview.setBackground(content_background_color.getBackground());
                preview.setForeground(content_foreground_color.getBackground());
                preview.setFont(new Font(font_family.getSelectedItem().toString(),Font.PLAIN,font_size.getSelectedIndex()+1));
            
                ((JTextArea)preview).setText(text.getText());
                
                if(editable.isSelected()){((JTextArea)preview).setEditable(true);}
                else{((JTextArea)preview).setEditable(false);}

                if(border.isSelected()){preview.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));}
                else{preview.setBorder(null);}
                
                preview.setOpaque(true);

                Interface.center.setVisible(false);
                Interface.center.add(preview);
                Interface.center.setVisible(true);

            }
            else if(type.equals("scrollpane")){

                if(preview!=null){
                    Interface.center.setVisible(false);
                    Interface.center.remove(preview);
                    Interface.center.setVisible(true);
                }
                preview=null;
                preview=new JPanel();

                JTextArea textarea = new JTextArea();
                JScrollPane scrollPane = new JScrollPane(textarea);
                
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

                preview.setBounds(
                    (int)(Interface.center.getWidth()*((float)X_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)Y_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getWidth()*((float)width.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)height.getSelectedIndex()/100))
                );

                ((JTextArea)textarea).setRows(Integer.parseInt(rows.getText()));
                ((JTextArea)textarea).setColumns(Integer.parseInt(columns.getText()));
                
                textarea.setBackground(content_background_color.getBackground());
                textarea.setForeground(content_foreground_color.getBackground());
                textarea.setFont(new Font(font_family.getSelectedItem().toString(),Font.PLAIN,font_size.getSelectedIndex()+1));
            
                ((JTextArea)textarea).setText(text.getText());
                
                if(opaque.isSelected()){textarea.setOpaque(true);preview.setBackground(scrollpane_background_color.getBackground());}
                else{textarea.setOpaque(false);preview.setBackground(new Color(0,0,0,0));}

                if(editable.isSelected()){((JTextArea)textarea).setEditable(true);}
                else{((JTextArea)textarea).setEditable(false);}

                if(border.isSelected()){textarea.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));}
                else{textarea.setBorder(null);}
                
                Interface.center.setVisible(false);
                preview.add(scrollPane);
                Interface.center.add(preview);
                Interface.center.setVisible(true);
            
            }
            else if(type.equals("button")){
                
                if(preview!=null){
                    Interface.center.setVisible(false);
                    Interface.center.remove(preview);
                    Interface.center.setVisible(true);
                }
                preview=null;
                preview = new JButton();
                
                preview.setBounds(
                    (int)(Interface.center.getWidth()*((float)X_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)Y_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getWidth()*((float)width.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)height.getSelectedIndex()/100))
                );

                preview.setBackground(content_background_color.getBackground());
                preview.setForeground(content_foreground_color.getBackground());
                preview.setFont(new Font(font_family.getSelectedItem().toString(),Font.PLAIN,font_size.getSelectedIndex()+1));

                ((JButton)preview).setHorizontalAlignment(JLabel.CENTER);
                ((JButton)preview).setText(text.getText());

                Interface.center.setVisible(false);
                Interface.center.add(preview);
                Interface.center.setVisible(true);

            }
            else if(type.equals("combobox")){
                
                if(preview!=null){
                    Interface.center.setVisible(false);
                    Interface.center.remove(preview);
                    Interface.center.setVisible(true);
                }
                preview=null;

                //add items
                int n_of_items = 0;
                for(int i=0;i<combobox_items.getText().length();i++){if(combobox_items.getText().charAt(i)==','){n_of_items++;}}
                String[] items = new String[n_of_items+1];
                String item = "";
                int count = 0;
                for(int i=0;i<combobox_items.getText().length();i++){
                    if(combobox_items.getText().charAt(i)!=','){item+=combobox_items.getText().charAt(i);}
                    else{items[count]=item;item="";count++;}
                }
                items[count]=item;
                
                preview = new JComboBox<String>(items);
                
                preview.setBounds(
                    (int)(Interface.center.getWidth()*((float)X_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)Y_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getWidth()*((float)width.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)height.getSelectedIndex()/100))
                );

                preview.setBackground(content_background_color.getBackground());
                preview.setForeground(content_foreground_color.getBackground());
                preview.setFont(new Font(font_family.getSelectedItem().toString(),Font.PLAIN,font_size.getSelectedIndex()+1));

                ((JComboBox<String>)preview).setAlignmentX(JComboBox.CENTER_ALIGNMENT);

                ((JComboBox<String>)preview).setMaximumRowCount(Integer.parseInt(combobox_combobox_rows_displayed.getText()));
                ((JComboBox<String>)preview).setSelectedIndex(Integer.parseInt(combobox_initial_item.getText()));

                //centralize the items
                DefaultListCellRenderer dlcr = new DefaultListCellRenderer();
                dlcr.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
                ((JComboBox<String>)preview).setRenderer(dlcr);

                Interface.center.setVisible(false);
                Interface.center.add(preview);
                Interface.center.setVisible(true);
                
            }
            else if(type.equals("radiobutton")){
                
                if(preview!=null){
                    Interface.center.setVisible(false);
                    Interface.center.remove(preview);
                    Interface.center.setVisible(true);
                }
                preview=null;
                preview=new JRadioButton();
            
                preview.setBounds(
                    (int)(Interface.center.getWidth()*((float)X_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)Y_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getWidth()*((float)width.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)height.getSelectedIndex()/100))
                );
                
                preview.setBackground(content_background_color.getBackground());
                preview.setForeground(content_foreground_color.getBackground());
                preview.setFont(new Font(font_family.getSelectedItem().toString(),Font.PLAIN,font_size.getSelectedIndex()+1));
            
                ((JRadioButton)preview).setHorizontalAlignment(JRadioButton.CENTER);
                ((JRadioButton)preview).setText(text.getText());
                
                if(opaque.isSelected()){preview.setOpaque(true);}
                else{preview.setOpaque(false);preview.setBackground(new Color(0,0,0,64));}
                
                Interface.center.setVisible(false);
                Interface.center.add(preview);
                Interface.center.setVisible(true);

            }
            else if(type.equals("table")){

            }
            else if(type.equals("image")){

                if(preview!=null){
                    Interface.center.setVisible(false);
                    Interface.center.remove(preview);
                    Interface.center.setVisible(true);
                }
                preview=null;
                preview = new JLabel();
                
                preview.setBounds(
                    (int)(Interface.center.getWidth()*((float)X_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)Y_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getWidth()*((float)width.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)height.getSelectedIndex()/100))
                );

                //temporary resize for the center panel
                try {
                    BufferedImage originalImage = ImageIO.read(new File(link.getText()));

                    BufferedImage resizedImage = new BufferedImage(originalImage.getWidth()/2,originalImage.getHeight()/2,BufferedImage.TYPE_INT_RGB);
                    Graphics2D graphics2d = resizedImage.createGraphics();
            
                    graphics2d.drawImage(originalImage,0,0,originalImage.getWidth()/2,originalImage.getHeight()/2,null);
                    graphics2d.dispose();
                    ((JLabel)preview).setIcon(new ImageIcon((Image)resizedImage));
                } catch (Exception exception_resized) {
                    exception_resized.printStackTrace();
                }
                //((JLabel)preview).setIcon(new ImageIcon(link.getText()));

                Interface.center.setVisible(false);
                Interface.center.add(preview);
                Interface.center.setVisible(true);

            }
            else if(type.equals("bar")){
                
                if(preview!=null){
                    Interface.center.setVisible(false);
                    Interface.center.remove(preview);
                    Interface.center.setVisible(true);
                }
                preview=null;
                preview=new JProgressBar();

                preview.setBounds(
                    (int)(Interface.center.getWidth()*((float)X_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)Y_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getWidth()*((float)width.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)height.getSelectedIndex()/100))
                );

                ((JProgressBar)preview).setMinimum(Integer.parseInt(min.getText()));
                ((JProgressBar)preview).setMaximum(Integer.parseInt(max.getText()));
                ((JProgressBar)preview).setValue(Integer.parseInt(value.getText()));

                preview.setBackground(content_background_color.getBackground());
                preview.setForeground(content_foreground_color.getBackground());

                Interface.center.setVisible(false);
                Interface.center.add(preview);
                Interface.center.setVisible(true);

            }
            else if(type.equals("checkbox")){

                if(preview!=null){
                    Interface.center.setVisible(false);
                    Interface.center.remove(preview);
                    Interface.center.setVisible(true);
                }
                preview=null;
                preview=new JCheckBox();
            
                preview.setBounds(
                    (int)(Interface.center.getWidth()*((float)X_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)Y_pos.getSelectedIndex()/100)),
                    (int)(Interface.center.getWidth()*((float)width.getSelectedIndex()/100)),
                    (int)(Interface.center.getHeight()*((float)height.getSelectedIndex()/100))
                );

                if(opaque.isSelected()){preview.setOpaque(true);}
                else{preview.setOpaque(false);preview.setBackground(new Color(0,0,0,64));}
                
                preview.setBackground(content_background_color.getBackground());
                preview.setForeground(content_foreground_color.getBackground());
                
                preview.setFont(new Font(font_family.getSelectedItem().toString(),Font.PLAIN,font_size.getSelectedIndex()+1));
                ((JCheckBox)preview).setText(text.getText());
                ((JCheckBox)preview).setHorizontalAlignment(JCheckBox.CENTER);
                
                if(checked.isSelected()){((JCheckBox)preview).setSelected(true);}
                else{((JCheckBox)preview).setSelected(true);}

                Interface.center.setVisible(false);
                Interface.center.add(preview);
                Interface.center.setVisible(true);   

            }
        }
        else if(e.getSource()==add_item){
            if(preview==null){
                Toolbox.error_message("Click PREVIEW first","PREVIEW NOT CLICKED YET");
            }
            else{
                if(variable_name.getText().length()==0){
                    Toolbox.error_message("Type a variable name.","Empty variable name.");
                }
                else if(Character.isDigit(variable_name.getText().charAt(0))){
                    Toolbox.error_message("The first character on a variable name must be a letter.","Digit found on the first character of the variable name.");
                }
                else if(type.equals("scrollpane") && columns.getText().length()==0){
                    Toolbox.error_message("The amount of columns was not defined.","Type the amount of columns desired.");
                }
                else if(type.equals("scrollpane") && rows.getText().length()==0){
                    Toolbox.error_message("The amount of rows was not defined.","Type the amount of rows desired.");
                }
                else if(type.equals("scrollpane") && !Generate.only_numbers(columns.getText())){
                    Toolbox.error_message("Type only numbers in the columns textfield.","Invalid columns amount.");
                }
                else if(type.equals("scrollpane") && !Generate.only_numbers(rows.getText())){
                    Toolbox.error_message("Type only numbers in the rows textfield.","Invalid rows amount.");
                }
                else if(type.equals("combobox") && combobox_initial_item.getText().length()==0){
                    Toolbox.error_message("The index of the initial item was not defined.","Type the index of the initial item.");
                }
                else if(type.equals("combobox") && combobox_combobox_rows_displayed.getText().length()==0){
                    Toolbox.error_message("The amount of rows displayed at once was not defined.","Type the amount of rows.");
                }
                else if(type.equals("combobox") && !Generate.only_numbers(combobox_initial_item.getText())){
                    Toolbox.error_message("Type only numbers.","Invalid initial item index.");
                }
                else if(type.equals("combobox") && !Generate.only_numbers(combobox_combobox_rows_displayed.getText())){
                    Toolbox.error_message("Type only numbers.","Invalid rows amount.");
                }
                else if(type.equals("bar") && value.getText().length()==0){
                    Toolbox.error_message("The value amount was not defined.","Type the value amount.");
                }
                else if(type.equals("bar") && !Generate.only_numbers(value.getText())){
                    Toolbox.error_message("Type only numbers.","Invalid value amount.");
                }
                else if(type.equals("bar") && min.getText().length()==0){
                    Toolbox.error_message("The min. amount was not defined.","Type the min.");
                }
                else if(type.equals("bar") && !Generate.only_numbers(min.getText())){
                    Toolbox.error_message("Type only numbers.","Invalid min amount.");
                }
                else if(type.equals("bar") && max.getText().length()==0){
                    Toolbox.error_message("The max. amount was not defined.","Type the max. amount.");
                }
                else if(type.equals("bar") && !Generate.only_numbers(max.getText())){
                    Toolbox.error_message("Type only numbers.","Invalid max amount.");
                }
                else{
                    //add
                    if(type.equals("label")){
                        
                        JLabel temp = new JLabel();
                        
                        temp.setBounds(((JLabel)preview).getBounds());
                        
                        if(opaque.isSelected()){temp.setOpaque(true);}
                        else{temp.setOpaque(false);temp.setBackground(new Color(0,0,0,64));}

                        temp.setBackground(content_background_color.getBackground());
                        temp.setForeground(content_foreground_color.getBackground());
                        temp.setFont(new Font(font_family.getSelectedItem().toString(),Font.PLAIN,font_size.getSelectedIndex()+1));

                        ((JLabel)temp).setHorizontalAlignment(JLabel.CENTER);
                        ((JLabel)temp).setText(text.getText());

                        if(border.isSelected()){temp.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));}
                        else{temp.setBorder(null);}

                        Interface.center.setVisible(false);
                        Interface.center.remove(preview);
                        Center_panel.list_label.add(temp);
                        Center_panel.label_names.add(variable_name.getText());
                        Interface.center.add(Center_panel.list_label.getLast());
                        Interface.center.setVisible(true);
                    
                        Left_panel.implemented_items.add(new Item(temp,"JLABEL",variable_name.getText(),(String)X_pos.getSelectedItem(),(String)Y_pos.getSelectedItem(),(String)width.getSelectedItem(),(String)height.getSelectedItem()));
                        Left_panel.update_rectangles();

                    }
                    else if(type.equals("textfield")){
                        
                        JTextField temp = new JTextField();
                        
                        temp.setBounds(((JTextField)preview).getBounds());
                        
                        if(opaque.isSelected()){temp.setOpaque(true);}
                        else{temp.setOpaque(false);temp.setBackground(new Color(0,0,0,64));}

                        temp.setBackground(content_background_color.getBackground());
                        temp.setForeground(content_foreground_color.getBackground());
                        temp.setFont(new Font(font_family.getSelectedItem().toString(),Font.PLAIN,font_size.getSelectedIndex()+1));

                        ((JTextField)temp).setHorizontalAlignment(JLabel.CENTER);
                        ((JTextField)temp).setText(text.getText());

                        if(editable.isSelected()){((JTextField)temp).setEditable(true);}
                        else{((JTextField)temp).setEditable(false);}

                        if(border.isSelected()){temp.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));}
                        else{temp.setBorder(null);}

                        Interface.center.setVisible(false);

                        Interface.center.remove(preview);
                        Center_panel.list_textfield.add(temp);
                        Center_panel.textfield_names.add(variable_name.getText());
                        Interface.center.add(Center_panel.list_textfield.getLast());

                        Interface.center.setVisible(true);

                        Left_panel.implemented_items.add(new Item(temp,"JTEXTFIELD",variable_name.getText(),(String)X_pos.getSelectedItem(),(String)Y_pos.getSelectedItem(),(String)width.getSelectedItem(),(String)height.getSelectedItem()));
                        Left_panel.update_rectangles();

                    }
                    else if(type.equals("passwordfield")){
                        
                        JPasswordField temp = new JPasswordField();
                        
                        temp.setBounds(((JPasswordField)preview).getBounds());
                        
                        temp.setBackground(content_background_color.getBackground());
                        temp.setForeground(content_foreground_color.getBackground());
                        temp.setFont(new Font(font_family.getSelectedItem().toString(),Font.PLAIN,font_size.getSelectedIndex()+1));

                        ((JPasswordField)temp).setHorizontalAlignment(JLabel.CENTER);

                        if(opaque.isSelected()){temp.setOpaque(true);}
                        else{temp.setOpaque(false);temp.setBackground(new Color(0,0,0,64));}

                        if(border.isSelected()){temp.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));}
                        else{temp.setBorder(null);}

                        Interface.center.setVisible(false);

                        Interface.center.remove(preview);
                        Center_panel.list_passwordfield.add(temp);
                        Center_panel.passwordfield_names.add(variable_name.getText());
                        Interface.center.add(Center_panel.list_passwordfield.getLast());

                        Interface.center.setVisible(true);

                        Left_panel.implemented_items.add(new Item(temp,"JPASSWORDFIELD",variable_name.getText(),(String)X_pos.getSelectedItem(),(String)Y_pos.getSelectedItem(),(String)width.getSelectedItem(),(String)height.getSelectedItem()));
                        Left_panel.update_rectangles();

                    }
                    else if(type.equals("textarea")){
                        
                        JTextArea temp = new JTextArea();
                        
                        temp.setBounds(((JTextArea)preview).getBounds());
                        
                        temp.setBackground(content_background_color.getBackground());
                        temp.setForeground(content_foreground_color.getBackground());
                        temp.setFont(new Font(font_family.getSelectedItem().toString(),Font.PLAIN,font_size.getSelectedIndex()+1));

                        ((JTextArea)temp).setText(text.getText());

                        if(editable.isSelected()){((JTextArea)temp).setEditable(true);}
                        else{((JTextArea)temp).setEditable(false);}

                        if(border.isSelected()){temp.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));}
                        else{temp.setBorder(null);}

                        preview.setOpaque(true);

                        Interface.center.setVisible(false);

                        Interface.center.remove(preview);
                        Center_panel.list_textarea.add(temp);
                        Center_panel.textarea_names.add(variable_name.getText());
                        Interface.center.add(Center_panel.list_textarea.getLast());

                        Interface.center.setVisible(true);

                        Left_panel.implemented_items.add(new Item(temp,"JTEXTAREA",variable_name.getText(),(String)X_pos.getSelectedItem(),(String)Y_pos.getSelectedItem(),(String)width.getSelectedItem(),(String)height.getSelectedItem()));
                        Left_panel.update_rectangles();

                    }
                    else if(type.equals("scrollpane")){
                        
                        JPanel temp = new JPanel();
                        
                        JTextArea textarea = new JTextArea();
                        JScrollPane scrollPane = new JScrollPane(textarea);
                        
                        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

                        temp.setBounds(preview.getBounds());

                        ((JTextArea)textarea).setRows(Integer.parseInt(rows.getText()));
                        ((JTextArea)textarea).setColumns(Integer.parseInt(columns.getText()));
                        
                        textarea.setBackground(content_background_color.getBackground());
                        textarea.setForeground(content_foreground_color.getBackground());
                        textarea.setFont(new Font(font_family.getSelectedItem().toString(),Font.PLAIN,font_size.getSelectedIndex()+1));
                    
                        ((JTextArea)textarea).setText(text.getText());
                        
                        if(opaque.isSelected()){textarea.setOpaque(true);temp.setBackground(scrollpane_background_color.getBackground());}
                        else{textarea.setOpaque(false);temp.setBackground(new Color(0,0,0,0));}

                        if(editable.isSelected()){((JTextArea)textarea).setEditable(true);}
                        else{((JTextArea)textarea).setEditable(false);}

                        if(border.isSelected()){textarea.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));}
                        else{textarea.setBorder(null);}

                        temp.add(scrollPane);

                        Interface.center.setVisible(false);

                        Interface.center.remove(preview);
                        Center_panel.list_scrollpane.add(temp);
                        Center_panel.scrollpane_names.add(variable_name.getText());
                        Center_panel.list_scrollpane_textarea.add(textarea);
                        Interface.center.add(Center_panel.list_scrollpane.getLast());

                        Interface.center.setVisible(true);

                        Left_panel.implemented_items.add(new Item(temp,"JSCROLLPANE",variable_name.getText(),(String)X_pos.getSelectedItem(),(String)Y_pos.getSelectedItem(),(String)width.getSelectedItem(),(String)height.getSelectedItem()));
                        Left_panel.update_rectangles();

                    }
                    else if(type.equals("button")){
                        
                        JButton temp = new JButton();
                        
                        temp.setBounds(((JButton)preview).getBounds());
                        
                        temp.setBackground(content_background_color.getBackground());
                        temp.setForeground(content_foreground_color.getBackground());
                        temp.setFont(new Font(font_family.getSelectedItem().toString(),Font.PLAIN,font_size.getSelectedIndex()+1));

                        ((JButton)temp).setHorizontalAlignment(JLabel.CENTER);
                        ((JButton)temp).setText(text.getText());

                        Interface.center.setVisible(false);

                        Interface.center.remove(preview);
                        Center_panel.list_button.add(temp);
                        Center_panel.button_names.add(variable_name.getText());
                        Interface.center.add(Center_panel.list_button.getLast());

                        Interface.center.setVisible(true);

                        Left_panel.implemented_items.add(new Item(temp,"JBUTTON",variable_name.getText(),(String)X_pos.getSelectedItem(),(String)Y_pos.getSelectedItem(),(String)width.getSelectedItem(),(String)height.getSelectedItem()));
                        Left_panel.update_rectangles();

                    }
                    else if(type.equals("combobox")){
                        
                        //add items
                        int n_of_items = 0;
                        for(int i=0;i<combobox_items.getText().length();i++){if(combobox_items.getText().charAt(i)==','){n_of_items++;}}
                        String[] items = new String[n_of_items+1];
                        String item = "";
                        int count = 0;
                        for(int i=0;i<combobox_items.getText().length();i++){
                            if(combobox_items.getText().charAt(i)!=','){item+=combobox_items.getText().charAt(i);}
                            else{items[count]=item;item="";count++;}
                        }
                        items[count]=item;
                        
                        JComboBox<String> temp = new JComboBox<String>(items);
                        
                        temp.setBounds(((JComboBox<String>)preview).getBounds());
                        
                        temp.setBackground(content_background_color.getBackground());
                        temp.setForeground(content_foreground_color.getBackground());
                        temp.setFont(new Font(font_family.getSelectedItem().toString(),Font.PLAIN,font_size.getSelectedIndex()+1));

                        ((JComboBox<String>)temp).setAlignmentX(JComboBox.CENTER_ALIGNMENT);
                        ((JComboBox<String>)temp).setMaximumRowCount(Integer.parseInt(combobox_combobox_rows_displayed.getText()));
                        ((JComboBox<String>)temp).setSelectedIndex(Integer.parseInt(combobox_initial_item.getText()));

                        //centralize the items
                        DefaultListCellRenderer dlcr = new DefaultListCellRenderer();
                        dlcr.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
                        ((JComboBox<String>)temp).setRenderer(dlcr);

                        Interface.center.setVisible(false);

                        Interface.center.remove(preview);
                        Center_panel.list_combobox.add(temp);
                        Center_panel.combobox_names.add(variable_name.getText());
                        Interface.center.add(Center_panel.list_combobox.getLast());

                        Interface.center.setVisible(true);

                        Left_panel.implemented_items.add(new Item(temp,"JCOMBOBOX",variable_name.getText(),(String)X_pos.getSelectedItem(),(String)Y_pos.getSelectedItem(),(String)width.getSelectedItem(),(String)height.getSelectedItem()));
                        Left_panel.update_rectangles();

                    }
                    else if(type.equals("radiobutton")){
                        
                        JRadioButton temp = new JRadioButton();
                        
                        temp.setBounds(((JRadioButton)preview).getBounds());
                        
                        temp.setBackground(content_background_color.getBackground());
                        temp.setForeground(content_foreground_color.getBackground());
                        temp.setFont(new Font(font_family.getSelectedItem().toString(),Font.PLAIN,font_size.getSelectedIndex()+1));

                        ((JRadioButton)temp).setHorizontalAlignment(JRadioButton.CENTER);
                        ((JRadioButton)temp).setText(text.getText());

                        Interface.center.setVisible(false);

                        Interface.center.remove(preview);
                        Center_panel.list_radiobutton.add(temp);
                        Center_panel.radiobutton_names.add(variable_name.getText());
                        Center_panel.buttongroup_names.add(button_group.getText());
                        Interface.center.add(Center_panel.list_radiobutton.getLast());

                        Interface.center.setVisible(true);

                        Left_panel.implemented_items.add(new Item(temp,"JRADIOBUTTON",variable_name.getText(),(String)X_pos.getSelectedItem(),(String)Y_pos.getSelectedItem(),(String)width.getSelectedItem(),(String)height.getSelectedItem()));
                        Left_panel.update_rectangles();

                    }
                    else if(type.equals("table")){
                        //type: JTABLE
                    }
                    else if(type.equals("image")){
                        
                        JLabel temp = new JLabel();
                        
                        temp.setBounds(((JLabel)preview).getBounds());

                        //temporary resize for the center panel
                        try {
                            BufferedImage originalImage = ImageIO.read(new File(link.getText()));

                            BufferedImage resizedImage = new BufferedImage(originalImage.getWidth()/2,originalImage.getHeight()/2,BufferedImage.TYPE_INT_RGB);
                            Graphics2D graphics2d = resizedImage.createGraphics();
                    
                            graphics2d.drawImage(originalImage,0,0,originalImage.getWidth()/2,originalImage.getHeight()/2,null);
                            graphics2d.dispose();
                            ((JLabel)temp).setIcon(new ImageIcon((Image)resizedImage));
                        } catch (Exception exception_resized) {
                            exception_resized.printStackTrace();
                        }
                        //((JLabel)temp).setIcon(new ImageIcon(link.getText()));       

                        Interface.center.setVisible(false);
                        Interface.center.remove(preview);
                        Center_panel.list_image.add(temp);
                        Center_panel.image_names.add(variable_name.getText());
                        Center_panel.sources_names.add(link.getText());
                        Interface.center.add(Center_panel.list_image.getLast());
                        Interface.center.setVisible(true);

                        Left_panel.implemented_items.add(new Item(temp,"IMAGE",variable_name.getText(),(String)X_pos.getSelectedItem(),(String)Y_pos.getSelectedItem(),(String)width.getSelectedItem(),(String)height.getSelectedItem()));
                        Left_panel.update_rectangles();

                    }
                    else if(type.equals("bar")){
                        
                        JProgressBar temp = new JProgressBar();
                        
                        temp.setBounds(((JProgressBar)preview).getBounds());
                        
                        temp.setBackground(content_background_color.getBackground());
                        temp.setForeground(content_foreground_color.getBackground());
                        
                        ((JProgressBar)temp).setMinimum(Integer.parseInt(min.getText()));
                        ((JProgressBar)temp).setMaximum(Integer.parseInt(max.getText()));
                        ((JProgressBar)temp).setValue(Integer.parseInt(value.getText()));

                        Interface.center.setVisible(false);

                        Interface.center.remove(preview);
                        Center_panel.list_bar.add(temp);
                        Center_panel.bar_names.add(variable_name.getText());
                        Interface.center.add(Center_panel.list_bar.getLast());

                        Interface.center.setVisible(true);

                        Left_panel.implemented_items.add(new Item(temp,"JPROGRESSBAR",variable_name.getText(),(String)X_pos.getSelectedItem(),(String)Y_pos.getSelectedItem(),(String)width.getSelectedItem(),(String)height.getSelectedItem()));
                        Left_panel.update_rectangles();

                    }
                    else if(type.equals("checkbox")){
                        
                        JCheckBox temp = new JCheckBox();
                        
                        temp.setBounds(((JCheckBox)preview).getBounds());
                        
                        temp.setBackground(content_background_color.getBackground());
                        temp.setForeground(content_foreground_color.getBackground());
                        temp.setFont(new Font(font_family.getSelectedItem().toString(),Font.PLAIN,font_size.getSelectedIndex()+1));

                        ((JCheckBox)temp).setHorizontalAlignment(JCheckBox.CENTER);
                        ((JCheckBox)temp).setText(text.getText());

                        if(opaque.isSelected()){temp.setOpaque(true);}
                        else{temp.setOpaque(false);temp.setBackground(new Color(0,0,0,64));}

                        if(checked.isSelected()){((JCheckBox)temp).setSelected(true);}
                        else{((JCheckBox)temp).setSelected(true);}

                        Interface.center.setVisible(false);

                        Interface.center.remove(preview);
                        Center_panel.list_checkbox.add(temp);
                        Center_panel.checkbox_names.add(variable_name.getText());
                        Interface.center.add(Center_panel.list_checkbox.getLast());

                        Interface.center.setVisible(true);

                        Left_panel.implemented_items.add(new Item(temp,"JCHECKBOX",variable_name.getText(),(String)X_pos.getSelectedItem(),(String)Y_pos.getSelectedItem(),(String)width.getSelectedItem(),(String)height.getSelectedItem()));
                        Left_panel.update_rectangles();

                    }
                    
                    type="null";
                    add_item.setVisible(false);
                    preview_item.setVisible(false);
                    details.removeAll();
                    details.setVisible(false);

                    Left_panel.first_index=0;
                }
            }

        }

    }

    int value_width=100;
    int value_height=100;
    int value_x=0;
    int value_y=0;

    ItemListener il = new ItemListener(){
        @Override
        public void itemStateChanged(ItemEvent event){
            if(event.getStateChange() == ItemEvent.SELECTED){
                value_width = width_combobox.getSelectedIndex();
                value_height = height_combobox.getSelectedIndex();
                value_x = x_combobox.getSelectedIndex();
                value_y = y_combobox.getSelectedIndex();
                Interface.center.setBounds(
                    (int)(PANEL_WIDTH/5+((float)value_x/200)*PANEL_WIDTH),
                    (int)(PANEL_HEIGHT/4+((float)value_y/200)*PANEL_HEIGHT),
                    (int)(((float)value_width/200)*PANEL_WIDTH),
                    (int)(((float)value_height/200)*PANEL_HEIGHT)
                );
            }
        }
    };

}
