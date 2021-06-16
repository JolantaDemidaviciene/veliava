import javax.swing.*;
import java.awt.*;

public class ComboBoxDemo {

    public static void main(String[] args) {
        // Sukuriam langą
        JFrame frame = new JFrame("My first JAVA App");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add panel with combo-box
        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        frame.getContentPane().add(BorderLayout.NORTH, panel);

        String country[] = {"India", "Aus", "U.S.A", "England", "Newzealand"};
        JComboBox countryComboBox = new JComboBox(country);
        countryComboBox.setSelectedIndex(2);

        panel.add(countryComboBox);

        frame.setVisible(true);

    }
}
