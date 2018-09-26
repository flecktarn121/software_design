
public class Output extends Instruction {
	@Override
	protected void execute(String[] args, MyStack stack, int[]memmory) {
		System.out.println(stack.pop());
		stack.increaseIp();
		
	}

}
