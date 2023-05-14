import java.util.Scanner;

public class ShapeDemo  
{    
	public static void main(String args[])   
	{    
		Scanner input = new Scanner(System.in);
		int uInput;
		double radius, cArea,  length, sArea;	
		
		do
        	{
		
			System.out.println("Please enter the number of the shape that you wish to calculate the area");
         		System.out.print(" 1.Circle \n 2.Square  \n 0.Exit \n\n\n Enter your answer : ");
		
			uInput = input.nextInt();

			switch(uInput)
        		{
            		case 1:
					Circle c = new Circle();
					//System.out.println(c.area); ---> Compile error
					c.calculateArea();
					c.printArea();
					break;

				case 2:
					Square s = new Square();
					//s.calculateArea();
					//s.printArea();					
					break;

				case 0:
					System.out.println("Exiting...");
					System.exit(0);
               			break;

				default:
					System.out.println("You haven't select any shape, Exiting...");
	              		break;	
			}
		 } while(uInput != 0);	
	}
}