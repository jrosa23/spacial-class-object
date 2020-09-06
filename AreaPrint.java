
public class AreaPrint
{
	public static void main(String args[])
	{
		//created new objects of class Circle and Rectangle, with values to calculate
		//new objects are denoted as rectangle1/rectangle2 and circle1/circle2
		//class exists outside of AreaPrint
		//needed to create objects in order to properly pass through the values into the class template and retrieve the values
		
		Rectangle rec1 = new Rectangle(4,5);//rec1 is the object created using class Rectangle, and passing through the values 4 and 5
		
		Rectangle rec2 = new Rectangle(5.7,8.1);//these objects call upon the setters and getters for the values passed through
		
		Circle cir1 = new Circle(3.2);//actual values are created when the object is instantiated
		
		Circle cir2 = new Circle(4);//cir1 is the object created using class Circle, passing through the value 3.2
	
		//down here is where we print out the results from the calcualtions from our newly created objects from the original class templates
		//which holds the initial value, the null value, and the inputted value
	
		System.out.println("Rectangle with sides " + rec1.getLength() + " and " + rec1.getWidth()+ " has area " +rec1.computeArea());
		//now print out a the text with while calling for the values from the respectiver classes, using the values from the objects created
		//rec1 length of 4 and width of 5, then pushed through the computeArea method to get the area of 20 and return it
		System.out.println("Rectangle with sides " + rec2.getLength() + " and " + rec2.getWidth()+ " has area " +rec2.computeArea());
		System.out.println("Circle with radius " + cir1.getRadius() + " has area " + cir1.computeArea());
		System.out.println("Circle with radius " + cir2.getRadius() + " has area " + cir2.computeArea());
		return;
	}
}
