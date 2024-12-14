package game.adaptador;

import platform.Image2D;
import platform.playstation.Playstation5API;

import java.awt.*;

public class Playstation5Adapter  implements Adaptador{

    private Playstation5API api;

    public Playstation5Adapter(Playstation5API api) {
        this.api=api;
    }


    @Override
    public Image2D loadImage(String file) {
        return api.loadGraphics(file);
    }

    @Override
    public void drawBall(Image2D image, Point point) {
        api.render(point.x, point.y, image);
    }

    @Override
    public Point getPosition() {
        return api.getJoystick();
    }
}
