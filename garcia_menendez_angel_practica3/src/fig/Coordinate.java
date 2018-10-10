package fig;

public class Coordinate {
	private int x;
	private int y;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Coordinate) {
			
			return this.x == ((Coordinate)obj).x && y == ((Coordinate)obj).y;
		}else {
			return false;
		}
	}

}
