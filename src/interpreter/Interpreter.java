package interpreter;

public class Interpreter{
	
	public static void main(String[] args) {
		OrExpression o = new OrExpression(new UnitExpression("adf"), new UnitExpression("asdfd"));
		System.out.println(o.interpret("adsfadfdsdfd"));
	}
}

interface IExpression {
	boolean interpret(String context);
}

class UnitExpression implements IExpression{

	private String data;
	
	public UnitExpression(String d){
		data = d;
	}
	
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return context.contains(data);
	}
}

class OrExpression implements IExpression {

	IExpression e1, e2;
	
	public OrExpression(IExpression i1, IExpression i2){
		e1=i1;
		e2=i2;
	}
	
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return e1.interpret(context) && e2.interpret(context);
	}
	
}
