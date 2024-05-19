import javax.swing.*;
import java.awt.*;

public class Login
{
    public static void main(String[] args)
    {
        JFrame f=new JFrame("Login Page");
        f.setSize(400,400);
        f.setLayout(new FlowLayout(FlowLayout.LEFT,50,50));
        JButton b1= new JButton("Button 1");
        JButton b2= new JButton("Button 2");
        JButton b3= new JButton("Button 3");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setVisible(true);
    }
}
