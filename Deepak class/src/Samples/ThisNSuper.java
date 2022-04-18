package Samples;

public class ThisNSuper {
	
	//Default constructor
	 ThisNSuper()
	{
		 this(20,21,22);
		System.out.println("This is default constructor in parent");
	}
	 //1 parameter constuctor
	 ThisNSuper(int a)
	 
		{
		   this();
			System.out.println("This is 1 param constructor in parent");
		}
	 //2 parameter constuctor
	 ThisNSuper(int a, int b)
	 	{
		 this(10);
			System.out.println("This is 2 param constructor in parent");
		}
	 // 3 parameters constructor
	 ThisNSuper(int a, int b, int c)
		{
		 
			System.out.println("This is 3 param constructor in parent");
		}
	
public static void main(String[] args) {
	ThisNSuper TS=new ThisNSuper(1,2);
		
}
}
