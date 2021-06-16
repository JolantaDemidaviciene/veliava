import javax.swing.*;
import java.awt.*;

public class ListDemo {
    public static void main(String[] args) throws Exception {

        int langoY = 300;
        int langoX = 300;

        JFrame frame = new JFrame("ListDemo");

        frame.setLayout(new BorderLayout());
        frame.setSize(langoX,langoY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);

        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.add(panel, BorderLayout.CENTER);



        String[] countries = {"Australia", "India", "U.S.A", "Russia", "Brazil"};

        JList list = new JList(countries);

        panel.add(list);
        frame.setVisible(true);

    }
}
