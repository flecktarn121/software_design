package tool;

import fig.Coordinate;
import editor.Drawing;
import fig.Triangle;

public class TriangleTool implements Tool {
	private Drawing drawing;
	private int counter = 0;
	private Coordinate firstClick;
	private Coordinate secondClick;
	private Coordinate thirdClick;

	@Override
	public void processAcction(String[] tokens) {
		String action = tokens[0];
		if (action.equals("pulsar") && counter == 0) {
			firstClick = new Coordinate(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
		} else if (action.equals("pulsar") && counter == 1) {
			secondClick = new Coordinate(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
		}else if(action.equals("pulsar")&& counter ==2) {
			thirdClick = new Coordinate(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
			drawing.addFigure(new Triangle(firstClick, secondClick, thirdClick));
		}

	}

	@Override
	public void setDrawing(Drawing drawing) {
		this.drawing = drawing;

	}

}
