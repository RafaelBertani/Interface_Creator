import javax.swing.JComponent;

public class Item{
    
    public JComponent component;
    public String type;
    public String variable_name;
    public String x;
    public String y;
    public String width;
    public String height;

    public Item(JComponent jc, String type, String variable_name, String x, String y, String width, String height){
        this.component=jc;
        this.type=type;
        this.variable_name=variable_name;
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

}
