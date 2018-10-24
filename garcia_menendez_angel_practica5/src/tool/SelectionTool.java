package tool;

import action.MoveFigureAction;
import editor.Drawing;
import editor.Editor;
import fig.Coordinate;
import fig.Figure;

public class SelectionTool implements Tool {
	private boolean isClicked;
	private Drawing drawing;
	private Coordinate initialPoint;
	private Coordinate finalPoint;
	private Figure figure;
	private Editor editor;

	public SelectionTool(Editor editor) {
		this.editor = editor;
		setDrawing(editor.getDrawing());
	}

	@Override
	public void processAcction(String[] tokens) {
		String action = tokens[0];
		if (action.equals("pulsar") && !isClicked) {
			String[] arguments = tokens[1].split(",");
			initialPoint = new Coordinate(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1]));
			figure = drawing.select(initialPoint);
			if (figure == null) {
				isClicked = false;
			} else {
				isClicked = true;
			}
		}
		if (action.equals("mover") && isClicked) {
			String[] arguments = tokens[1].split(",");
			finalPoint = new Coordinate(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1]));
		} else if (action.equals("soltar") && isClicked) {
			figure.move(finalPoint);
			isClicked = false;
			editor.getActionManager().addAction(new MoveFigureAction(figure, initialPoint, finalPoint));
		}

	}

	@Override
	public void setDrawing(Drawing drawing) {
		this.drawing = drawing;

	}

}
