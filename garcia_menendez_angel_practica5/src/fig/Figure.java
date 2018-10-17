package fig;

public interface Figure {
	
	public String draw();
	public void move(Coordinate coordinate);
	public boolean isHere(Coordinate coordinate);

}
