package editor;

import action.ActionManager;
import tool.Tool;

public class Editor {
	private Drawing drawing; // el documento de dibujo
	private Tool tool;
	private ActionManager actionManager = new ActionManager();

	public Editor(Drawing drawing) {
		setDrawing(drawing);
	}

	public Drawing getDrawing() {
		return drawing;
	}

	public void setDrawing(Drawing drawing) {
		this.drawing = drawing;
	}

	public void drawDocument() {
		drawing.draw();
	}

	public void setTool(Tool tool) {
		this.tool = tool;
	}

	public void useTool(String[] action) {
		tool.processAcction(action);
	}

	public ActionManager getActionManager() {
		return actionManager;
	}
}
