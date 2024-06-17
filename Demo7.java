class A
{
	void abc()
	{
		System.out.println("hii A default cont");
	}
	void abc(int a)
	{
		System.out.println("hii A constr with 1 parm");
	}
	void abc(int a,String name)
	{
		System.out.println("hii A constr with 2 parm");
	}
}
class Demo7
{
	public static void main(String args[])
	{
		A a = new A();
		a.abc();
		a.abc(100);
		a.abc(100,"rama");
		
	}
}
