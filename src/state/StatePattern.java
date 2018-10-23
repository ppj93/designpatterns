package state;

import java.util.ArrayList;
import java.util.Hashtable;

public class StatePattern{
	
	
	
	public static void main(String[] args) {

		StartState s1=new StartState();
		Context c=new Context();
		s1.doAction(c);
		EndState e=new EndState();
		
		e.doAction(c);
	}
}

abstract class State{
	abstract void doAction(Context c);
}

class Context{
	State state;
	
	public void setState(State s){
		System.out.println("current state: " + s);
		state=s;
	}
}

class StartState extends State {

	@Override
	void doAction(Context c) {
		// TODO Auto-generated method stub
		System.out.println("start state action");
		c.setState(this);
	}
	
	public String toString(){
		return "StartState";
	}
	
}

class EndState extends State {

	@Override
	void doAction(Context c) {
		// TODO Auto-generated method stub
		System.out.println("end state action");
		c.setState(this);
	}
	

	public String toString(){
		return "EndState";
	}
	
	
}