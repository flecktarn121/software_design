package fig;

public class Circle implements Figure {
	private Coordinate centre;
	private int radius;
	
	public Circle(Coordinate beggining, Coordinate end) {
		this.calculateCentre( beggining,  end);
		this.calculateRadius( beggining,  end);
	}

	private void calculateRadius(Coordinate beggining, Coordinate end) {
		radius = Math.abs(end.getX()-beggining.getX())/2;
		
		
	}

	private void calculateCentre(Coordinate beggining, Coordinate end) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String draw() {
		
		return "Circulo " + centre.toString() + " radio = "+radius;
	}

	@Override
	public void move(Coordinate coordinate) {
		centre = coordinate;
		
	}

	@Override
	public boolean isHere(Coordinate coordinate) {
		return coordinate.equals(centre);
	}

}

