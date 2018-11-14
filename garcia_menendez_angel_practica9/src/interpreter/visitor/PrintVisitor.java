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
	public void visit(Assignment ass) {
		ass.variable.accept(this);
		System.out.println(" = ");
		ass.expression.accept(this);

	}

	@Override
	public void visit(Division div) {
		div.left.accept(this);
		System.out.println(" / ");
		div.right.accept(this);

	}

	@Override
	public void visit(IntegerLiteral intLit) {
		System.out.println(String.valueOf(intLit.value));

	}

	@Override
	public void visit(Print pr) {
		System.out.println("print");
		pr.expression.accept(this);
		System.out.println(";");
	}

	@Override
	public void visit(Product prod) {
		prod.left.accept(this);
		System.out.println(" * ");
		prod.right.accept(this);

	}

	@Override
	public void visit(Program prog) {
		prog.statements.forEach((statement) -> statement.accept(this));
	}

	@Override
	public void visit(Read rd) {
		System.out.println("read");
		rd.variable.accept(this);
		System.out.println(";");
	}

	@Override
	public void visit(Sum sm) {
		sm.left.accept(this);
		System.out.println(" + ");
		sm.right.accept(this);
	}

	@Override
	public void visit(Variable var) {
		System.out.println(var.name);

	}

}
