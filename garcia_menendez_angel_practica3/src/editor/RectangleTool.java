package editor;

import fig.Rectangle;

public class RectangleTool extends ClickAndMoveTools implements Tool {
	@Override
	protected void createFigure() {
		drawing.addFigure(new Rectangle(initialClick, endOfMovement));

	}

}
