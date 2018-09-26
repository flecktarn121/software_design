
public class Store extends Instruction {
	@Override
	protected void execute(String[] args, MyStack stack, int[]memmory) {
		int value = stack.pop();
		int address = stack.pop();
		memmory[address] = value;
		stack.increaseIp();
	}

}
