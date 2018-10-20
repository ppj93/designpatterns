package facade;


public class Facade {
	
	
	
	public static void main(String[] args) {
		
		ShapeFacade s= new ShapeFacade();
		s.drawCircleAndRectangle();
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

class Rectanble implements IShape
{

	@Override
	public void draw() {
		System.out.println("Rectanble drawn");
		// TODO Auto-generated method stub
	}
	
}

class ShapeFacade {
	public void drawCircleAndRectangle(){
		new Circle().draw();
		new Rectanble().draw();
	}
}
