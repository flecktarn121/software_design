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

public interface Visitor {
	public Object visit(Assignment ass, Object param);

	public Object visit(Division div, Object param);

	public Object visit(IntegerLiteral intLit, Object param);

	public Object visit(Print pr, Object param);

	public Object visit(Product prod, Object param);

	public Object visit(Program prog, Object param);

	public Object visit(Read rd, Object param);

	public Object visit(Sum sm, Object param);

	public Object visit(Variable var, Object param);
}
