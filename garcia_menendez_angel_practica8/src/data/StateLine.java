package data;

public class StateLine implements DataObserver {
	private DefaultDataCenter dc;

	public StateLine(DefaultDataCenter dc) {
		this.dc = dc;
	}

	@Override
	public void update() {
		System.out.println("Yes = <" + dc.poll.getYeses() + ">");
		System.out.println("No = <" + dc.poll.getNos() + ">");
	}

}
