
public class Rectangle
{
	private double length;//keeping these variables private to the Rectangle class
	private double width;//kept private until access is granted via the setters/getters to change access
	
	public Rectangle(double l, double w) //constructor called when width and length given
	{
		length = l;
		width = w;
	}
	
	public Rectangle() //constructor called when width and length are not given, setting field values to 0
	{
		length = 0;
		width = 0;
	}
		
	public double getLength() //get/return the length of the current Rectangle object
	{
		return this.length;
	}
	
	public void setLength(double l) //set the length of the current Rectangle object
	{
		this.length = l;
	}
	
	public double getWidth() //get/return the width of the current Rectangle object
	{
		return width;
	}
	
	public void setWidth(double w) //set the width of the current Rectangle object
	{
		this.width = w;
	}
	
	public double computeArea() //lastly compute the area of the current Rectangle Object that is calling upon this method, without using any parameters
	{
		double area = this.length * this.width;
		return area;
	}
}
	
