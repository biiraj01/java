import java.awt.*;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Enemy extends JPanel {
    Random randomNumber = new Random();
    int x = randomNumber.nextInt(500);
    int y = 0;
    Image image;

    Enemy() {
        try {
            image = ImageIO.read(new File("./Asteroid.png"));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawImage(image, x, y, 100, 100, this);
    }

    public void update() {
        y = y + 1;
    }
}
