package CH.ifa.draw.samples.nada;

import CH.ifa.draw.figures.RectangleFigure;
import CH.ifa.draw.framework.DrawingView;
import CH.ifa.draw.framework.Figure;
import CH.ifa.draw.framework.HJDError;
import CH.ifa.draw.standard.CreationTool;

import java.awt.event.MouseEvent;

public class EjemploTool extends CreationTool {
    public EjemploTool(DrawingView view, Figure prototype) {
        super(view, prototype);
    }

    public EjemploTool(DrawingView view) {
        this(view, new EjemploFigure());
        //super(view);
    }




}
