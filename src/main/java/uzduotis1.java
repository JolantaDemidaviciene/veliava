import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class uzduotis1 {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Uzduotis 1");
        frame.setSize(600,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField skaicius1= new JTextField(20);
        JTextField skaicius2= new JTextField(20);
        JTextField rezultatas = new JTextField(20);
        JButton sudeti = new JButton("+");
        JButton atimti = new JButton("-");
        sudeti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sk1= Integer.parseInt(skaicius1.getText());
                int sk2= Integer.parseInt(skaicius2.getText());
                rezultatas.setText(" " +(sk1 + sk2));
            }
        });
        atimti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sk1= Integer.parseInt(skaicius1.getText());
                int sk2= Integer.parseInt(skaicius2.getText());
                rezultatas.setText(" " +(sk1 - sk2));
            }
        });
        JPanel virsuspanel = new JPanel();
        virsuspanel.setPreferredSize(new Dimension(250,200));
        JPanel centraspanel = new JPanel();
        virsuspanel.add(skaicius1);
        virsuspanel.add(skaicius2);
        virsuspanel.add(sudeti);
        virsuspanel.add(atimti);
        virsuspanel.add(rezultatas);
        frame.getContentPane().add(BorderLayout.NORTH, virsuspanel);
        frame.getContentPane().add(BorderLayout.CENTER, centraspanel);




        frame.setVisible(true);
    }
}
