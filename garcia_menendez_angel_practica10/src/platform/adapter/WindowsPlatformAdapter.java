package platform.adapter;

import java.awt.Point;

import platform.Image2D;
import platform.Platform;
import platform.windows.WindowsAPI;

public class WindowsPlatformAdapter implements Platform {
	private WindowsAPI api = new WindowsAPI();

	@Override
	public Image2D loadImage(String resouceName) {
		return api.loadFile(resouceName);
	}

	@Override
	public void drawBall(int x, int y, Image2D image) {
		api.paint(x, y, image);

	}

	@Override
	public Point getPosition() {
		return api.getMouseClick();
	}

}
