import javax.swing.*;
import java.awt.*;

public class Demo {

    public static void main (String[] args) {
        JFrame frame = new JFrame("My first JAVA App");
        frame.setSize(600,300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.yellow);
        panel1.setSize(frame.getWidth(),frame.getHeight()/3);
        frame.getContentPane().add(BorderLayout.NORTH, panel1);


        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.green);
        panel2.setSize(frame.getWidth(),frame.getHeight()/3);
        frame.getContentPane().add(BorderLayout.CENTER,panel2);



        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.red);
        panel3.setSize(frame.getWidth(),frame.getHeight()/3);
        frame.getContentPane().add(BorderLayout.SOUTH,panel3);
        frame.setLayout(new GridLayout(3,1));



        frame.setVisible(true);
    }
}
