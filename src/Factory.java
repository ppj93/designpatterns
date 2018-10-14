
public class Factory {
	
	
	
	public static void main(String[] args) {
		Shape s =  new ShapeFactory().getShape("circle");
	}
}


abstract class Shape{
	abstract double getArea();
}

class Circle extends Shape {
	double getArea(){
		return 1;
	}
}


class Rectangle extends Shape {
	double getArea(){
		return 1;
	}	
}

class ShapeFactory {
	Shape getShape(String shape) {
		if(shape == "circle") return new Circle();
		if(shape == "rectangle") return new Rectangle();
		return null;
	}
}