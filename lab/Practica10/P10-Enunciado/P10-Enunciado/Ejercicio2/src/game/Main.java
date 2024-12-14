package game;

//otro ej, hacer el ballgame abstracto y dejar load image, get position
//y el metodo drawball dejarlos como protected abstract, e intentar hacerlo como un template

//tx si se hace una abstracta y se hace un nevo juego de ball hay que reconstruirlas, mientras que con un adapater solo se necesita un adapter y serviria para cada ball game
import game.adaptador.AndroidAdapter;
import platform.android.AndroidAPI;

public class Main {
	public static void main(String[] args) {
		BallGame game = new AndroidBallGame(new AndroidAPI());
		game.play();
	}
}
