package editor.core;

import java.util.Map;

import editor.herramientas.HerramientaSeleccion;
import figuras.circulo.HerramientaCirculo;
import figuras.rectangulo.HerramientaRectangulo;
import figuras.triangulo.HerramientaTriangulo;

public class EditorWindow extends AbstractEditorWindow {

	@Override
	protected void doCreaHerramientas(Map<String, Herramienta> herramientas) {
      herramientas.put("rectangulo", new HerramientaRectangulo(this));
      herramientas.put("circulo", new HerramientaCirculo(this));
      herramientas.put("triangulo", new HerramientaTriangulo(this));
      herramientas.put("seleccion", new HerramientaSeleccion(this));
	}

}
