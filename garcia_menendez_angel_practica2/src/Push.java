
public class Push extends Instruction {
	int value;

	protected Push(int value) {
		this.value = value;
	}
	
	@Override
	protected void execute(String[] args, MyStack stack, int[]memmory) {
		stack.push(value);
		stack.increaseIp();		
	}

}
