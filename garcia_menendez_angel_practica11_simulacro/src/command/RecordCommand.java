package command;

import java.io.IOException;

import editor.Editor;

public class RecordCommand implements Command {

	private Editor editor;
	private CompositeCommand cc;

	public RecordCommand(Editor editor) {
		this.editor = editor;
		cc = new CompositeCommand(editor);
	}

	@Override
	public void execute(String[] param) {
		System.out.print("> ");

		try {
			for (;;) {
				String[] line = Editor.in.readLine().split(" ");
				if (line[0].equals("para")) {
					break;
				}
				Command command = editor.getParser().parse(line);
				cc.addCommand(command, line);
			}
			editor.getParser().addUserCommand(param[1], cc);
		} catch (IOException e) {
			System.out.println("There has been a problem reading the orders.");
		}

	}

}
