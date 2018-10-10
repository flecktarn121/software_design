
public class Jmp extends Instruction {
	int argument;
	protected Jmp(int argument) {
		this.argument = argument;
	}
	@Override
	protected void execute(Interpreter interpreter) {
		interpreter.getStack().setIp(argument);
		
	}

}
