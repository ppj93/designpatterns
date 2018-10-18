package filter;

import java.awt.List;
import java.util.ArrayList;
import java.util.Hashtable;

public class Filter {
	
	
	
	public static void main(String[] args) {

		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("pra"));
		list.add(new Person("vin"));
		list.add(new Person("pravin"));
		list.add(new Person("ram"));
		list.add(new Person("name"));
		
		System.out.println(new StartsWithFilter("p").filter(list).toString());
		
		System.out.println(new EndsWithFilter("n").filter(list).toString());
	
		AndFilter and = new AndFilter(new StartsWithFilter("p"), new EndsWithFilter("n"));
		
		System.out.println(and.filter(list));
	}
	
}

class Person {
	public Person(String namef){
		name = namef;
	}
	
	public String name;
	
	public String toString(){
		return name;
	}
}

interface IFilter {
	ArrayList<Person> filter(ArrayList<Person> list);
}

class StartsWithFilter implements IFilter {

	private String prefix;
	public StartsWithFilter(String prefix){
		this.prefix = prefix;
	}
	
	@Override
	public ArrayList<Person> filter(ArrayList<Person> list) {
		// TODO Auto-generated method stub
		ArrayList<Person> result = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++)
			if(list.get(i).name.startsWith(prefix))
				result.add(list.get(i));
		
		return result;
	}
	
}

class EndsWithFilter implements IFilter {

	private String suffix;
	public EndsWithFilter(String suffix){
		this.suffix = suffix;
	}
	
	@Override
	public ArrayList<Person> filter(ArrayList<Person> list) {
		// TODO Auto-generated method stub
		ArrayList<Person> result = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++)
			if(list.get(i).name.endsWith(suffix))
				result.add(list.get(i));
		
		return result;
	}
	
}


class AndFilter implements IFilter {

	IFilter filter1 ,filter2;
	
	public AndFilter(IFilter f1, IFilter f2){
		filter1 = f1;
		filter2 = f2;
	}
	
	@Override
	public ArrayList<Person> filter(ArrayList<Person> list) {
		// TODO Auto-generated method stub
		ArrayList<Person> f1result = filter1.filter(list);
		ArrayList<Person> f2result = filter2.filter(list);
	
		ArrayList<Person> intersect = new ArrayList<Person>();
		
		for(int i=0; i<f1result.size(); i++)
			if(f2result.contains(f1result.get(i)))
					intersect.add(f1result.get(i));
			
		return intersect;

	}
	
} 