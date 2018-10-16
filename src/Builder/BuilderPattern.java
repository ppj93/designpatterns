package Builder;

import java.util.ArrayList;

public class BuilderPattern {
	
	
	
	public static void main(String[] args) {
		Meal m = new Meal();
		m.addItem(new VegBurger());
		m.addItem(new Coke());
		System.out.println(m.totalPrice());
	}
}

interface Packing {
	public String pack();
}

class Wrapper implements Packing {
	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return "Wrapper packing hai yeee";
	}	
}

class Box implements Packing {
	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return "Bpxx packingg somjkjhha";
	}
}

interface Item {
	public String name();
	public double getPrice();
	public Packing pack();
}



abstract class Burger implements Item {
	public Packing pack(){
		return new Wrapper();
	}
	
	public String name(){
		return "Burger";
	}
	
}

class Coke implements Item {
	public Packing pack(){
		return new Box();
	}
	
	public String name(){
		return "Coke";
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 20;
	}
}

class VegBurger extends Burger {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Veg " + super.name();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 10;
	}
	
}

//implement non veg burger

class Meal {
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item){
		items.add(item);
	}
	
	public ArrayList<Item> getItems(){
		return items;
	}
	
	public double totalPrice(){
		double total=0;
		
		for(int i=0; i<items.size(); i++)
			total += items.get(i).getPrice();
		
		return total;
	}
}