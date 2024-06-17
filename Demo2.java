import java.util.Scanner;
class Dev
{
	int id,age;
	float salary=50000;
	String name, desig="Developer";
	Dev()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter Id");
		id=sc.nextInt();
		System.out.println("Enter age");
		age=sc.nextInt();
		
	}
	void display()
	{
		System.out.println("my Name is :"+name);
		System.out.println("my Id is :"+id);
		System.out.println("my age is :"+age);
		System.out.println("my salary is :"+salary);
		System.out.println("my desig is :"+desig);
	}
}
class Tester
{
	int id,age;
	float salary=30000;
	String name, desig="Tester";
	Tester()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter Id");
		id=sc.nextInt();
		System.out.println("Enter age");
		age=sc.nextInt();
		
	}
	void display()
	{
		System.out.println("my Name is :"+name);
		System.out.println("my Id is :"+id);
		System.out.println("my age is :"+age);
		System.out.println("my salary is :"+salary);
		System.out.println("my desig is :"+desig);
	}
}

class clerk
{
	int id,age;
	float salary=20000;
	String name, desig="clerk";
	clerk()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter Id");
		id=sc.nextInt();
		System.out.println("Enter age");
		age=sc.nextInt();
		
	}
	void display()
	{
		System.out.println("my Name is :"+name);
		System.out.println("my Id is :"+id);
		System.out.println("my age is :"+age);
		System.out.println("my salary is :"+salary);
		System.out.println("my desig is :"+desig);
	}
}

class manager
{
	int id,age;
	float salary=80000;
	String name, desig="manager";
	manager()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter Id");
		id=sc.nextInt();
		System.out.println("Enter age");
		age=sc.nextInt();
		
	}
	void display()
	{
		System.out.println("my Name is :"+name);
		System.out.println("my Id is :"+id);
		System.out.println("my age is :"+age);
		System.out.println("my salary is :"+salary);
		System.out.println("my desig is :"+desig);
	}
}


class Demo2
{
	public static void main(String[] args)
	{
		System.out.println("=========Developer========");
		Dev a = new Dev();
		a.display();
		System.out.println("=========Tester========");
		Tester b = new Tester();
		b.display();
		System.out.println("=========Clerk========");
		clerk c = new clerk();
		c.display();
		System.out.println("=========Manager========");
		manager d = new manager();
		d.display();
	}
}




		