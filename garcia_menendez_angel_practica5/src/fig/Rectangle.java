package fig;

public class Rectangle implements Figure {
	private Coordinate peak;
	private int heigh;
	private int width;

	public Rectangle(Coordinate beggining, Coordinate end) {
		peak = beggining;
		heigh = Math.max(beggining.getX(), end.getX()) - Math.min(beggining.getX(), end.getX());
		width = Math.max(beggining.getY(), end.getY()) - Math.min(beggining.getY(), end.getY());
	}

	@Override
	public String draw() {

		return "Rectangulo " + peak.toString() + " altura = " + heigh + " anchura = " + width;
	}

	@Override
	public void move(Coordinate coordinate) {
		peak = coordinate;
	}

	@Override
	public boolean isHere(Coordinate coordinate) {
		return peak.equals(coordinate);
	}

}

