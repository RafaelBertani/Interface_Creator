import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame{

    //UM MONITOR
    public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static final int WIDTH = (int) screenSize.getWidth();
    public static final int HEIGHT = (int) screenSize.getHeight();

    //PRINCIPAL
    private JFrame main_screen_frame = new JFrame();
    private JPanel main_screen_panel = new JPanel();
    
    public static JPanel center = new JPanel();

    public void create_main_screen(){
        
        Left_panel lp = new Left_panel();
        JPanel left = lp.return_Left_panel(WIDTH,HEIGHT);
        Toolbox.implements_panel_in_a_panel(left,main_screen_panel,0,0,WIDTH/5,HEIGHT);
        
        JLabel upside_line = new JLabel();
        Toolbox.implements_label(upside_line,"",false,WIDTH/5,HEIGHT/4-20,WIDTH/2,20,main_screen_panel);
        Toolbox.edit_label(upside_line,null,new Color(32,32,32),null);

        Toolbox.implements_panel_in_a_panel(center,main_screen_panel,WIDTH/5,HEIGHT/4,WIDTH/2,HEIGHT/2);
        center.setOpaque(true);
        center.setBackground(new Color(238,238,238));
        
        JLabel downside_line = new JLabel();
        Toolbox.implements_label(downside_line,"",false,WIDTH/5,HEIGHT/4+HEIGHT/2,WIDTH/2,20,main_screen_panel);
        Toolbox.edit_label(downside_line,null,new Color(32,32,32),null);

        Right_panel rp = new Right_panel();
        JPanel right = rp.return_Right_panel(WIDTH,HEIGHT);
        Toolbox.implements_panel_in_a_panel(right,main_screen_panel,7*WIDTH/10,0,3*WIDTH/10,HEIGHT);

        Toolbox.implements_panel(main_screen_panel,main_screen_frame,0,0,WIDTH,HEIGHT);
        Toolbox.edit_panel(main_screen_panel,false,new Color(100,100,100));
        
        Toolbox.implements_frame(main_screen_frame,true,JFrame.EXIT_ON_CLOSE,WIDTH,HEIGHT);
        Toolbox.edit_frame(main_screen_frame,"Interface creator",new Color(238,238,238));

    }

    public Interface(){
        create_main_screen();        
    }
    
    public static void main(String[] args){
        new Interface();
    }

}


