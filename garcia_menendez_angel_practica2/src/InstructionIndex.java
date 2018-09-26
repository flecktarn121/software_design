import java.util.HashMap;

import com.sun.org.apache.xpath.internal.functions.FuncBoolean;

public class InstructionIndex {
	
	private HashMap<String, Instruction> index = new HashMap<String, Instruction>();
	
	protected InstructionIndex() {
		this.fillIndex();
	}
	
	private void fillIndex() {		
//		index.put("add", new Add());
//		index.put("input", new Input());
//		index.put("jmp", new Jmp());
//		index.put("jmpg", new Jmpg());
//		index.put("load", new Load());
//		index.put("mul", new Mul());
//		index.put("output", new Output());
//		index.put("push", new Push());
//		index.put("store", new Store());
//		index.put("sub", new Sub());
		
	}

	protected Instruction getInstruction(String instCode) {
		return index.get(instCode);
	}

}
