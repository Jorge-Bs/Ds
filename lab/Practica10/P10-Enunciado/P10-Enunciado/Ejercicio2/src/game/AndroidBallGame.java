package game;

import platform.Image2D;
import platform.android.AndroidAPI;

import java.awt.*;

public class AndroidBallGame extends BallGame {

    private AndroidAPI android;

    public AndroidBallGame(AndroidAPI android) {
        this.android=android;
    }


    @Override
    protected Image2D loadImage(String file) {
        return android.loadResource(file);
    }

    @Override
    protected void drawBall(Image2D image, Point point) {
        android.draw(point.x, point.y,image);
    }

    @Override
    protected Point getPosition() {
        return android.getTouch();
    }
}
