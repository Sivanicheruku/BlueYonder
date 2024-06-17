class A
{
	A()
	{
		System.out.println("Hii A class");
	}
	void abc()
	{
		System.out.println("Hii Abc method");
	}
}
class B
{
	B()
	{
		System.out.println("Hii B class");
	}
	void abc()
	{
		System.out.println("Hii B abc method");
	}
}
public class Demo1
{
	public static void main(String[] args)
	{
		System.out.println("hii BY");
		A a = new A();
		B b = new B();
		a.abc();
		b.abc();
	}
}