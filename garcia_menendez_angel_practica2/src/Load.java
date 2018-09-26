
public class Load extends Instruction {

	@Override
	protected void execute(Interpreter interpreter) {
		int address = interpreter.getStack().pop();
		interpreter.getStack().push(interpreter.getMemory()[address]);
		interpreter.getStack().increaseIp();
		
	}

}
