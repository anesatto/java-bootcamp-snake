package snake.graphics.window;

import javax.swing.*;
import java.awt.*;

public class JFrameGameWindow extends JFrame {

    public JFrameGameWindow(String title, int width, int height) {
        setTitle(title);
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
      g.setColor(Color.BLACK);
      g.fillRect(0,0,400,400);


    }

}
