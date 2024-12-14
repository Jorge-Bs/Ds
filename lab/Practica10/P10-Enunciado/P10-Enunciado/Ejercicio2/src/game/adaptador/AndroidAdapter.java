package game.adaptador;

import platform.Image2D;
import platform.android.AndroidAPI;

import java.awt.*;

public class AndroidAdapter implements Adaptador{

    private AndroidAPI api;
    public AndroidAdapter(AndroidAPI api) {
        this.api = api;
    }


    @Override
    public Image2D loadImage(String file) {
        return api.loadResource(file);
    }

    @Override
    public void drawBall(Image2D image, Point point) {
        api.draw(point.x, point.y, image);
    }

    @Override
    public Point getPosition() {
       return  api.getTouch();
    }
}
