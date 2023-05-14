public class Employee
{
	String name; 
	int age;
	char gender = 'M';
	
	//Default constructor
	Employee(){
		System.out.println("Default Constructor got executed...!!!");
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
		System.out.println("Gender : "+ gender);
	}

	//Parameterized construcor to initilize name
	Employee(String n){
		System.out.println("Parameterized Constructor name got executed...!!!");
		name = n;
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
		System.out.println("Gender : "+ gender);
	}

	//Parameterized construcor to initilize all
	Employee(String n, int a, char g){
		System.out.println("Parameterized Constructor all got executed...!!!");
		name = n;
		age = a;
		gender = g;
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
		System.out.println("Gender : "+ gender);
	}
	
}
