import javax.swing.*;
import java.awt.*;

public class TextPaswordDemo {
    public static void main(String[] args) {

            JFrame frame = new JFrame("Text and pasword");
            frame.setSize(600,600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            JPanel panel = new JPanel();
            panel.setBackground(Color.PINK);
            frame.getContentPane().add(BorderLayout.NORTH, panel);

            JTextField tekstas = new JTextField(20);
            JPasswordField slaptazodis = new JPasswordField(20);

            panel.add(tekstas);
            panel.add(slaptazodis);

            frame.setVisible(true);


        }
    }
