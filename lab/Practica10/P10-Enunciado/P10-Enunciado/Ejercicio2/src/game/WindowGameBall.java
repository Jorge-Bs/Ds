package game;

import platform.Image2D;
import platform.windows.WindowsAPI;

import java.awt.*;

public class WindowGameBall extends BallGame{

    private WindowsAPI window;

    public WindowGameBall(WindowsAPI window){
        this.window=window;
    }


    @Override
    protected Image2D loadImage(String file) {
        return  window.loadFile(file);
    }

    @Override
    protected void drawBall(Image2D image, Point point) {
        window.paint(point.x, point.y,image);
    }

    @Override
    protected Point getPosition() {
        return window.getMouseClick();
    }
}
