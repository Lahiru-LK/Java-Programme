public class Car{
	String color;
	int speed;
	
	Car(){
		this("Blue" ,65);
		System.out.println("Default contruction got  executed..!!");
	
	}
	
	Car(String color){
		
		this();
		System.out.println("Paramiter contdwadas colur got excuted");
		
	}
	Car(String color,int speed){
		this("red");
		System.out.println("Paramiter contdwadas colur and speed got excuted");
	}
} 