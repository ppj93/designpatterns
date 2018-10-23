package memento;

import java.util.ArrayList;

import memento.Originator.Memento;

public class MementoPattern {
	
	
	
	public static void main(String[] args) {
		Originator o= new Originator();
		o.setState("s1");
		o.setState("s2");

		Memento m1 = o.saveToMemento();
		
		o.setState("s3");
		
		Memento m2 = o.saveToMemento();

		o.restoreFromMemento(m1);
	}
}



class Originator {
	private String state;
	
	public void setState(String s){
		System.out.println("setting staete " + s);
		state=s;
	}
	
	public Memento saveToMemento(){
		System.out.println("saving to memento " + state);
		return new Memento(state);
	}
	
	public void restoreFromMemento(Memento m){
		System.out.println("saving to memento " + m.state);
		state=m.state;	
	}
	
	public static class Memento{
		public final String state;
		
		public Memento(String s){
			state=s;
		}
	}
}