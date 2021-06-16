import javax.swing.*;
import java.awt.*;

public class progresBar {
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("Progres Bar");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add panel with Progress-bar
        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        frame.getContentPane().add(BorderLayout.NORTH, panel);

        JProgressBar pBar = new JProgressBar();

        pBar.setValue(50);

        panel.add(pBar);

        frame.setVisible(true);

        for (int i = 0; i < 100; i++) {
            Thread.sleep(100);
            pBar.setValue(i);
        }
    }
}

