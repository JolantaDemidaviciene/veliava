import javax.swing.*;
import java.awt.*;

public class LabelDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Label Demo");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        frame.getContentPane().add(BorderLayout.NORTH, panel);

        JLabel line1 = new JLabel(String.format("Sveiki,"));


        panel.add(line1);


        frame.setVisible(true);


    }
}
