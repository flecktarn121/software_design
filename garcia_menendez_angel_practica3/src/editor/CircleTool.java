package editor;

import fig.Circle;

public class CircleTool extends ClickAndMoveTools implements Tool {
	@Override
	protected void createFigure() {
		drawing.addFigure(new Circle(initialClick, endOfMovement));
		
	}

	



}
