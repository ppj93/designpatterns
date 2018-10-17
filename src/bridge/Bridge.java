package bridge;

public class Bridge{
	
	
	
	public static void main(String[] args) {
		Vehicle c = new Bike(new CopraWorkshop());
		c.manufacture();
		
		Vehicle c1 = new Car(new CopraWorkshop());
		c1.manufacture();
	}
}

abstract class Vehicle {
	protected Workshop workshop;
	
	public Vehicle(Workshop w){
		workshop = w;
	}
	
	abstract void manufacture();
}


abstract class Workshop {
	abstract void work();
}

class Car extends Vehicle {

	public Car(Workshop w) {
		super(w);
		// TODO Auto-generated constructor stub
	}

	@Override
	void manufacture() {
		// TODO Auto-generated method stub
		workshop.work();
	}
}

class Bike extends Vehicle {
	public Bike(Workshop w) {
		super(w);
		// TODO Auto-generated constructor stub
	}

	@Override
	void manufacture() {
		// TODO Auto-generated method stub
		workshop.work();
	}
}

class CopraWorkshop extends Workshop {

	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("work chal rha hai bhaiyaaaa");
	}
	
}