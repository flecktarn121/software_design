package data;

public class BarChartThree extends BarChart {
	private int counter = 0;
	public BarChartThree(DefaultDataCenter dc) {
		super(dc);
	}
	
	@Override
	public void update() {
		counter++;
		if(counter == 1) {
			counter -= 3;
			super.update();
		}
	}

}
