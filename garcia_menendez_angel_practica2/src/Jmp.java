
public class Jmp extends Instruction {
	int argument;
	protected Jmp(int argument) {
		this.argument = argument;
	}
	@Override
	protected void execute(String[] args, MyStack stack, int[]memmory) {
		int increase = argument;
		for(int i = 0; i < increase; i++) {
			stack.increaseIp();
		}
		
	}

}
