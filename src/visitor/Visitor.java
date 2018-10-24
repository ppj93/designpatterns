package visitor;

import java.util.ArrayList;
import java.util.Hashtable;

public class Visitor{
	
	
	
	public static void main(String[] args) {
		PriceVisitor p= new PriceVisitor();
		Milk m=new Milk();
		System.out.println(m.accept(p));
		
		Water w=new Water();
		System.out.println(w.accept(p));
	}
}

interface IVisitor {
	
	double visit(Milk m);
	double visit(Water w);
}

interface IVisitable {
	double accept(IVisitor v);
}
class Milk implements IVisitable {

	@Override
	public double accept(IVisitor v) {
		// TODO Auto-generated method stub
		return v.visit(this);
	}
	
}

class Water implements IVisitable {

	@Override
	public double accept(IVisitor v) {
		// TODO Auto-generated method stub
		return v.visit(this);
	}
	
}

class PriceVisitor implements IVisitor {

	@Override
	public double visit(Milk m) {
		// TODO Auto-generated method stub
		return 66;
	}

	@Override
	public double visit(Water w) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}