package command;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import editor.Editor;

public class OpenCommand implements Command {

	private Editor editor;

	public OpenCommand(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void execute(String[] param) {
		try {
			editor.setText(readFile(param[1]));
		} catch (IOException e) {
			System.err.println("It was not possible to read the file.");
		}

	}

	StringBuilder readFile(String filename) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(filename));
		String line;
		StringBuilder result = new StringBuilder();
		while ((line = input.readLine()) != null) {
			result.append(line);
		}
		input.close();
		return result;
	}

}
