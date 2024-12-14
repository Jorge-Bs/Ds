package game;

import java.awt.Point;

import game.adaptador.Adaptador;
import game.adaptador.AndroidAdapter;
import game.adaptador.Playstation5Adapter;
import game.adaptador.WindowAdapter;
import platform.*;
import platform.android.*;
import platform.playstation.*;
import platform.windows.*;

/* Esta clase/paquete sería el código del videojuego, el cual se quiere reutilizar
 * en las distintas plataformas 
 */

enum Platform {
	ANDROID, WINDOWS, PLAYSTATION
};

public class BallGame {
//	// Seleccionar para qué plataforma se quiere generar el juego
//	private Platform platform = Platform.ANDROID;
//	// private Platform platform = Platform.WINDOWS;
//	// private Platform platform = Platform.PLAYSTATION;
//
//	private AndroidAPI android;
//	private WindowsAPI windows;
//	private Playstation5API playstation;

	private Adaptador adaptado;

	public BallGame(Adaptador adaptado){
		this.adaptado = adaptado;
		play();
	}

//	private void setAPI() {
//		if (platform == Platform.ANDROID)
//			adaptado = new AndroidAdapter(new AndroidAPI());
//		else if (platform == Platform.WINDOWS)
//			adaptado = new WindowAdapter(new WindowsAPI());
//		else
//			adaptado = new Playstation5Adapter(new Playstation5API());
//	}

	public void play() {
		//setAPI();

		Image2D image = loadImage("Bola.jpg");

		// Lógica principal del juego
		for (int i = 0; i < 10; i++) {
			Point point = getPosition();
			// Comprobar colisiones...
			// Imprimir marcador...
			// Otra lógica del juego...
			drawBall(image, point);
		}
	}

	private Image2D loadImage(String file) {
		Image2D image;
//		if (platform == Platform.ANDROID)
//			image = android.loadResource(file);
//		else if (platform == Platform.WINDOWS)
//			image = windows.loadFile(file);
//		else
//			image = playstation.loadGraphics(file);
//		return image;
		return adaptado.loadImage(file);
	}

	private void drawBall(Image2D image, Point point) {
		adaptado.drawBall(image, point);
	}

	private Point getPosition() {
//		Point point;
//		if (platform == Platform.ANDROID)
//			point = android.getTouch();
//		else if (platform == Platform.WINDOWS)
//			point = windows.getMouseClick();
//		else
//			point = playstation.getJoystick();
//		return point;
		return adaptado.getPosition();
	}
}
