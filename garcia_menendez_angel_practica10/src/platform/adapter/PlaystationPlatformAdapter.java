package platform.adapter;

import java.awt.Point;

import platform.Image2D;
import platform.Platform;
import platform.playstation.Playstation5API;

public class PlaystationPlatformAdapter implements Platform {
private Playstation5API api = new Playstation5API();
	@Override
	public Image2D loadImage(String resouceName) {
		return api.loadGraphics(resouceName);
	}

	@Override
	public void drawBall(int x, int y, Image2D image) {
		api.render(x, y, image);

	}

	@Override
	public Point getPosition() {
		return api.getJoystick();
	}

}
