package platform.adapter;

import java.awt.Point;

import platform.Image2D;
import platform.Platform;
import platform.android.AndroidAPI;

public class AndroidPlatformAdapter implements Platform {
	private AndroidAPI api = new AndroidAPI();

	@Override
	public Image2D loadImage(String resouceName) {
		return api.loadResource(resouceName);
	}

	@Override
	public void drawBall(int x, int y, Image2D image) {
		api.draw(x, y, image);

	}

	@Override
	public Point getPosition() {
		return api.getTouch();
	}

}
