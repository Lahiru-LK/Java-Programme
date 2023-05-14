public class Employee{
	String name="Lahiru";
	int age;
	char gender='m';
	
	Employee(){
		System.out.println("Defualt Contruction got excecuted...!!!");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
	}
	Employee(String n){
		System.out.println("Paramiterzed concnstucter excuteed");
		name=n;
		System.out.println(name);
		
	}

	Employee(String n, int a,char G){
		System.out.println("3 paramiter");
		name=n;
		age=a;
		gender=G;
		System.out.println(name+"\n"+age+"\n"+gender+"\n");
		
	}
}