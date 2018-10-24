package tool;

import action.CreateFigureAction;
import editor.Drawing;
import editor.Editor;
import fig.Coordinate;
import fig.Figure;
import fig.Triangle;

public class TriangleTool implements Tool {
	private Drawing drawing;
	private int counter = 0;
	private Coordinate firstClick;
	private Coordinate secondClick;
	private Coordinate thirdClick;
	private Editor editor;

	public TriangleTool(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void processAcction(String[] tokens) {
		String action = tokens[0];
		if (action.equals("pulsar") && counter == 0) {
			firstClick = new Coordinate(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
		} else if (action.equals("pulsar") && counter == 1) {
			secondClick = new Coordinate(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
		} else if (action.equals("pulsar") && counter == 2) {
			thirdClick = new Coordinate(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
			Figure figure = new Triangle(firstClick, secondClick, thirdClick);
			drawing.addFigure(figure);
			editor.getActionManager().addAction(new CreateFigureAction(figure, drawing));
		}

	}

	@Override
	public void setDrawing(Drawing drawing) {
		this.drawing = drawing;

	}

}
