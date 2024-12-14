package editor.core;

import editor.core.cargador.CargadorDeHerramientas;
import editor.core.figuras.Figuras;
import editor.core.figuras.Vertice;
import editor.core.herramientas.Herramientas;

import java.util.HashMap;

public class Editor {

    private Dibujo dibujo;
    private HashMap<String, Herramientas> tipos = new HashMap<>();
    private Herramientas herramientaActiva;

    public Editor() {
        dibujo = new Dibujo();
        tipos = new CargadorDeHerramientas().obtenerHerramientas();
        herramientaActiva = tipos.get("seleccion");
        herramientaActiva.establecerDibujo(dibujo);
    }

    public void dibujar() {
        // Se dibuja el menú
        // Se dibuja la barra de herramientas lateral
        // Se dibuja la línea de estado
        dibujo.dibujar();
        herramientaActiva = tipos.get("seleccion");
    }

    //$ Métodos del Interfaz de Usuario -----------------------------

    // Se pinchar el botón de una herramienta para activarla
    public void clickToolButton(String toolName) {
        herramientaActiva=tipos.get(toolName);
        herramientaActiva.establecerDibujo(dibujo);
    }

    public void pinchar(int x, int y) {
        herramientaActiva.registrarPinchar(new Vertice(x,y));
    }

    public void mover(int x, int y) {
        herramientaActiva.registrarMover(new Vertice(x,y));
    }

    public void soltar(int x, int y) {
        herramientaActiva.registrarSoltar(new Vertice(x,y));
    }

    //$ Métodos del dibujo -----------------------------

    public Dibujo getDibujo() {
        return dibujo;
    }

    public String obtenerNombreHerramienta() {
        return herramientaActiva.obtenerNombre();
    }
}
