package command;

import java.util.regex.Pattern;

import editor.Editor;

public class SubstituteCommand implements Command {
	private Editor editor;

	public SubstituteCommand(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void execute(String[] param) {
		StringBuilder text = editor.getText();
		text = new StringBuilder(text.toString().replaceAll(Pattern.quote(param[1]), param[2]));
	}

}
