package snake.graphics.window.internal;

import snake.graphics.basic.Point;
import snake.graphics.drawable.Rect;
import snake.graphics.drawable.Text;

import javax.swing.*;
import java.awt.*;

public class JFrameGameWindow extends JFrame {

    private final Renderer renderer;
    private final Rect drawingArea;

    public JFrameGameWindow(String title, int width, int height) {
        setTitle(title);
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        renderer = new Renderer();

        int upperY = height - getContentPane().getSize().height;
        drawingArea = new Rect(0, upperY, width, height - upperY);

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        renderer.render(g);
    }

    public Rect getDrawingArea() {
        return drawingArea;
    }

    public Renderer getRenderer() {
        return renderer;
    }

}