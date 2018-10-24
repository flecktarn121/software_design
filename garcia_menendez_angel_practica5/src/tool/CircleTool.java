package tool;

import action.CreateFigureAction;
import editor.Editor;
import fig.Circle;
import fig.Figure;

public class CircleTool extends ClickAndMoveTools implements Tool {
	public CircleTool(Editor editor) {
		super(editor);
	}

	@Override
	protected void createFigure() {
		Figure circle = new Circle(initialClick, endOfMovement);
		drawing.addFigure(circle);
		editor.getActionManager().addAction(new CreateFigureAction(circle, drawing));
	}

	



}
