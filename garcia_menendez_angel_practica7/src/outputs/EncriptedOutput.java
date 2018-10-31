package outputs;

import java.io.IOException;

import filesystem.Output;

public class EncriptedOutput implements Output {

	private Output outputDestination;

	public EncriptedOutput(Output outputDestination) {
		this.outputDestination = outputDestination;
	}

	@Override
	public void send(char c) throws IOException {
		if (Character.isLetter(c) || Character.isDigit(c)) {

			outputDestination.send(c);
		}

	}

	@Override
	public void close() throws IOException {
		outputDestination.close();

	}

}
