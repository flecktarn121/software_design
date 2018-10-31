package outputs;

import java.io.IOException;

import filesystem.Output;

public class NormalizedTextOutput implements Output {
	private Output outputDestination;

	public NormalizedTextOutput(Output outputDestination) {

	}

	@Override
	public void send(char c) throws IOException {
		if (c != '\r') {
			outputDestination.send(c);
		}

	}

	@Override
	public void close() throws IOException {
		outputDestination.close();

	}

}
