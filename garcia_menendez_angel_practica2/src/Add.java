
public class Add extends Instruction {


	@Override
	protected void execute(Interpreter interpreter) {
		interpreter.getStack().push(interpreter.getStack().pop() + interpreter.getStack().pop());
		interpreter.getStack().increaseIp();
		
	}

}
