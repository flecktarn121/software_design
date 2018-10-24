package editor;

import java.util.ArrayList;
import java.util.List;

import fig.Coordinate;
import fig.Figure;

public class Drawing {
	private List<Figure> figures = new ArrayList<Figure>();

	public void draw() {
		figures.forEach((figure) -> System.out.println(figure.draw()));
	}

	public void addFigure(Figure figure) {
		figures.add(figure);
	}

	public Figure select(Coordinate coordinate) {
		return figures.stream().filter((figure) -> figure.isHere(coordinate)).findAny().orElse(null);
	}

	public void remove(Figure figure) {
		figures.remove(figure);
	}
}