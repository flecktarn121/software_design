
public class Sub extends Instruction {

	@Override
	protected void execute(String[] args, MyStack stack, int[]memmory) {
		int b = stack.pop();
		int a = stack.pop();
		stack.push(a - b);
		stack.increaseIp();
		
	}

}
