import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Left_panel extends JFrame implements ActionListener{

    private static int PANEL_WIDTH=-1;
    private static int PANEL_HEIGHT=-1;

    public JPanel left = new JPanel();

    public JButton generate_code = new JButton();
    public JButton up = new JButton();
    public JButton down = new JButton();

    public static ArrayList<Item> implemented_items = new ArrayList<Item>();
    public static int first_index = 0;
    public static JTextArea[] rectangles = new JTextArea[12];
    public static JButton[] deletes = new JButton[12];

    public JPanel return_Left_panel(int PANEL_WIDTH, int PANEL_HEIGHT){

        Left_panel.PANEL_WIDTH=PANEL_WIDTH;
        Left_panel.PANEL_HEIGHT=PANEL_HEIGHT;

        JLabel title = new JLabel();
        Toolbox.implements_label(title,"Implemented items:",false,0,0,Left_panel.PANEL_WIDTH/5,Left_panel.PANEL_HEIGHT/20,left);
        Toolbox.edit_label(title,new Font("Dialog",Font.PLAIN,16),null,Color.WHITE);

        Toolbox.implements_button(generate_code,"Generate Code",5,Left_panel.PANEL_HEIGHT-Left_panel.PANEL_HEIGHT/6,Left_panel.PANEL_WIDTH/5-10,Left_panel.PANEL_HEIGHT/20,left);
        Toolbox.edit_button(generate_code,new Font("Dialog",Font.PLAIN,16),new Color(0,64,0),Color.WHITE);
        generate_code.addActionListener(this);

        Toolbox.implements_button(up,"Scroll up",5,Left_panel.PANEL_HEIGHT/20,Left_panel.PANEL_WIDTH/5-10,Left_panel.PANEL_HEIGHT/30,left);
        Toolbox.edit_button(up,new Font("Dialog",Font.PLAIN,16),new Color(64,64,64),Color.WHITE);
        up.addActionListener(this);

        Toolbox.implements_button(down,"Scroll down",5,Left_panel.PANEL_HEIGHT-Left_panel.PANEL_HEIGHT/5-Left_panel.PANEL_HEIGHT/35,Left_panel.PANEL_WIDTH/5-10,Left_panel.PANEL_HEIGHT/30,left);
        Toolbox.edit_button(down,new Font("Dialog",Font.PLAIN,16),new Color(64,64,64),Color.WHITE);
        down.addActionListener(this);

        left.setOpaque(true);
        left.setBackground(new Color(32,32,32));

        for(int i=0;i<12;i++){
            rectangles[i]=new JTextArea();
            deletes[i]=new JButton();
            Toolbox.implements_textarea(rectangles[i],"",5,Left_panel.PANEL_HEIGHT/10+i*PANEL_HEIGHT/20+i*PANEL_HEIGHT/200-2,Left_panel.PANEL_WIDTH/5-Left_panel.PANEL_WIDTH/40-10,PANEL_HEIGHT/20,false,true,left);
            Toolbox.edit_textarea(rectangles[i],new Font("Dialog",Font.PLAIN,16),new Color(0,0,128),Color.WHITE);
            Toolbox.implements_button(deletes[i],"X",Left_panel.PANEL_WIDTH/5-Left_panel.PANEL_WIDTH/40-5,Left_panel.PANEL_HEIGHT/10+i*PANEL_HEIGHT/20+i*PANEL_HEIGHT/200-1,Left_panel.PANEL_WIDTH/40,PANEL_HEIGHT/20,left);
            Toolbox.edit_button(deletes[i],new Font("Dialog",Font.PLAIN,16),new Color(128,0,0),Color.WHITE);
            deletes[i].setBorder(null);
            deletes[i].addActionListener(this);
            rectangles[i].setVisible(false);
            deletes[i].setVisible(false);
        }

        return left;

    }

    public static void update_rectangles(){

        for(int i=0;i<12;i++){
            rectangles[i].setVisible(false);
            deletes[i].setVisible(false);
        }

        for(int i=0;i<implemented_items.size()&&i<12;i++){
            rectangles[i].setText(" ["+implemented_items.get(i).type+"]: "+implemented_items.get(i).variable_name+"\n X:"+implemented_items.get(i).x+" Y:"+implemented_items.get(i).y+" W:"+implemented_items.get(i).width+" H:"+implemented_items.get(i).height);
            rectangles[i].setVisible(true);
            deletes[i].setVisible(true);
        }

        Left_panel.first_index=0;

    }

    public static void delete_item_from_lists(int index){
        String variable_name = implemented_items.get(index).variable_name;
        String type = implemented_items.get(index).type;
        if(type.equals("JLABEL")){
            int i = Center_panel.label_names.indexOf(variable_name);
            Center_panel.list_label.remove(i);
            Center_panel.label_names.remove(i);
        }
        else if(type.equals("JTEXTFIELD")){
            int i = Center_panel.textfield_names.indexOf(variable_name);
            Center_panel.list_textfield.remove(i);
            Center_panel.textfield_names.remove(i);
        }
        else if(type.equals("JPASSWORDFIELD")){
            int i = Center_panel.passwordfield_names.indexOf(variable_name);
            Center_panel.list_passwordfield.remove(i);
            Center_panel.passwordfield_names.remove(i);
        }
        else if(type.equals("JTEXTAREA")){
            int i = Center_panel.textarea_names.indexOf(variable_name);
            Center_panel.list_textarea.remove(i);
            Center_panel.textarea_names.remove(i);
        }
        else if(type.equals("JSCROLLPANE")){
            int i = Center_panel.scrollpane_names.indexOf(variable_name);
            Center_panel.list_scrollpane.remove(i);
            Center_panel.scrollpane_names.remove(i);
        }
        else if(type.equals("JBUTTON")){
            int i = Center_panel.button_names.indexOf(variable_name);
            Center_panel.list_button.remove(i);
            Center_panel.button_names.remove(i);
        }
        else if(type.equals("JCOMBOBOX")){
            int i = Center_panel.combobox_names.indexOf(variable_name);
            Center_panel.list_combobox.remove(i);
            Center_panel.combobox_names.remove(i);
        }
        else if(type.equals("JRADIOBUTTON")){
            int i = Center_panel.radiobutton_names.indexOf(variable_name);
            Center_panel.list_radiobutton.remove(i);
            Center_panel.radiobutton_names.remove(i);
            //percorrer todos os radiobuttons para conferir se um buttongroup pode ser excluído porque todos os radiobuttons de um buttongroup já foram excluídos
        }
        else if(type.equals("JTABLE")){
            int i = Center_panel.table_names.indexOf(variable_name);
            Center_panel.list_table.remove(i);
            Center_panel.table_names.remove(i);
        }
        else if(type.equals("IMAGE")){
            int i = Center_panel.image_names.indexOf(variable_name);
            Center_panel.list_image.remove(i);
            Center_panel.image_names.remove(i);
            Center_panel.list_sources.remove(i);
            Center_panel.sources_names.remove(i);
        }
        else if(type.equals("JPROGRESSBAR")){
            int i = Center_panel.bar_names.indexOf(variable_name);
            Center_panel.list_bar.remove(i);
            Center_panel.bar_names.remove(i);
        }
        else if(type.equals("JCHECKBOX")){
            int i = Center_panel.checkbox_names.indexOf(variable_name);
            Center_panel.list_checkbox.remove(i);
            Center_panel.checkbox_names.remove(i);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==generate_code){
            if(Right_panel.panel_name_textfield.getText().length()==0){
                Toolbox.error_message("Type a variable name for the panel.","Empty panel name.");
            }
            else if(Character.isDigit(Right_panel.panel_name_textfield.getText().charAt(0))){
                Toolbox.error_message("The first character on a variable name must be a letter.","Digit found in the first character of the panel name.");
            }
            else{
                Generate.generate();
            }
        }
        else if(e.getSource()==up){
            if(first_index>0){
                first_index--;
                for(int i=0;i<12;i++){
                    rectangles[i].setVisible(false);
                    deletes[i].setVisible(false);
                }
        
                int index=0;
                for(int i=first_index;i<first_index+12;i++){
                    rectangles[index].setText(" ["+implemented_items.get(i).type+"]: "+implemented_items.get(i).variable_name+"\n X:"+implemented_items.get(i).x+" Y:"+implemented_items.get(i).y+" W:"+implemented_items.get(i).width+" H:"+implemented_items.get(i).height);
                    rectangles[index].setVisible(true);
                    deletes[index].setVisible(true);
                    index++;
                }
            }
        }
        else if(e.getSource()==down){
            if(first_index+12<implemented_items.size()){
                first_index++;
                for(int i=0;i<12;i++){
                    rectangles[i].setVisible(false);
                    deletes[i].setVisible(false);
                }
        
                int index=0;
                for(int i=first_index;i<first_index+12;i++){
                    rectangles[index].setText(" ["+implemented_items.get(i).type+"]: "+implemented_items.get(i).variable_name+"\n X:"+implemented_items.get(i).x+" Y:"+implemented_items.get(i).y+" W:"+implemented_items.get(i).width+" H:"+implemented_items.get(i).height);
                    rectangles[index].setVisible(true);
                    deletes[index].setVisible(true);
                    index++;
                }
            }
        }
        else if(e.getSource()==deletes[0]){
            rectangles[0].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(0+first_index).component);
            Interface.center.setVisible(true);
            delete_item_from_lists(0+first_index);
            implemented_items.remove(0+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[1]){
            rectangles[1].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(1+first_index).component);
            Interface.center.setVisible(true);
            delete_item_from_lists(1+first_index);
            implemented_items.remove(1+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[2]){
            rectangles[2].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(2+first_index).component);
            Interface.center.setVisible(true);
            delete_item_from_lists(2+first_index);
            implemented_items.remove(2+first_index);
            update_rectangles();            
        }
        else if(e.getSource()==deletes[3]){
            rectangles[3].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(3+first_index).component);
            Interface.center.setVisible(true);
            delete_item_from_lists(3+first_index);
            implemented_items.remove(3+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[4]){
            rectangles[4].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(4+first_index).component);
            Interface.center.setVisible(true);
            delete_item_from_lists(4+first_index);
            implemented_items.remove(4+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[5]){
            rectangles[5].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(5+first_index).component);
            Interface.center.setVisible(true);
            delete_item_from_lists(5+first_index);
            implemented_items.remove(5+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[6]){
            rectangles[6].setText("");
            Interface.center.remove(implemented_items.get(6+first_index).component);
            Interface.center.setVisible(true);
            delete_item_from_lists(6+first_index);
            implemented_items.remove(6+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[7]){
            rectangles[7].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(7+first_index).component);
            Interface.center.setVisible(true);
            delete_item_from_lists(7+first_index);
            implemented_items.remove(7+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[8]){
            rectangles[8].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(8+first_index).component);
            Interface.center.setVisible(true);
            delete_item_from_lists(8+first_index);
            implemented_items.remove(8+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[9]){
            rectangles[9].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(9+first_index).component);
            Interface.center.setVisible(true);
            delete_item_from_lists(9+first_index);
            implemented_items.remove(9+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[10]){
            rectangles[10].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(10+first_index).component);
            Interface.center.setVisible(true);
            delete_item_from_lists(10+first_index);
            implemented_items.remove(10+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[11]){
            rectangles[11].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(11+first_index).component);
            Interface.center.setVisible(true);
            delete_item_from_lists(11+first_index);
            implemented_items.remove(11+first_index);
            update_rectangles();
        }
    }

}
