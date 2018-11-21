package platform;

import java.awt.Point;

public interface Platform {
	public Image2D loadImage(String resouceName);
	public void drawBall(int x, int y, Image2D image);
	public Point getPosition();
}
