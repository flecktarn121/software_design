package command;

public class UnknownCommand implements Command {

	@Override
	public void execute(String[] param) {
		System.out.println("Instrucción desconocida");

	}

}
