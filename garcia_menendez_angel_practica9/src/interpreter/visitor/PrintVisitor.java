package interpreter.visitor;

import interpreter.ast.nodes.Assignment;
import interpreter.ast.nodes.Division;
import interpreter.ast.nodes.IntegerLiteral;
import interpreter.ast.nodes.Print;
import interpreter.ast.nodes.Product;
import interpreter.ast.nodes.Program;
import interpreter.ast.nodes.Read;
import interpreter.ast.nodes.Sum;
import interpreter.ast.nodes.Variable;

public class PrintVisitor implements Visitor {

	@Override
	public Object visit(Assignment ass, Object param) {
		ass.variable.accept(this, param);
		System.out.print(" = ");
		ass.expression.accept(this, param);
		System.out.print("\n");
		return null;

	}

	@Override
	public Object visit(Division div, Object param) {
		div.left.accept(this, param);
		System.out.print(" / ");
		div.right.accept(this, param);
		return null;

	}

	@Override
	public Object visit(IntegerLiteral intLit, Object param) {
		System.out.print(String.valueOf(intLit.value));
		return null;

	}

	@Override
	public Object visit(Print pr, Object param) {
		System.out.print("print");
		pr.expression.accept(this, param);
		System.out.print(";\n");
		return null;
	}

	@Override
	public Object visit(Product prod, Object param) {
		prod.left.accept(this, param);
		System.out.print(" * ");
		prod.right.accept(this, param);
		return null;

	}

	@Override
	public Object visit(Program prog, Object param) {
		prog.statements.forEach((statement) -> statement.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Read rd, Object param) {
		System.out.print("read ");
		rd.variable.accept(this, param);
		System.out.print(";\n");
		return null;
	}

	@Override
	public Object visit(Sum sm, Object param) {
		sm.left.accept(this, param);
		System.out.print(" + ");
		sm.right.accept(this, param);
		return null;
	}

	@Override
	public Object visit(Variable var, Object param) {
		System.out.print(var.name);
		return null;

	}

}
