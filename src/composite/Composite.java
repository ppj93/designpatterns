package composite;

import java.util.ArrayList;
import java.util.Hashtable;

public class Composite {
	
	
	
	public static void main(String[] args) {
		Employee me=new Employee("p");
		Employee manager =new Employee("hd");
		manager.subordinates.add(me);
		
		System.out.println(manager);
	}
}

class Employee {
	
	public Employee(String n){
		name = n;
	}
	public String name;

	public ArrayList<Employee> subordinates = new ArrayList<Employee>();
	
	public String toString() {
		
		return "name: " + name + " with "+ subordinates.size() + " subordinaes";
		
	}
}