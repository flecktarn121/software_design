package command;

import editor.Editor;

public class DeleteCommand implements Command {

	private Editor editor;

	public DeleteCommand(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void execute(String[] param) {
		StringBuilder text = editor.getText();
		int indexOfLastWord = text.toString().trim().lastIndexOf(" ");
		if (indexOfLastWord == -1)
			text = new StringBuilder("");
		else
			text.setLength(indexOfLastWord + 1);
	}

}
