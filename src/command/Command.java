package command;

public class Command{
	
	
	
	public static void main(String[] args) {
		
		Stock s=new Stock();
		
		new SellStock(s).execute();
		new BuyStock(s).execute();
	}
}

interface IOrder {
	void execute();
}

class Stock {
	
	public void buy(){
		System.out.println("buy");
	}
	
	public void sell(){
		System.out.println("sold");
	}
}

class SellStock implements IOrder {

	private Stock stock;
	
	public SellStock(Stock s){
		stock = s;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stock.sell();
	}
}

class BuyStock implements IOrder {

	private Stock stock;
	
	public BuyStock(Stock s){
		stock = s;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stock.buy();
	}
}