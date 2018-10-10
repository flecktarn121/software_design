package fig;

public class Triangle implements Figure {
	private Coordinate firstVertix;
	private Coordinate secondVertix;
	private Coordinate thirdVertix;

	public Triangle(Coordinate firstVertix, Coordinate secondVertix, Coordinate thirdVertix) {
		this.firstVertix = firstVertix;
		this.secondVertix = secondVertix;
		this.thirdVertix = thirdVertix;
	}

	@Override
	public String draw() {
		return "Triangulo (" + firstVertix.toString() + ") (" + secondVertix.toString() + ") (" + thirdVertix + ")";
	}

	@Override
	public void move(Coordinate coordinate) {
		firstVertix = coordinate;

	}

	@Override
	public boolean isHere(Coordinate coordinate) {
		return coordinate.equals(coordinate);
	}

}
