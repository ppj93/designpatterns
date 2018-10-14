package abstractFactory;

public class AbstractFactory {
	
	
	
	public static void main(String[] args) {
		FactoryCreator f= new FactoryCreator();
		BaseFactory<Color> sx = f.getFactory("color");
		Color c = (Color)sx.getEntity("red");
		System.out.println(c.getFValue());
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

class ShapeFactory extends BaseFactory<Shape> {
	Shape getEntity(Object ...objects) {
		if(objects[0].toString() == "rectangle") return new Rectangle();
		if(objects[0].toString() == "circle") return new Circle();
		return null;
	}
}


abstract class Color{
	abstract double getFValue();
}

class Red extends Color {
	double getFValue(){
		return 12;
	}
}


class Black extends Color {
	double getFValue(){
		return 100;
	}	
}


class ColorFactory extends BaseFactory<Color> {
	
	Color getEntity(Object ...objects) {
		if(objects[0].toString() == "red") return new Red();
		if(objects[0].toString() == "black") return new Black();
		return null;
	}

}

abstract class BaseFactory<T> {
	abstract T getEntity(Object ...objects);
}

class FactoryCreator {
	BaseFactory getFactory(String name){
		if(name == "color") return new ColorFactory();
		if(name == "shape") return new ShapeFactory();
		return null;
	}
}