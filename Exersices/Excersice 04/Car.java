public class Car extends Vehical
{	
	public String color="White";

	@Override
	public void start()
	{
		System.out.println("Car is Starting....");
		super.start();
	}
	
	public void drive()
	{
		System.out.println("Driving....");
	}
	
	//@Override
	public static void printTopSpeed()
	{
		System.out.println("Vehicle top speed is 150");
	}
	
	public void printColor()
	{
		color="Red";
		System.out.println("Car color :"+color);//this color
		System.out.println("Vehicale color :"+super.color);
	}
  

    
}
