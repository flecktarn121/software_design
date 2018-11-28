package command;

import editor.Editor;

public class ExecuteCommand implements Command {

	private Editor editor;

	public ExecuteCommand(Editor editor) {
		this.editor = editor;
	}
	
	@Override
	public void execute(String[] param) {
		editor.getParser().getUserCommand(param[1]);

	}

}
