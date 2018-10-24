package tool;

import fig.Coordinate;
import action.CreateFigureAction;
import editor.Drawing;
import editor.Editor;

public abstract class ClickAndMoveTools implements Tool {
	private boolean isClicked;
	protected Coordinate initialClick;	
	protected Coordinate endOfMovement;
	protected Drawing drawing;
	
	protected Editor editor;

	public ClickAndMoveTools(Editor editor) {
		this.editor = editor;
		setDrawing(editor.getDrawing());
	}
	
	@Override
	public void processAcction(String[] tokens) {
		String action = tokens[0];
		if(action.equals("pulsar") && !isClicked) {
			String[] arguments = tokens[1].split(",");
			initialClick = new Coordinate(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1]));
			isClicked = true;
		}else if(action.equals("mover") && isClicked) {
			String[] arguments = tokens[1].split(",");
			endOfMovement = new Coordinate(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1]));
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
