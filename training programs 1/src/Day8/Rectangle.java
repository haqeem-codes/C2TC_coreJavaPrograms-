package Day8;

public class Rectangle extends Shape{
		
	private float width , height;
	
	public Rectangle()
	{
		this.width = 12.0f;
		this.height = 2.0f;
	}
	
	public Rectangle(float width , float height)
	{
		this.width = width;
		this.height = height;
	}
	
	
	@Override
	void calArea() {
		area = width*height;
	}
}
