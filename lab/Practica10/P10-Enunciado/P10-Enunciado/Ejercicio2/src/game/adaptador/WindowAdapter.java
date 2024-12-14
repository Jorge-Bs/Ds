package game.adaptador;

import platform.Image2D;
import platform.windows.WindowsAPI;

import java.awt.*;

public class WindowAdapter implements Adaptador {

    private WindowsAPI window;

    public WindowAdapter(WindowsAPI window) {
        this.window = window;
    }

    @Override
    public Image2D loadImage(String file) {
        return window.loadFile(file);
    }

    @Override
    public void drawBall(Image2D image, Point point) {
        window.paint(point.x, point.y,image);
    }

    @Override
    public Point getPosition() {
        return window.getMouseClick();
    }
}
