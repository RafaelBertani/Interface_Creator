import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Center_panel extends JFrame{
    
    public static JPanel center = new JPanel();

    public static JPanel return_Center_panel(){

        center.setOpaque(true);
        center.setBackground(new Color(238,238,238));
        return center;

    }

}
