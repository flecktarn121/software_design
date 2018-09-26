
public class Store extends Instruction {
	@Override
	protected void execute(Interpreter interpreter) {
		int value = interpreter.getStack().pop();
		int address = interpreter.getStack().pop();
		interpreter.getMemory()[address] = value;
		interpreter.getStack().increaseIp();
	}

}
