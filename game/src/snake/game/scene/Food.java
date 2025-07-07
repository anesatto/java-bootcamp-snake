package snake.game.scene;

import snake.graphics.basic.Color;
import snake.graphics.basic.Point;
import snake.graphics.drawable.Rect;



import static snake.game.util.RandomUtils.random;

public class Food extends Rect {
    private static final int SIZE = 5;

    private final Rect drawingArea;

    public Food(Rect drawingArea) {
        this.drawingArea = drawingArea;

        moveToRandomLocation();
        dimension(SIZE, SIZE);
        setColor(Color.RED);
    }

    public void moveToRandomLocation() {
        int distanceFromBorder = 5;

        int x = random(
                drawingArea.minX() + distanceFromBorder,
                drawingArea.maxX() - SIZE - distanceFromBorder
        );

        int y = random(
                drawingArea.minY() + distanceFromBorder,
                drawingArea.maxY() - SIZE - distanceFromBorder
        );
        location(new Point(x, y));
    }
}
