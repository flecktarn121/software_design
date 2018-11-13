package data;

public class PieChartThree extends PieChart {
	private int counter = 0;

	public PieChartThree(DefaultDataCenter dc) {
		super(dc);

	}

	@Override
	public void update() {
		if (counter >= 3) {
			super.update();
			counter++;
		}
	}

}
