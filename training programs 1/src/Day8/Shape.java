package Day8;

public abstract class Shape {
	protected float area;
	
	//abstract method
	
	abstract void calArea();
	
	//concrete method
	
	void show() {
		System.out.println("Area of the Shape is "+area);
	}
}
