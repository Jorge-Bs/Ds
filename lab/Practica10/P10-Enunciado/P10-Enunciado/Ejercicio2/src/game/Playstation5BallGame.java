package game;

import platform.Image2D;
import platform.playstation.Playstation5API;

import java.awt.*;

public class Playstation5BallGame extends BallGame {
    private Playstation5API playstation5;

    public Playstation5BallGame(Playstation5API playstation5) {
        this.playstation5 = playstation5;
    }

    @Override
    protected Image2D loadImage(String file) {
        return playstation5.loadGraphics(file);
    }

    @Override
    protected void drawBall(Image2D image, Point point) {
        playstation5.render(point.x, point.y, image);
    }

    @Override
    protected Point getPosition() {
        return playstation5.getJoystick();
    }
}
