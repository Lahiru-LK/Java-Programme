public class B extends A
{	

	B()
	{
		
		System.out.println("Inside B\'s Default Constructer");
	}	
	

	B(String s)
	{	
		super(s);
		System.out.println("Inside B\'s Parametar Constructer");
		System.out.println(s);
	}	 
	
	
	public final void test()
	{
		System.out.println("Use 'final 'xxx");
		
	}	
  
    
}
