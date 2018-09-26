
public class Add extends Instruction {


	@Override
	protected void execute(String[] args, MyStack stack, int[]memmory) {
		stack.push(stack.pop() + stack.pop());
		stack.increaseIp();
		
	}

}
