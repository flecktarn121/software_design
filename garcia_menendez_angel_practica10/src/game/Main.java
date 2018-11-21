package game;

import platform.adapter.AndroidPlatformAdapter;

public class Main {
	public static void main(String[] args) {
		BallGame game = new BallGame(new AndroidPlatformAdapter());
		game.play();
	}
}
