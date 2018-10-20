package Prototype;

import java.util.HashMap;



public class Flyweight {
	
	
	
	public static void main(String[] args) {
		Circle c= new CircleGenerator().getCircleOfColor("red");
		c.draw();
	}
}


interface IShape {
	void draw();
}

class Circle implements IShape
{
	private String color;
	
	public Circle(String c){
		color =c;
	}
	
	@Override
	public void draw() {
		System.out.println("circle drawn color " +color);
		// TODO Auto-generated method stub
	}
}

class CircleGenerator {
	private HashMap<String, Circle> circles = new HashMap<String, Circle>();
	
	public Circle getCircleOfColor(String color){
		if(!circles.containsKey(color))
			circles.put(color, new Circle(color));

		return circles.get(color);		
	}
}

