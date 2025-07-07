package snake.graphics.drawable;

import snake.graphics.basic.Color;

import java.awt.*;


public class Rect extends Drawable{
    private final Rectangle rectangle;

    public Rect(int x, int y, int width, int height) {
        super(Color.WHITE);
        this.rectangle = new Rectangle(x, y, width, height);
    }

    public Rect(Point point, Dimension dimension) {
        this(point.x, point.y, dimension.width, dimension.height);
    }

    public Rect(){
        this(0,0,0,0);
    }



    public Point location() {
        return new Point(rectangle.x, rectangle.y);
    }

    public void location(snake.graphics.basic.Point point) {
        rectangle.x = point.x();
        rectangle.y = point.y();
    }

    public Dimension dimension() {
        return new Dimension(rectangle.width, rectangle.height);
    }

    public void location(snake.graphics.basic.Dimension dimension) {
        rectangle.width = dimension().width;
        rectangle.height = dimension().height;
    }

    public void dimension(int width, int height) {
        rectangle.width = width;
        rectangle.height = height;
    }

    public int minX() {
        return (int) rectangle.getMinX();
    }

    public int minY(){
        return (int) rectangle.getMinY();
    }

    public int maxX(){
        return (int) rectangle.getMaxX();
    }

    public int maxY(){
        return (int) rectangle.getMaxY();
    }

    public boolean intersects (Rect rect) {
        return rectangle.intersects(rect.rectangle);
    }


    @Override
    public void draw(Graphics g) {
        g.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);

    }
}
