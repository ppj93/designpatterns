package nullpattern;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;

public class Null{
	
	
	
	public static void main(String[] args) {

		AbstractCustomer c1 =new RealCustomer("c1");
		CustomerRepo r =new CustomerRepo();
		r.l.add(c1);
		r.l.add(new RealCustomer("c2"));
		
		System.out.println(r.Search("c1"));
		System.out.println(r.Search("c1asdfad"));
		
	}
}

abstract class AbstractCustomer {
	public String name;
	public abstract boolean isNull();
	
	public AbstractCustomer(String n){
		name=n;
	}
	public String toString(){
		return "name: " + name + " , isNULL: " + isNull();
	}
}

class RealCustomer extends AbstractCustomer {

	public RealCustomer(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return false;
	}
	
}

class NilCustomer extends AbstractCustomer {

	public NilCustomer() {
		super(null);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return true;
	}
	
}

class CustomerRepo {
	LinkedList<AbstractCustomer> l = new LinkedList<AbstractCustomer>();
	public AbstractCustomer Search(String name){
		for(int i=0; i<l.size(); i++)
			if(l.get(i).name == name)
				return l.get(i);
		
		return new NilCustomer();
	}
	
}