import javax.swing.*;
import java.awt.*;

public class Loginpage
{
    public static void main(String[] args)
    {
            JFrame f= new JFrame("Login Page");
            JLabel l1= new JLabel("Username:");
            JLabel l2= new JLabel("Password:");
            JTextField tf1=new JTextField();
            JTextField tf2= new JTextField();
            JButton b= new JButton("LOG IN");
            
            f.add(l1);
            f.add(l2);
            f.add(tf1);
            f.add(tf2);
            f.add(b);
            f.setSize(400,400);
            l1.setBounds(100,100,80,30);
            l2.setBounds(100,150,80,30);
            tf1.setBounds(200,100,80,30);
            tf2.setBounds(200,150,80,30);
            b.setBounds(150,200,50,40);
            f.setLayout(null);
            f.setVisible(true);
    }
}
