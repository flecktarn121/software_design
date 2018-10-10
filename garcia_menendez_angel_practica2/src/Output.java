
public class Output extends Instruction {
	@Override
	protected void execute(Interpreter interpreter) {
		System.out.println(interpreter.getStack().pop());
		interpreter.getStack().increaseIp();
		
	}

}
