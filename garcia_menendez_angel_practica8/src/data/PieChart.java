package data;

public class PieChart implements DataObserver{
	DefaultDataCenter dc;
	public PieChart(DefaultDataCenter dc) {
		super();
		this.dc = dc;
	}
	public void update() 
	{
		System.out.println("Dibujando un gráfico circular...");
	}
}
