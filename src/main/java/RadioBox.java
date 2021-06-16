import javax.swing.*;
import java.awt.*;

public class RadioBox {

    public static void main(String[] args) {
        System.out.println("Application start!");


        // Sukuriam langą
        JFrame frame = new JFrame("My first JAVA App");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add header with checkboxes
        JPanel header = new JPanel();
        header.setBackground(Color.PINK);
        frame.getContentPane().add(BorderLayout.NORTH, header);

        JCheckBox chb1 = new JCheckBox("Pirmas pasirinkimas");
        JCheckBox chb2 = new JCheckBox("Antras pasirinkimas");
        JCheckBox chb3 = new JCheckBox("Trecias pasirinkimas");

        header.add(chb1);
        header.add(chb2);
        header.add(chb3);

        // add SubHeader with RadioBoxes
        JPanel subHeader = new JPanel();
        subHeader.setBackground(Color.decode("#02f7fc"));
        frame.getContentPane().add(BorderLayout.NORTH, subHeader);

        ButtonGroup radioBtnGroup = new ButtonGroup();
        JRadioButton radio1 = new JRadioButton("Pirmas radio");
        JRadioButton radio2 = new JRadioButton("Antras radio");
        JRadioButton radio3 = new JRadioButton("Trecias radio");
        radioBtnGroup.add(radio1);
        radioBtnGroup.add(radio2);
        radioBtnGroup.add(radio3);

        subHeader.add(radio1);
        subHeader.add(radio2);
        subHeader.add(radio3);


        // Footer with buttons
        JPanel footer = new JPanel();
        footer.setBackground(Color.BLUE);
        frame.getContentPane().add(BorderLayout.SOUTH, footer);

        JButton btn1 = new JButton("Mygtukas 1");
        JButton btn2 = new JButton("Mygtukas 2");

        footer.add(btn1);
        footer.add(btn2);

        frame.setVisible(true);

    }
}
