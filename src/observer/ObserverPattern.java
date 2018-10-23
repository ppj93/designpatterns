package observer;

import java.util.ArrayList;
import java.util.LinkedList;

public class ObserverPattern {
	
	
	
	public static void main(String[] args) {

		Subject s=new Subject();

		SimpleObserver o= new SimpleObserver(s);
		
		s.attach(o);
		s.setState(1222);
	}
}

abstract class Observer {
	public Observer(Subject s){
		subject=s;
	}
	public Subject subject;
	abstract void update();
}

class Subject {
	private LinkedList<Observer> observers = new LinkedList<Observer>();
	private int state;
	
	public void setState(int newState){
		state =newState;
		notifyAllObservers();
	}
	
	public int getState(){
		return state;
	}
	
	public void attach(Observer o){
		observers.add(o);
	}
	
	public void notifyAllObservers(){
		for(int i=0; i<observers.size(); i++)
			observers.get(i).update();
	}
	
}

class SimpleObserver extends Observer {

	public SimpleObserver(Subject s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	void update() {
		// TODO Auto-generated method stub
		System.out.println("state chaned to : " + subject.getState());
	}
	
}