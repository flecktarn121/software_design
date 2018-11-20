package interpreter.visitor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import interpreter.ast.nodes.Assignment;
import interpreter.ast.nodes.Division;
import interpreter.ast.nodes.IntegerLiteral;
import interpreter.ast.nodes.Print;
import interpreter.ast.nodes.Product;
import interpreter.ast.nodes.Program;
import interpreter.ast.nodes.Read;
import interpreter.ast.nodes.Sum;
import interpreter.ast.nodes.Variable;

public class InterpreterVisitor implements Visitor {
	private Map<String, Object> variables = new HashMap<String, Object>();

	@Override
	public Object visit(Assignment ass, Object param) {
		variables.put(ass.variable.name, ass.expression.accept(this, param));
		return null;
	}

	@Override
	public Integer visit(Division div, Object param) {

		return ((Integer) div.left.accept(this, param)) / ((Integer) (div.right.accept(this, param)));
	}

	@Override
	public Integer visit(IntegerLiteral intLit, Object param) {

		return Integer.parseInt(intLit.value);
	}

	@Override
	public Object visit(Print pr, Object param) {
		System.out.println(pr.expression.accept(this, param).toString());
		return null;
	}

	@Override
	public Object visit(Product prod, Object param) {
		return (Integer.parseInt(prod.left.accept(this, param).toString()))
				* (Integer.parseInt(prod.right.accept(this, param).toString()));
	}

	@Override
	public Object visit(Program prog, Object param) {
		prog.statements.forEach((statement) -> statement.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Read rd, Object param) {
		String aux = new Scanner(System.in).next();
		variables.put(rd.variable.name.toString(), aux);
		return null;
	}

	@Override
	public Object visit(Sum sm, Object param) {
		return ((Integer) sm.left.accept(this, param)) + ((Integer) sm.right.accept(this, param));
	}

	@Override
	public Object visit(Variable var, Object param) {
		return variables.get(var.name);
	}

}
