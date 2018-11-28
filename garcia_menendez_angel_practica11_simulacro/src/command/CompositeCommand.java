package command;

import java.util.ArrayList;
import java.util.List;

import editor.Editor;

public class CompositeCommand implements Command {
	// A command that implements the composite pattern
	private List<Command> commands;
	private List<String[]> params;

	public CompositeCommand(Editor editor) {
		this.commands = new ArrayList<Command>();
		this.params = new ArrayList<String[]>();
	}

	void addCommand(Command command, String[] params) {
		commands.add(command);
		this.params.add(params);
	}

	@Override
	public void execute(String[] param) {
		commands.forEach((command) -> {
			int index = commands.indexOf(command);
			command.execute(params.get(index));
		});
	}

}
