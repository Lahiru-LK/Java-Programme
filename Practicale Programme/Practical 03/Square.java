import java.util.Scanner;

public class Square 
{ 
	double area, length;
	Scanner input;
	
	//Initilizing values
	{
		input = new Scanner(System.in);
		System.out.println("You have selected the Shape Square\n");
		System.out.print("Please enter value for the length : ");
		length = input.nextDouble();	
		calculateArea();
		printArea();
		
	}

	//Calculate area
	public void calculateArea(){
		area = length * length;
	}

	//Print area
	public void printArea(){
		//calculateArea();
		System.out.println("The area of the Square is : " + area);
	}
	
}