package editor;

import fig.Coordinate;

public abstract class ClickAndMoveTools implements Tool {
	private boolean isClicked;
	protected Coordinate initialClick;	
	protected Coordinate endOfMovement;
	protected Drawing drawing;

	@Override
	public void processAcction(String[] tokens) {
		String action = tokens[0];
		
		if(action.equals("pulsar") && !isClicked) {
			initialClick = new Coordinate(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
			isClicked = true;
		}else if(action.equals("mover") && isClicked) {
			endOfMovement = new Coordinate(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
		}else if(action.equals("soltar") && isClicked) {
			createFigure();
			isClicked = false;
		}
		
	}
	
	protected abstract void createFigure();

	@Override
	public void setDrawing(Drawing drawing) {
		this.drawing = drawing;
	}
}
