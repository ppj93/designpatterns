package stretegy;

public class Stretegy{
	
	
	
	public static void main(String[] args) {
		System.out.println(new AddStretegy().doOperation(11, 2));
		System.out.println(new MultiplyStretegy().doOperation(11, 2));
	}
}

interface IStretegy {
	int doOperation(int x, int y);
}


class AddStretegy implements IStretegy {

	@Override
	public int doOperation(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
	
}


class MultiplyStretegy implements IStretegy {

	@Override
	public int doOperation(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}
	
}