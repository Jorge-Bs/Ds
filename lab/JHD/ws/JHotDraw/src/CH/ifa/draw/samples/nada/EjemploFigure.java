package CH.ifa.draw.samples.nada;

import CH.ifa.draw.standard.AbstractFigure;

import java.awt.*;
import java.util.Vector;

public class EjemploFigure extends AbstractFigure {

    Point origin;
    Point corner;

    int width;
    int height;


    @Override
    protected void basicMoveBy(int dx, int dy) {
        origin.x += dx;
        origin.y += dy;
        corner.x += dx;
        corner.y += dy;
    }

    @Override
    public void basicDisplayBox(Point origin, Point corner) {
        this.origin = origin;
        this.corner = corner;
        width = corner.x - origin.x;
        height = corner.y - origin.y;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(java.awt.Color.WHITE);
        g.fillRect(origin.x,origin.y,width,height);
    }

    @Override
    public Rectangle displayBox() {
        return new Rectangle(origin.x,origin.y,width,height);
    }

    @Override
    public Vector handles() {
        return new Vector();
    }
}
