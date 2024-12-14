package editor.historial;

import cambioHerramienta.Cambio;

import java.util.Stack;

public class Historial {

    private Stack<Cambio> undo = new Stack<Cambio>();
    private Stack<Cambio> redo = new Stack<Cambio>();


    public void undo(){
        if(!undo.isEmpty()){
            Cambio cambio = undo.pop();
            cambio.undo();
            redo.push(cambio);
        }
    }

    public void redo(){
        if(!redo.isEmpty()){
            Cambio cambio = redo.pop();
            cambio.redo();
            undo.push(cambio);
        }

    }

    public void add(Cambio cambio){
        undo.push(cambio);
        redo.removeAllElements();
    }

}
