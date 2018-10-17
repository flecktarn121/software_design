package tool;

import fig.Coordinate;
import fig.Figure;
import editor.Drawing;

public class SelectionTool implements Tool {
	private boolean isClicked;
	private Drawing drawing;
	private Coordinate coordinate;
	private Figure figure;
	
	@Override
	public void processAcction(String[] tokens) {
		String action = tokens[0];
		if(action.equals("pulsar") && !isClicked) {
			figure =drawing.select(new Coordinate(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
			if(figure == null) {
				isClicked = false;
			}else {
				isClicked = true;
			}
		}if(action.equals("mover") && isClicked) {
			 coordinate = new Coordinate(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
		}else if(action.equals("soltar") && isClicked) {
			figure.move(coordinate);
			isClicked = false;
		}

	}

	@Override
	public void setDrawing(Drawing drawing) {
		this.drawing = drawing;

	}

}
