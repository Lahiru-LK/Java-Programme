import java.util.Scanner;

public class Circle 
{ 
	private double area, radius;
	private Scanner input;
	
	//Initilizing values
	{
		input = new Scanner(System.in);
		System.out.println("You have selected the Shape Circle\n");
		System.out.print("Please enter value for the radius : ");
		radius = input.nextDouble();	
	}

	//Setter
	//public void setRadius(double radius){
	//	this.radius = radius;
	//}

	//Getter
	//public double getRadius(){
	//	return radius;
	//}


	//Calculate area
	public void calculateArea(){			//make private and check
		area = (22 * radius * radius) / 7;
	}

	//Print area
	public void printArea(){
		System.out.println("The area of the Circle is : " + area);
	}
	
}