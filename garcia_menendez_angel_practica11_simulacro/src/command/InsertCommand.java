package command;

import editor.Editor;

public class InsertCommand implements Command {
	private Editor editor;

	public InsertCommand(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void execute(String[] param) {
		for (int i = 1; i < param.length; i++) {
			editor.getText().append(param[i] + " ");
		}

	}

}
