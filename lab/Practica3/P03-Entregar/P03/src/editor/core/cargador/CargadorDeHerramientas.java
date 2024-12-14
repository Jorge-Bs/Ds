package editor.core.cargador;

import editor.core.herramientas.*;

import java.util.HashMap;

public class CargadorDeHerramientas {

    public HashMap<String, Herramientas> obtenerHerramientas() {
        HashMap<String, Herramientas> figuras = new HashMap<>();
        figuras.put("rectangulo", new HRectangulo());
        figuras.put("circulo", new HCirculo());
        figuras.put("triangulo", new HTriangulo());
        figuras.put("seleccion", new HSeleccion());
        return figuras;
    }
}
