package game;

//otro ej, hacer el ballgame abstracto y dejar load image, get position
//y el metodo drawball dejarlos como protected abstract, e intentar hacerlo como un template


import game.adaptador.AndroidAdapter;
import platform.android.AndroidAPI;

public class Main {
	public static void main(String[] args) {
		BallGame game = new BallGame(new AndroidAdapter(new AndroidAPI()));
		game.play();
	}
}
