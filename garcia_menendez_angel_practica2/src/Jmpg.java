
public class Jmpg extends Instruction {
	int argument;

	protected Jmpg(int argument) {
		this.argument = argument;
	}

	@Override
	protected void execute(Interpreter interpreter) {
		int b = interpreter.getStack().pop();
		int a = interpreter.getStack().pop();
		if (a > b) {
			interpreter.getStack().setIp(argument);
		} else {
			interpreter.getStack().increaseIp();
		}
	}

}
