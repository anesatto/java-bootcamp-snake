package snake.game.scene;

import snake.graphics.basic.Dimension;
import snake.graphics.basic.Point;
import snake.graphics.drawable.Rect;

import static snake.graphics.basic.Color.WHITE;

public class Snake extends snake.graphics.drawable.Shape {

    public Snake() {
        super(WHITE);

        Point p = new Point(100, 100);
        Dimension d = new Dimension(10 ,10 );

        Rect rect = new Rect();
        addRect(rect);

        Point direction = new Point(-1, 0 );

        for (int i = 0; i <= 10; i++) {
            rect = duplicateRect(rect, direction);
            addRect(rect);
        }
    }

    public void move() {}


}

