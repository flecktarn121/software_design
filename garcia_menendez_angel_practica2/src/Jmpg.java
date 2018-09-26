
public class Jmpg extends Instruction {
	int argument;
	protected Jmpg(int argument) {
		this.argument = argument;
	}
	
	@Override
	protected void execute(String[] args, MyStack stack, int[]memmory) {
		int b = stack.pop();
		int a = stack.pop();
		if (a > b) {
			int increase = argument;
			for(int i = 0; i < increase; i++) {
				stack.increaseIp();
			}
		}else {
			stack.increaseIp();
		}
	}

}
