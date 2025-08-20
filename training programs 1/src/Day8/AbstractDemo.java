package Day8 ;

public class AbstractDemo {

	public static void main(String[] args) {
		
		
		Square s = new Square();
		Rectangle r = new Rectangle();
		
		s.calArea();
		s.show();
		r.calArea();
		r.show();
		
		System.out.println("------------------------------------------------");
		//Runtime Polymorphism / Dynamic binding / late binding
		//Ex: Method Overriding
		
		Shape shape;
		shape=new Square(4.5f);
		
		shape.calArea(); // invoked Square class calArea()
		shape.show();
		
		shape=new Rectangle(67,12);
		
		shape.calArea(); // invoked Rectangle class calArea()
		shape.show();
	}

}
