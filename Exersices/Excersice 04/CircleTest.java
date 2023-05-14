public class CircleTest
{
	public static void main(String []args)
	{	double x;
		String y;
	
		Circle c = new Circle();
		Circle c2 = new Circle(11.99);
		Circle c3 = new Circle(21.30,"YELLOW");
		
	      x=c.getRadius();
		System.out.println(x);
		
		c.setRadius(99.90);
		
		y=c.getColor();
		System.out.println(y);

		//c.setColor("PINK");

		c.tostin();
		
	} 
	
}

