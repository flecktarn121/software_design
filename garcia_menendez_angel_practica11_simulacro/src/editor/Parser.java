package editor;

import java.util.HashMap;
import java.util.Map;

import command.Command;
import command.DeleteCommand;
import command.ExecuteCommand;
import command.ExitCommand;
import command.InsertCommand;
import command.OpenCommand;
import command.RecordCommand;
import command.SubstituteCommand;
import command.UnknownCommand;

public class Parser {
	private Editor editor;
	private Map<String, Command> userCommands;

	public Parser(Editor editor) {
		this.editor = editor;
		userCommands = new HashMap<String, Command>();
	}

	public Command parse(String[] line) {
		if (line[0].equals("salir"))
			return new ExitCommand(editor);

		if (line[0].equals("abre")) {
			return new OpenCommand(editor);
		} else if (line[0].startsWith("ins")) {
			new InsertCommand(editor);
			return null;
		} else if (line[0].startsWith("borr")) {
			return new DeleteCommand(editor);
		} else if (line[0].startsWith("reem")) {
			return new SubstituteCommand(editor);
		} else if (line[0].startsWith("graba")) {
			return new RecordCommand(editor);
		} else if (line[0].startsWith("para")) {
			return null;
		} else if (line[0].startsWith("ejecuta")) {
			return new ExecuteCommand(editor);
		} else {
			return new UnknownCommand();
		}

		// System.out.println(texto);
	}

	public Command getUserCommand(String command) {
		return this.userCommands.get(command);
	}

	public void addUserCommand(String key, Command command) {
		this.userCommands.put(key, command);
	}
}
