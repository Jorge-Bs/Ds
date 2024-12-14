package editor.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mouse {

    public void simulateMouse(Editor editor) throws IOException {

        System.out.println("\nActivación de Herramientas: rectangulo | circulo | triangulo | seleccion");
        System.out.println("Acciones de Ratón: pinchar x,y | mover x,y | soltar x,y");
        System.out.println("Otros Comandos: dibujar | exit \n");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print(editor.obtenerNombreHerramienta() + "> ");
            String[] line = in.readLine().split("[ ,]");

            if (line[0].equals("exit"))
                return;

            //$ Pulsación de los botones de las herramientas -----------------------------

            if (line[0].startsWith("rec"))
                editor.clickToolButton("rectangulo");

            else if (line[0].startsWith("cir"))
                editor.clickToolButton("circulo");

            else if (line[0].startsWith("tri"))
                editor.clickToolButton("triangulo");

            else if (line[0].startsWith("sel"))
                editor.clickToolButton("seleccion");

                //$ Acciones del Ratón -----------------------------

            else if (line[0].startsWith("pin"))
                editor.pinchar(Integer.parseInt(line[1]), Integer.parseInt(line[2]));

            else if (line[0].startsWith("mov"))
                editor.mover(Integer.parseInt(line[1]), Integer.parseInt(line[2]));

            else if (line[0].startsWith("sol"))
                editor.soltar(Integer.parseInt(line[1]), Integer.parseInt(line[2]));

                //$ Otros comandos -----------------------------

            else if (line[0].startsWith("dib"))
                editor.dibujar();

            else
                System.out.println("Comando no válido");

        } while (true);
    }
}
