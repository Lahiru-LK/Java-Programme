public class Car
{
	String color; 
	int speed;
	
	//Default constructor  --> A
	Car(){
		this("Blue", 65);

		System.out.println("Default Constructor got executed...!!!");
		
	}

	//Parameterized construcor to initilize name --> B
	Car(String color){
		this(); //this call must be the first statement of the constructor

		//this("Blue", 65); --> Compile error due to multiple this callings

		System.out.println("Parameterized Constructor color got executed...!!!");
		
	}

	//Parameterized construcor to initilize all --> C
	Car(String color, int speed){

		this("red"); --> --> Compile error due to recursive constructor calling

		System.out.println("Parameterized Constructor for color and speed got executed...!!!");
	}
	
}

//Car c = new Car("red"); call B
// then B calls A
// then A calls C and compltete it
// then completes A
// then completes B
// Observe the output by alignning with lecture note
