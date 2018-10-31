package outputs;

import java.io.IOException;

import filesystem.Output;

public class NoRepeatedSpacesOutput implements Output {
	private Output outputDestination;
	private int numberOfSpaces = 0;

	public NoRepeatedSpacesOutput(Output outputDestination) {
		this.outputDestination = outputDestination;
	}

	@Override
	public void send(char c) throws IOException {
		if (c != ' ' || numberOfSpaces < 1) {
			outputDestination.send(c);
			if (c == ' ') {
				numberOfSpaces++;
			} else {
				numberOfSpaces = 0;
			}
		}

	}

	@Override
	public void close() throws IOException {
		outputDestination.close();

	}

}
