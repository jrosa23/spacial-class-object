
public class Circle
{
	private double radius; //keeping the variable private to this class, until access is granted
	
	public Circle() //constructor called when no radius is provided
	{
		this.radius = 0;
	}

	public Circle(double r) //constructor called when radius is provided
	{
		this.radius = r;
	}
	
	public double getRadius() //return the radius of the current Circle object taht is calling upon this method
	{
		return this.radius;
	}
	
	public void setRadius(double r) //set the radius of the current Circle Object calling upon this method, this is the setter that accepts radius as a parameter
	{
		this.radius = r;
	}
	
	public double computeArea() //finally compute the area of the Circle object calling upon this method, this is a METHOD with no parameters and returns the area
	{
		double area = (this.radius * this.radius) * Math.PI;
		return area;
	}
}
