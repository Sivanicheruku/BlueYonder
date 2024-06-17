class A
{
	A()
	{
		System.out.println("hii A default cont");
	}
	A(int a)
	{
		System.out.println("hii A constr with 1 parm");
	}
	A(int a,String name)
	{
		System.out.println("hii A constr with 2 parm");
	}
}
class Demo6
{
	public static void main(String args[])
	{
		A a = new A();
		A a1 = new A(100);
		A a2 = new A(100,"shiv");
	}
}
//same const name + diff parm + multiple times in same class = const over loading....!