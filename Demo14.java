import java.util.*;
class Demo14{

	public static void main(String args[]){
		m1();
	}
	static void m1()
	{
		m2();
		System.out.println("hii M1........! ");
	}
	static void m2()
	{
		m3();
		System.out.println("hii m2........! ");
	}
	static void m3()
	{
		try
		{
			System.out.println("Hi m3 ..........!");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter A value:");
			int a = sc.nextInt();
			System.out.println("Enter B value :");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("Result: "+c);
		}
		catch(InputMismatchException imp)
		{
			System.out.println("please enter only numbers...!"+imp);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("we can't divide by anything by 0...!"+ae);
		}

	}
}
			

			

	
	