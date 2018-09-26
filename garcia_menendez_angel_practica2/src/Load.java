
public class Load extends Instruction {

	@Override
	protected void execute(String[] args, MyStack stack, int[]memmory) {
		int address = stack.pop();
		stack.push(memmory[address]);
		stack.increaseIp();
		
	}

}
