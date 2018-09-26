import java.util.HashMap;
import java.util.function.Function;

public class InstructionIndex {

	private HashMap<String, Function<String[], Instruction>> index = new HashMap<String, Function<String[], Instruction>>();

	protected InstructionIndex() {
		this.fillIndex();
	}

	private void fillIndex() {
		index.put("add", (argument) -> {
			return new Add();
		});
		index.put("input", (argument) -> {
			return new Input();
		});
		index.put("jmp", (argument) -> {
			return new Jmp(Integer.parseInt(argument[1]));
		});
		index.put("jmpg", (argument) -> {
			return new Jmpg(Integer.parseInt(argument[1]));
		});
		index.put("load", (argument) -> {
			return new Load();
		});
		index.put("mul", (argument) -> {
			return new Mul();
		});
		index.put("output", (argument) -> {
			return new Output();
		});
		index.put("push", (argument) -> {
			return new Push(Integer.parseInt(argument[1]));
		});
		index.put("store", (argument) -> {
			return new Store();
		});
		index.put("sub", (argument) -> {
			return new Sub();
		});

	}

	protected Function<String[], Instruction> getInstruction(String instCode) {
		return index.get(instCode);
	}

}
