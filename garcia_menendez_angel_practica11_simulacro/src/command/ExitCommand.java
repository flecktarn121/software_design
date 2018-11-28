package command;

import editor.Editor;

public class ExitCommand implements Command {
	private Editor editor;

	public ExitCommand(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void execute(String[] param) {
		editor.exit();
	}

}
