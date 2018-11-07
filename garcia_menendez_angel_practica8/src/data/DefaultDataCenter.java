package data;

public class DefaultDataCenter implements DataCenter {

	private Database db = new Database();
	private PieChart pie = new PieChart();
	private BarChart bar = new BarChart();
	@Override
	public void updateData() {
		this.updatePieChart();
		this.UpdateBarChart();
		this.saveResults();

	}
	private void saveResults() {
		db.saveResults();
		
	}
	private void UpdateBarChart() {
		bar.updateBarChart();
		
	}
	private void updatePieChart() {
		pie.updatePieChart();
		
	}

}
