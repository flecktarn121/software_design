package data;

public class Database implements DataObserver {
	DefaultDataCenter dc;

	public Database(DefaultDataCenter dc) {
		super();
		this.dc = dc;
	}

	private void saveResults() {
		System.out.println("Guardando los resultados...");
	}

	@Override
	public void update() {
		this.saveResults();

	}
}
