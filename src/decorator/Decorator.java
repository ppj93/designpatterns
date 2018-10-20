package decorator;


public class Decorator {
	
	
	
	public static void main(String[] args) {
			
		ShapeDecorator s= new ShapeDecorator(new Circle());
		s.draw();
	}
	
}

interface IShape {
	void draw();
}

class Circle implements IShape
{

	@Override
	public void draw() {
		System.out.println("circle drawn");
		// TODO Auto-generated method stub
	}
	
}

class ShapeDecorator implements IShape {

	private IShape shape;
	
	public ShapeDecorator(IShape s){
		shape=s;	
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		shape.draw();
		System.out.println("drew a shape and did my own thigns after drawing");
	}
	
}