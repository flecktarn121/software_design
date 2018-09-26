import java.util.Scanner;

public class Input extends Instruction {

	@Override
	protected void execute(String[] args, MyStack stack, int[]memmory) {
		System.out.println("Escriba un entero:");
		stack.push(readValue());
		stack.increaseIp();
		
	}
	
	private int readValue() 
	{
		return new Scanner(System.in).nextInt();
	}

}
