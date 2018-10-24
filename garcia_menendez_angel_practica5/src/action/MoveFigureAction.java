package action;

import fig.Coordinate;
import fig.Figure;

public class MoveFigureAction implements Action {

	private Figure figure;
	private Coordinate originalPoint;
	private Coordinate finalPoint;

	public MoveFigureAction(Figure figure, Coordinate originalPoint, Coordinate finalPoint) {
		this.figure = figure;
		this.finalPoint = finalPoint;
		this.originalPoint = originalPoint;
	}

	@Override
	public void redo() {
		this.moveForwards(figure);

	}

	private void moveForwards(Figure figure2) {
		figure2.move(finalPoint);
		swapPoints();
	}

	private void swapPoints() {
		Coordinate originalPoint = this.finalPoint;
		Coordinate finalPoint = this.originalPoint;

		this.originalPoint = originalPoint;
		this.finalPoint = finalPoint;
	}

	@Override
	public void undo() {
		this.moveBackwards(figure);

	}

	void moveBackwards(Figure figure2) {
		figure2.move(originalPoint);
		swapPoints();
	}
}
