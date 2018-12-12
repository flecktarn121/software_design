package CH.ifa.draw.samples.nada;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Vector;

import CH.ifa.draw.standard.AbstractFigure;

public class EjemploFigure extends AbstractFigure {
	private Point upperLeftCorner;
	private Point lowerRigthCorner;

	public EjemploFigure() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		int x = upperLeftCorner.x;
		int y = upperLeftCorner.y;
		int width = lowerRigthCorner.x - upperLeftCorner.x;
		int heigh = lowerRigthCorner.y - upperLeftCorner.y;
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, heigh);

	}

	@Override
	protected void basicMoveBy(int dx, int dy) {
		if (dx < 0 || dy < 0) {
			throw new IllegalArgumentException("yes imbecil o algo?, listillo");
		}
		this.upperLeftCorner.translate(dx, dy);
		this.lowerRigthCorner.translate(dx, dy);

	}

	@Override
	public void basicDisplayBox(Point origin, Point corner) {
		this.upperLeftCorner = origin;
		this.lowerRigthCorner = corner;

	}

	@Override
	public Rectangle displayBox() {
		int x = upperLeftCorner.x;
		int y = upperLeftCorner.y;
		int width = lowerRigthCorner.x - upperLeftCorner.x;
		int heigh = lowerRigthCorner.y - upperLeftCorner.y;
		// saber las dimensiones
		return new Rectangle(x, y, width, heigh);
	}

	@Override
	public Vector handles() {
		// devuelve los puntos de control
		return new Vector();
	}

}
