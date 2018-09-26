
public class Sub extends Instruction {

	@Override
	protected void execute(Interpreter interpreter) {
		int b = interpreter.getStack().pop();
		int a = interpreter.getStack().pop();
		interpreter.getStack().push(a - b);
		interpreter.getStack().increaseIp();
		
	}

}
