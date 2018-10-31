package outputs.filter;

import java.io.IOException;

import filesystem.Output;

public class CharacterCountOutput implements Output {
	private Output outputDestination;
	private int numCharacters=0;
	
	public CharacterCountOutput(Output outputDestination) {
		this.outputDestination = outputDestination;
	}
	@Override
	public void send(char c) throws IOException {
		numCharacters++;
		outputDestination.send(c);

	}

	@Override
	public void close() throws IOException {
		outputDestination.close();

	}
	
	public int getNumberOfCharacters() {
		return numCharacters;
	}

}
