package Samples;

public class ThisNSuperChild extends ThisNSuper 
{
	
	//Default constructor
	ThisNSuperChild()
	{
		this(70,80);
		System.out.println("This is default constructor in child");
	}
	 //1 parameter constuctor
	 ThisNSuperChild(int a)
	 
		{
		   this();
			System.out.println("This is 1 param constructor in child");
		}
	 //2 parameter constuctor
	 ThisNSuperChild(int a, int b)
	 	{
		super(99,100);
			System.out.println("This is 2 param constructor in child");
		}
	 // 3 parameters constructor
	 ThisNSuperChild(int a, int b, int c)
		{
		 this(20);
			System.out.println("This is 3 param constructor in child");
		}
	

}
