import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window(String Title,int x, int y){
        super(Title);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container contentPane1 = this.getContentPane();
        Container contentPane2 = this.getContentPane();
        Container contentPane0 = this.getContentPane();
        JMenuBar m = new JMenuBar();

        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("A propos");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem New = new JMenuItem("New");
        JMenuItem Save = new JMenuItem("Save");
        JMenuItem Quit = new JMenuItem("Quit");
        menu1.add(New);
        menu1.add(open);
        menu1.add(Save);
        menu1.add(Quit);
        m.add(menu1);
        m.add(menu2);


        JButton rectangleButton= new JButton("Rectangle");
        JButton ellipseButton= new JButton("ellipse");
        JButton circleButton= new JButton("circle");
        JButton squareButton= new JButton("square");

        JButton blackButton= new JButton("black");
        JButton redButton= new JButton("red");
        JButton blueButton= new JButton("blue");
        JButton greenButton= new JButton("green");
        JButton yellowButton= new JButton("yellow");

        JButton magentaButton = new JButton("magenta");
        JButton orangeButton = new JButton("orange");
        JButton roseButton = new JButton("rose");


        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new GridLayout(2,4));
        eastPanel.add(blackButton);
        eastPanel.add(redButton);
        eastPanel.add(greenButton);
        eastPanel.add(blueButton);
        eastPanel.add(yellowButton);
        eastPanel.add(roseButton);
        eastPanel.add(magentaButton);
        eastPanel.add(orangeButton);

        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(2,2));
        westPanel.add(rectangleButton);
        westPanel.add(ellipseButton);
        westPanel.add(squareButton);
        westPanel.add(circleButton);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2,4));
        JButton blankButton = new JButton();
        centerPanel.add(blankButton);

        contentPane0.add(m,"First");
        contentPane1.add(centerPanel,"After");
        contentPane2.add(westPanel,"Before");
        contentPane2.add(eastPanel, "After");

        /*JPanel pannel = new JPanel();
        JLabel jLabel1 =new JLabel("Mon texte dans JLabel 1");
        jLabel1.setBackground(Color.red);
        pannel.add(jLabel1);

        JLabel jLabel2 =new JLabel("Mon texte dans JLabel 2");
        jLabel2.setBackground(Color.red);
        jLabel2.setOpaque(true);
        pannel.add(jLabel2);*/










        this.setVisible(true);

    }
}
