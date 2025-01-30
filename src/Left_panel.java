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
        Toolbox.implementa_label(title,"Implemented items:",false,0,0,Left_panel.PANEL_WIDTH/5,Left_panel.PANEL_HEIGHT/20,left);
        Toolbox.edita_label(title,new Font("Dialog",Font.PLAIN,16),null,Color.WHITE);

        Toolbox.implementa_button(generate_code,"Generate Code",5,Left_panel.PANEL_HEIGHT-Left_panel.PANEL_HEIGHT/6,Left_panel.PANEL_WIDTH/5-10,Left_panel.PANEL_HEIGHT/20,left);
        Toolbox.edita_button(generate_code,new Font("Dialog",Font.PLAIN,16),new Color(0,64,0),Color.WHITE);
        generate_code.addActionListener(this);

        Toolbox.implementa_button(up,"Scroll up",5,Left_panel.PANEL_HEIGHT/20,Left_panel.PANEL_WIDTH/5-10,Left_panel.PANEL_HEIGHT/30,left);
        Toolbox.edita_button(up,new Font("Dialog",Font.PLAIN,16),new Color(64,64,64),Color.WHITE);
        up.addActionListener(this);

        Toolbox.implementa_button(down,"Scroll down",5,Left_panel.PANEL_HEIGHT-Left_panel.PANEL_HEIGHT/5-Left_panel.PANEL_HEIGHT/35,Left_panel.PANEL_WIDTH/5-10,Left_panel.PANEL_HEIGHT/30,left);
        Toolbox.edita_button(down,new Font("Dialog",Font.PLAIN,16),new Color(64,64,64),Color.WHITE);
        down.addActionListener(this);

        left.setOpaque(true);
        left.setBackground(new Color(32,32,32));

        for(int i=0;i<12;i++){
            rectangles[i]=new JTextArea();
            deletes[i]=new JButton();
            Toolbox.implementa_textarea(rectangles[i],"",5,Left_panel.PANEL_HEIGHT/10+i*PANEL_HEIGHT/20+i*PANEL_HEIGHT/200-2,Left_panel.PANEL_WIDTH/5-Left_panel.PANEL_WIDTH/40-10,PANEL_HEIGHT/20,false,true,left);
            Toolbox.edita_textarea(rectangles[i],new Font("Dialog",Font.PLAIN,16),new Color(0,0,128),Color.WHITE);
            Toolbox.implementa_button(deletes[i],"X",Left_panel.PANEL_WIDTH/5-Left_panel.PANEL_WIDTH/40-5,Left_panel.PANEL_HEIGHT/10+i*PANEL_HEIGHT/20+i*PANEL_HEIGHT/200-1,Left_panel.PANEL_WIDTH/40,PANEL_HEIGHT/20,left);
            Toolbox.edita_button(deletes[i],new Font("Dialog",Font.PLAIN,16),new Color(128,0,0),Color.WHITE);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==generate_code){

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
            implemented_items.remove(0+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[1]){
            rectangles[1].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(1+first_index).component);
            Interface.center.setVisible(true);
            implemented_items.remove(1+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[2]){
            rectangles[2].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(2+first_index).component);
            Interface.center.setVisible(true);
            implemented_items.remove(2+first_index);
            update_rectangles();            
        }
        else if(e.getSource()==deletes[3]){
            rectangles[3].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(3+first_index).component);
            Interface.center.setVisible(true);
            implemented_items.remove(3+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[4]){
            rectangles[4].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(4+first_index).component);
            Interface.center.setVisible(true);
            implemented_items.remove(4+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[5]){
            rectangles[5].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(5+first_index).component);
            Interface.center.setVisible(true);
            implemented_items.remove(5+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[6]){
            rectangles[6].setText("");
            Interface.center.remove(implemented_items.get(6+first_index).component);
            Interface.center.setVisible(true);
            implemented_items.remove(6+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[7]){
            rectangles[7].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(7+first_index).component);
            Interface.center.setVisible(true);
            implemented_items.remove(7+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[8]){
            rectangles[8].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(8+first_index).component);
            Interface.center.setVisible(true);
            implemented_items.remove(8+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[9]){
            rectangles[9].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(9+first_index).component);
            Interface.center.setVisible(true);
            implemented_items.remove(9+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[10]){
            rectangles[10].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(10+first_index).component);
            Interface.center.setVisible(true);
            implemented_items.remove(10+first_index);
            update_rectangles();
        }
        else if(e.getSource()==deletes[11]){
            rectangles[11].setText("");
            Interface.center.setVisible(false);
            Interface.center.remove(implemented_items.get(11+first_index).component);
            Interface.center.setVisible(true);
            implemented_items.remove(11+first_index);
            update_rectangles();
        }
    }

}
