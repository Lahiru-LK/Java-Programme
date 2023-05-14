public class Circle
{
	private double radius = 1.0;
	private String color = "Red ";

	
	public Circle()
	{
		System.out.println("\nCircle calclulated");	
	}
	public Circle(double radius)
	{
		this.radius = radius;
		System.out.println("\nCircle radius : "+radius);	
	}
	
	public Circle(double radius, String color)
	{
		
		this.radius = radius;
		this.color = color;
		
		System.out.println("\nCircle radius : "+radius);	
		System.out.println("Circle color :"+color);	

		
	}
//getter
	
	public double getRadius()
	{
		System.out.println("\ngetter method Double: ");
		return radius;
	}

//setter
	public void setRadius(double radius)
	{
		this.radius=radius;
		System.out.println("\nCircle setter radius : "+radius);	
	}
//getter	
	public String getColor()
	{
		System.out.println("\ngetter method String : ");
		return color;
	}
//setter
	public void setColor(String color)
	{
		this.color=color;
		System.out.println("\nCircle setter color : "+color);	
			
	}
//geting tostring
	public String toString()
	{
		return color;
		
	}
//geting tostring
	public void tostin()
	{
		System.out.println("\nCircle tostring getter color : "+this);	
	}


/*
	public getArea(double radius)
	{
		
	}*/

  
}
