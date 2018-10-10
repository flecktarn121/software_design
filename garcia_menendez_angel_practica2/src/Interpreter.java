import java.io.*;
import java.util.*;

public class Interpreter {
	private List<String[]> instructions = new ArrayList<>();
	private List<Instruction> insList = new ArrayList<Instruction>();

	private MyStack stack = new MyStack();
	private int[] memory = new int[1024];
	private InstructionIndex index = new InstructionIndex();

	public static void main(String[] args) throws Exception {
		new Interpreter();
	}

	public Interpreter() {
		BufferedReader file = null;

		String line;
		try {
			file = new BufferedReader(new FileReader("factorial.txt"));
			while ((line = file.readLine()) != null) {
				loadSentence(line);
				loadInstruction(line);
			}
		} catch (IOException e) {
			System.err.println("There has been a problem reading the file.");
		} finally {
			try {
				file.close();
			} catch (IOException e) {

			}
		}

		executeProgram();
	}

	private void executeProgram() {
		int ip;
		while (stack.getIp() < insList.size()) {
			ip = stack.getIp();
			insList.get(ip).execute(this);
		}
	}

	private static final boolean TRACE = false;

	private void loadSentence(String line) {
		if (line.trim().length() == 0)
			return;

		String[] tokens = line.split(" ");
		if (TRACE) {
			for (String token : tokens)
				System.out.println("*" + token + "*");
		}
		instructions.add(tokens);
	}

	private void loadInstruction(String line) {
		if (line.trim().length() == 0)
			return;
		String[] sentence = line.split(" ");
		Instruction ins = index.getInstruction(sentence[0]).apply(sentence);
		insList.add(ins);
	}
	
	protected MyStack getStack() {
		return stack;
	}
	
	protected int[] getMemory() {
		return memory;
	}
}
