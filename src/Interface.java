import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;

public class Interface extends JFrame implements ActionListener,KeyListener{

    //UM MONITOR
    public Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public final int LARGURA_PANEL_JFRAME = (int) screenSize.getWidth();
    public final int ALTURA_PANEL_JFRAME = (int) screenSize.getHeight();

    //PRINCIPAL
    private JFrame main_screen_frame = new JFrame();
    private JPanel main_screen_panel = new JPanel();
    private JMenuBar menubar = new JMenuBar();
    
    public static JPanel center = new JPanel();

    public void create_main_screen(){
        
        //MAIOR
        //PRIORIDADE
        //MENOR
                
        // box=new JComboBox(new String[]{"itens","da","combobox","estão","aqui"});
        // Toolbox.implementa_combobox(box,il,200,55,150,20,3,0,panelPRINCIPAL);

        //IMPLEMENTA MENUBAR
        String[] princ = {"OP1","OP2","OP3"};
        List<String[]> sec = new ArrayList<String[]>();
        sec.add(0,new String[]{"OP1.1","OP1.2"});
        sec.add(1,new String[]{"OP2.1","OP2.2"});
        sec.add(2,new String[]{"OP3.1","OP3.2"});
        List<String[]> terc = new ArrayList<String[]>();
        terc.add(0,new String[]{"OP2.2","OP2.2.2"});
        Toolbox.implementa_menubar(menubar,princ,sec,terc,this,main_screen_frame);
        //IMPLEMENTA MENUBAR MANUALMENTE
        // OP1.add(OP11);OP1.add(OP12);
        // OP2.add(OP21);OP22.add(OP222);OP2.add(OP22);
        // OP11.addActionListener(this);
        // OP12.addActionListener(this);
        // OP21.addActionListener(this);
        // OP222.addActionListener(this);
        // menubar.add(OP1);
        // menubar.add(OP2);
        // framePRINCIPAL.setJMenuBar(menubar);

        JPanel lp = Left_panel.return_Left_panel(LARGURA_PANEL_JFRAME,ALTURA_PANEL_JFRAME);
        Toolbox.implementa_panel_no_panel(lp,main_screen_panel,0,0,LARGURA_PANEL_JFRAME/5,ALTURA_PANEL_JFRAME);
        
        JLabel upside_line = new JLabel();
        Toolbox.implementa_label(upside_line,"",false,LARGURA_PANEL_JFRAME/5,ALTURA_PANEL_JFRAME/4-20,LARGURA_PANEL_JFRAME/2,20,main_screen_panel);
        Toolbox.edita_label(upside_line,null,new Color(32,32,32),null);

        Toolbox.implementa_panel_no_panel(center,main_screen_panel,LARGURA_PANEL_JFRAME/5,ALTURA_PANEL_JFRAME/4,LARGURA_PANEL_JFRAME/2,ALTURA_PANEL_JFRAME/2);
        center.setOpaque(true);
        center.setBackground(new Color(238,238,238));
        
        JLabel downside_line = new JLabel();
        Toolbox.implementa_label(downside_line,"",false,LARGURA_PANEL_JFRAME/5,ALTURA_PANEL_JFRAME/4+ALTURA_PANEL_JFRAME/2,LARGURA_PANEL_JFRAME/2,20,main_screen_panel);
        Toolbox.edita_label(downside_line,null,new Color(32,32,32),null);

        Right_panel rp = new Right_panel();
        JPanel right = rp.return_Right_panel(LARGURA_PANEL_JFRAME,ALTURA_PANEL_JFRAME);
        Toolbox.implementa_panel_no_panel(right,main_screen_panel,7*LARGURA_PANEL_JFRAME/10,0,3*LARGURA_PANEL_JFRAME/10,ALTURA_PANEL_JFRAME);

        //IMPLEMENTA PANEL
        Toolbox.implementa_panel(main_screen_panel,main_screen_frame,0,0,LARGURA_PANEL_JFRAME,ALTURA_PANEL_JFRAME);
        Toolbox.edita_panel(main_screen_panel,false,new Color(100,100,100));
        
        //IMPLEMENTA FRAME PRINCIPAL    
        Toolbox.implementa_frame(main_screen_frame,true,JFrame.EXIT_ON_CLOSE,LARGURA_PANEL_JFRAME,ALTURA_PANEL_JFRAME);
        //SETVISIBLE TRUE PODE SER UMA EXCUSIVIDADE DO PRINCIPAL
        Toolbox.edita_frame(main_screen_frame,"Título do frame",new Color(238,238,238));        

        //O PANEL E O FRAME SÃO IMPLEMENTADOS AO FINAL PORQUE CASO CONTRÁRIO EVENTUALMENTE SE SOBREPÕEM AOS SEUS ELEMENTOS

    }

    public Interface(){
        create_main_screen();        
    }
    
    public static void main(String[] args){
        new Interface();
    }

    
    //AÇÃO POR BOTÃO
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==null){

        }
        else if(e.getSource()==menubar.getMenu(0).getItem(0)){System.out.println("Opção 1.1");}
        else if(e.getSource()==((JMenu) menubar.getMenu(1).getItem(1)).getItem(0)){System.out.println("Opção 2.2.2");}
    }

    //AÇÃO POR COMBOBOX
    ItemListener il = new ItemListener(){
        public void itemStateChanged(ItemEvent event) {
            if(event.getStateChange() == ItemEvent.SELECTED){
                //AÇÃO NO MOMENTO DE SELECIONAR, ANTES DE APERTAR O BOTÃO
                //index = box.getSelectedIndex()
                //event.getItem().toString() == box.getSelectedItem()
                System.out.println("Opção do combobox selecionada: "+event.getItem().toString());
            }
        }  
    };


    //AÇÃO POR ENTER EM TEXTFIELDS E PASSWORDFIELDS (TEXTAREAS E JSCROLLPANES NÃO PODEM RECEBER TEXTFIELDHANDLERS PORQUE PODEM RECEBER ENTERS, QUE DENTRO DELES SERÃO PARA IR PARA A PRÓXIMA LINHA, NÃO PARA CAUSAR UMA AÇÃO POR ENTER)
    TextFieldHandler th = new TextFieldHandler();
    public class TextFieldHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(event.getSource()==null){
            }
            else if(event.getSource()==null){
            }
        }
    }

    //AÇÃO POR MOUSE EM TEXTFIELDS, PASSWORDFIELDS, TEXTAREAS E JSCROLLPANES
    MouseListener ml = new MouseListener() {

        @Override
        public void mouseClicked(MouseEvent e) {
            
            if(e.getSource()==null){
                System.out.println("Ação por clique no textfield: limpar");
                ((JTextField)e.getSource()).setText("");
            }
        }
        @Override public void mousePressed(MouseEvent e) {}
        @Override public void mouseReleased(MouseEvent e) {}
        @Override public void mouseEntered(MouseEvent e) {}
        @Override public void mouseExited(MouseEvent e) {}

    };

    public String holding = "";
    public String subs = "";
    
    //AÇÃO POR MOUSE EM IMAGEM
    MouseListener mlDRAGDROP = new MouseListener() {

        //CLICKED E RELEASED SÓ FUNCIONAM COM (MOUSEPRESSED)TransferHandler.MOVE, ENQUANTO COM (MOUSEPRESSED)TransferHandler.COPY FUNCIONAM ENTERED E EXITED
        @Override
        public void mouseClicked(MouseEvent e){
            System.out.println("Mouse clicked in: "+((JLabel)e.getSource()).getName());
        }
        @Override
        public void mouseReleased(MouseEvent e){
            System.out.println("Mouse released in: "+((JLabel)e.getSource()).getName());
        }
        @Override
        public void mousePressed(MouseEvent e){
            JComponent jc = (JComponent)e.getSource();
            TransferHandler th = jc.getTransferHandler();
            th.exportAsDrag(jc,e,TransferHandler.COPY);
            System.out.println("Mouse holding: "+((JLabel)e.getSource()).getName());
            
            holding=""+((JLabel)e.getSource()).getName();
        }
        @Override
        public void mouseEntered(MouseEvent e){
            System.out.println("Mouse entered in: "+((JLabel)e.getSource()).getName());
            
            subs=""+((JLabel)e.getSource()).getName();
            //001B[30m ~ 001B[37m sendo o \u001B[0m o reset
            if(holding!="" && subs!=""){System.out.println("\u001B[33m"+holding+" put in the slot of "+subs+"\u001B[0m");}
            holding="";
            subs="";
        }
        @Override
        public void mouseExited(MouseEvent e){
            System.out.println("Mouse exited in: "+((JLabel)e.getSource()).getName());
        }
    };

    //AÇÃO POR TECLAS
    @Override
    public void keyTyped(KeyEvent e){
        System.out.println(e.getKeyChar());
    }
    @Override
    public void keyPressed(KeyEvent e){
        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key Pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key Pressed");
        }
    }
    @Override
    public void keyReleased(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key Released");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key Released");
        }
    }

}


