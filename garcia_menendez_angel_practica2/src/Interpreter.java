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
		while (stack.getIp() < instructions.size()) {
			String[] sentence = instructions.get(stack.getIp());
			this.index.getInstruction(sentence[0]).execute(sentence, stack, memory);
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
		Instruction ins = null;
		if (sentence[0].equals("push")) {
			ins = new Push(Integer.parseInt(sentence[1]));
		} else if (sentence[0].equals("add")) {
			ins = new Add();
		} else if (sentence[0].equals("sub")) {
			ins = new Sub();
		} else if (sentence[0].equals("mul")) {
			ins = new Mul();
		} else if (sentence[0].equals("jmp")) {
			ins = new Jmp(Integer.parseInt(sentence[1]));
		} else if (sentence[0].equals("jmpg")) {
			ins = new Jmpg(Integer.parseInt(sentence[1]));
		} else if (sentence[0].equals("load")) {
			ins = new Load();
		} else if (sentence[0].equals("store")) {
			ins = new Store();
		} else if (sentence[0].equals("input")) {
			ins = new Input();
		} else if (sentence[0].equals("output")) {
			ins = new Output();
		}
		insList.add(ins);
	}
}
