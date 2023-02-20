import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator{
    JFrame jf = new JFrame("calculator");;
    public Calculator(){
        
        jf.setLayout(null);
        jf.setSize(600,600);

        JLabel display = new JLabel();
        display.setBounds(30,50,540,40);
        display.setBackground(Color.gray);
        display.setOpaque(true);
        jf.add(display);

        JButton sevenbutton = new JButton("7");
        sevenbutton.setBounds(30,130, 80,80);
        jf.add(sevenbutton);

        JButton eightbutton = new JButton("8");
        eightbutton.setBounds(130,130, 80,80);
        jf.add(eightbutton);

        JButton ninebutton = new JButton("9");
        ninebutton.setBounds(230,130, 80,80);
        jf.add(ninebutton);

        JButton fourbutton = new JButton("4");
        fourbutton.setBounds(30,230, 80,80);
        jf.add(fourbutton);

        JButton fivebutton = new JButton("5");
        fivebutton.setBounds(130,230,80,80);
        jf.add(fivebutton);

        JButton sixbutton = new JButton("6");
        sixbutton.setBounds(230, 230,80,80);
        jf.add(sixbutton);

        JButton threebutton = new JButton("3");
        threebutton.setBounds(30,330,80,80);
        jf.add(threebutton);

        JButton twobutton = new JButton("2");
        twobutton.setBounds(130,330,80,80);
        jf.add(twobutton);

        JButton onebutton = new JButton("1");
        onebutton.setBounds(230,330,80,80);
        jf.add(onebutton);

        JButton zerobutton = new JButton("0");
        zerobutton.setBounds(30,430,80,80);
        jf.add(zerobutton);

        JButton dotbutton = new JButton(".");
        dotbutton.setBounds(130,430,80,80);
        jf.add(dotbutton);

        JButton equalbutton = new JButton("=");
        equalbutton.setBounds(230,430,80,80);
        jf.add(equalbutton);

        JButton addbutton = new JButton("+");
        addbutton.setBounds(330,130, 80,80);
        jf.add(addbutton);

        JButton minusbutton = new JButton("-");
        minusbutton.setBounds(330, 230,80,80);
        jf.add(minusbutton);

        JButton multiplybutton = new JButton("x");
        multiplybutton.setBounds(330,330,80,80);
        jf.add(multiplybutton);

        JButton divisionbutton= new JButton("/");
        divisionbutton.setBounds(330,430,80,80);
        jf.add(divisionbutton);



        jf.setVisible(true);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
    public static void main(String arg[]){
        new Calculator();
    }
}