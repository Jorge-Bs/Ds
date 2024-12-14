package game.adaptador;

import platform.Image2D;

import java.awt.*;

public interface Adaptador {

    public Image2D loadImage(String file);

    public void drawBall(Image2D image, Point point);

    public Point getPosition();
}
