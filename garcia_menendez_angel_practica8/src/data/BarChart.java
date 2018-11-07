package data;

public class BarChart implements DataObserver {
	DefaultDataCenter dc;

	public BarChart(DefaultDataCenter dc) {
		super();
		this.dc = dc;
	}

	public void update() {
		System.out.println("Dibujando un gráfico de barras...");
	}
}
