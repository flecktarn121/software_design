import java.util.Scanner;

public class Input extends Instruction {

	@Override
	protected void execute(Interpreter interpreter) {
		System.out.println("Escriba un entero:");
		interpreter.getStack().push(readValue());
		interpreter.getStack().increaseIp();
		
	}
	
	private int readValue() 
	{
		return new Scanner(System.in).nextInt();
	}

}
