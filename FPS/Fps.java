import javax.swing.*;

class Fps
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("FPS control loop");
        f.setResizable(false);
        // f.setLocationRelativeTo(null);
        GamePanel game = new GamePanel();
        f.add(game);
        game.startGame();
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setVisible(true);
    }
}