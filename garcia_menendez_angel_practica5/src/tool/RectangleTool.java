package tool;

import action.CreateFigureAction;
import editor.Editor;
import fig.Figure;
import fig.Rectangle;

public class RectangleTool extends ClickAndMoveTools implements Tool {
	public RectangleTool(Editor editor) {
		super(editor);
	}

	@Override
	protected void createFigure() {
		Figure figure = new Rectangle(initialClick, endOfMovement);
		drawing.addFigure(figure);
		editor.getActionManager().addAction(new CreateFigureAction(figure, drawing));
	}

}