
public class Push extends Instruction {
	int value;

	protected Push(int value) {
		this.value = value;
	}
	
	@Override
	protected void execute(Interpreter interpreter) {
		interpreter.getStack().push(value);
		interpreter.getStack().increaseIp();		
	}

}
