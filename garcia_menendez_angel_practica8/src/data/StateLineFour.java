package data;

public class StateLineFour extends StateLine {
	private int counter = 0;

	public StateLineFour(DefaultDataCenter dc) {
		super(dc);
	}

	@Override
	public void update() {
		counter++;
		if (counter == 4 || (counter < 4 && counter % 2 == 0)) {
			super.update();
		}
	}

}
