abstract class Bank
{
	abstract void roi();
	abstract void ATM();
}
class Sbi extends Bank
{
	void roi()
	{
		System.out.println("10");
	}
	void ATM()
	{
		
	}

	
}
class Axis extends Bank
{
	void roi()
	{
		System.out.println("13");
	}
	void ATM()
	{
		
	}


}
public class Demo9 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	}
 
}
 