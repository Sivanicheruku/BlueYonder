class A5 extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			try
			{
				System.out.println("I: "+i);
				Thread.sleep(1000);
			}
			catch(Exception e) {
		}
	}
}
}
class B5 extends Thread
{
	public void run()
	{
		for(int j=0; j<10; j++)
		{
			try
			{
				System.out.println("J: "+j);
				Thread.sleep(1000);
			}
			catch(Exception e) {
		}
	}
}
}
class C5 extends Thread
{
	public void run()
	{
		for(int k=0; k<10; k++)
		{
			try
			{
				System.out.println("K: "+k);
				Thread.sleep(1000);
			}
			catch(Exception e) {
		}
	}
}
}
class Demo17 {
 
	public static void main(String[] args) {
		A5 a = new A5();
		a.start();
		B5 b = new B5();
		b.start();
		C5 c = new C5();
		c.start();
	}
}
 