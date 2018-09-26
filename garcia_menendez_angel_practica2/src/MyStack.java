
public class MyStack {
	private int ip = 0;
	private int[] stack = new int[32];
	private int sp = 0;

	protected void push(int value) {
		stack[sp] = value;
		sp++;
	}

	protected int pop() {
		sp--;
		return stack[sp];
	}
	
	protected void increaseIp() {
		ip++;
	}
	
	protected int getIp() {
		return ip;
	}
}
