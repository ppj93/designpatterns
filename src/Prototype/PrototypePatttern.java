package Prototype;

import java.util.ArrayList;
import java.util.Hashtable;

public class PrototypePatttern {
	
	
	
	public static void main(String[] args) {
		
		Red r= new Red();
		ColorStore.add(r);
		ColorStore.add(new Blue());
		
		//maj atta ani ek red color hawa 
		
		Color c= ColorStore.get(r.getId()); // ha ghe navin red..rokda
		
		System.out.println(c.getId());
	}
}

abstract class Color implements Cloneable {

	public abstract int getId();
	
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
}

class Red extends Color {

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 1;
	}
	
}

class Blue extends Color {

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 2;
	}
	
}

class ColorStore {
	private static Hashtable<Integer, Color> colors = new Hashtable<Integer, Color>();
	
	public static void add(Color c){
		colors.put(c.getId(), c);
	}
	
	public static Color get(int id)
	{
		if(colors.containsKey(id))
			return (Color) colors.get(id).clone();
		return null;
	}
}
