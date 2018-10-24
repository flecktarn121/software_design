package action;

import editor.Drawing;
import fig.Figure;

public class CreateFigureAction implements Action {
	Figure figure;
	Drawing drawing;

	public CreateFigureAction(Figure figure, Drawing drawing) {
		this.drawing = drawing;
		this.figure = figure;
	}

	@Override
	public void redo() {
		drawing.addFigure(figure);

	}

	@Override
	public void undo() {
		drawing.remove(figure);

	}

}
