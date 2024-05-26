import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String args[]) {
        JFrame f = new JFrame("Spaceship");
        Spaceship sp = new Spaceship();
        sp.setPreferredSize(new Dimension(500, 300));
        JButton left = new JButton("Left");
        JButton right = new JButton("Right");
        left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Left");
                sp.moveLeft();
            }
        });
        right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Right");
                sp.moveRight();
            }
        });
        JPanel actionPanel = new JPanel();
        actionPanel.add(left);
        actionPanel.add(right);
        f.add(sp, BorderLayout.NORTH);
        f.add(actionPanel, BorderLayout.SOUTH);
        f.setSize(500, 500);
        f.setVisible(true);
    }
}