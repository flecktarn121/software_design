package editor;

import java.util.List;

import fig.Coordinate;
import fig.Figure;

public class Drawing {
	private List<Figure> figures;

	public void draw() {
		figures.forEach((figure) -> figure.draw());
	}

	public void addFigure(Figure figure) {
		figures.add(figure);
	}

	public Figure select(Coordinate coordinate) {
		return figures.stream().filter((figure) -> figure.isHere(coordinate)).findAny().orElse(null);
	}
}
