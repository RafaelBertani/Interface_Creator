import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Left_panel extends JFrame{

    private static int PANEL_WIDTH=-1;
    private static int PANEL_HEIGHT=-1;

    public static JPanel left = new JPanel();
    
    public static JPanel return_Left_panel(int PANEL_WIDTH, int PANEL_HEIGHT){

        Left_panel.PANEL_WIDTH=PANEL_WIDTH;
        Left_panel.PANEL_HEIGHT=PANEL_HEIGHT;

        JLabel title = new JLabel();
        Toolbox.implementa_label(title,"Implemented items:",false,0,0,Left_panel.PANEL_WIDTH/5,Left_panel.PANEL_HEIGHT/20,left);
        Toolbox.edita_label(title,new Font("Dialog",Font.PLAIN,16),null,Color.WHITE);

        left.setOpaque(true);
        left.setBackground(new Color(32,32,32));
        
        return left;
    }

}
