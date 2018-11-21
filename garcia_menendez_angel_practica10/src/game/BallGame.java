package game;

/*Se usarán el patrón strategy para contener por composición la plataforma y su comportamiento, librándonos así de la 
 * lógica condicional de setAPI, encapsulándola en un objeto, además, usaremos el patrón adapter para adaptar la API 
 * concreta al juegop de la bola
 *
*/
import java.awt.Point;

import platform.Image2D;
import platform.Platform;

/* Esta clase (y todo el código que hubiera dentro de este paquete) sería el
 * código del videojuego completo, y es lo que se desea reutilizar en las distintas
 * plataformas.
 */

public class BallGame {
	// Decide para qué plataform queremos generar el juego
	private Platform platform = null;

	public BallGame(Platform platform) {
		this.platform = platform;
	}
	public void play() {
		Image2D image = loadImage("ball.png");

		// lógica principal del juego
		for (int i = 0; i < 10; i++) {
			Point point = getPosition();
			drawBall(image, point);
		}
	}

	private Image2D loadImage(String file) {
		return platform.loadImage(file);
	}

	private Point getPosition() {
		return platform.getPosition();
	}

	private void drawBall(Image2D image, Point point) {
		platform.drawBall(point.x, point.y, image);
	}
}
