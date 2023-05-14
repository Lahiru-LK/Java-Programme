public class AnimalDemo{

    public static void main(String[]args){
		Animal a= new Animal();
		System.out.println("Animal Data");
		System.out.println("legs : " +a.noOfLegs);
		a.eat();

		Dog d= new Dog();
		System.out.println("Dog Data");
		System.out.println("legs : " +d.noOfLegs);
		d.eat();

		System.out.println(d instanceof Animal); //dog is animal
		System.out.println(a instanceof Dog);//animal is dog
		System.out.println(d instanceof Object);
 
	}
}
