import java.util.Scanner;

interface Company
{
	void cab();
}
abstract class Emp
{
	
	int age,id;
	String name;
	float salary;
	String desig;

	static String collage = "Bhyashyam";
	Emp()
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
	abstract void incrementSalary();
}

		 
final class Dev extends Emp implements Company
{	

	Dev()
	{
	 	  salary=50000;
		  desig="Developer";
	}
	public void cab()
	{
		System.out.println("i am using cab");
	}
		
	
	void incrementSalary() {
        salary += salary * 0.50; 
   }


}
final class Tester extends Emp
{
	Tester()
	{
		salary=30000;
		desig="Tester";
	}
	
	
	void incrementSalary() 
	{
        salary += salary * 0.40; 
   	 }


}

final class Clerk extends Emp
{
	Clerk()
	{
	 	salary=20000;
	
		desig="clerk";
	}


	
	void incrementSalary() {
        salary += salary * 0.20; 
    }


}

final class manager extends Emp
{
	manager()
	{
		salary=80000;
		desig="manager";
	}
	

	void incrementSalary() {
        salary += salary * 0.60; 
    }



	
}


class Demo5
{	
	
	public static void main(String[] args)
	{
		int  ch1,ch2=0;Clerk c=null; 
		Dev d = null;Tester t =null;manager m =null;
		float salary;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Emp.collage);
		do{

			System.out.println("1 ) CREATE ");
			System.out.println("2 ) DISPLAY ");
			System.out.println("3 ) Salary Inc ");
			System.out.println("4 ) EXIT ");
			ch1 =sc.nextInt();
			if(ch1==1)
			{
				do{
					System.out.println("1 ) Clerk ");
					System.out.println("2 ) Developer ");
					System.out.println("3 ) Tester ");
					System.out.println("4) Manager ");
					System.out.println("5 ) EXIT ");
					ch2=sc.nextInt();
					if(ch2==1)
					{
						c = new Clerk();
						
					}
					if(ch2==2)
					{
						d = new Dev();
						
					}
					if(ch2==3)
					{
						t = new Tester();
						
					}
					if(ch2==4)
					{
						m = new manager();
					}
					if(ch2==5)
					{
						System.out.println("Exit");
					}
			
						
				}while(ch2<=4);
			}
			if(ch1==2)
			{
				do{
					System.out.println("1 ) Clerk ");
					System.out.println("2 ) Developer ");
					System.out.println("3 ) Tester ");
					System.out.println("4) Manager ");
					System.out.println("5 ) EXIT ");
					ch2=sc.nextInt();
					  if (ch2 == 1 && c != null) {
                       				 c.display();
                   			 } else if (ch2 == 2 && d != null) {
                       				 d.display();
						 d.cab();
                  			 } else if (ch2 == 3 && t != null) {
                       				 t.display();
                   			 } else if (ch2 == 4 && m != null) {
                       				 m.display();
                  			 }
					
               			 } while (ch2 <= 4);
           		 }
			
			if(ch1==3)
			{
				do{
					System.out.println("1 ) Clerk ");
					System.out.println("2 ) Developer ");
					System.out.println("3 ) Tester ");
					System.out.println("4) Manager ");
					System.out.println("5 ) EXIT ");
					ch2=sc.nextInt();
					
					if(ch2==1)
					{
						 c.incrementSalary();
                       				 System.out.println("Clerk's new salary: " + c.salary);
					}
					if(ch2==2)
					{
						 d.incrementSalary();
                       				 System.out.println("Dev new salary: " + d.salary);
						
					}
					if(ch2==3 )
					{
						 d.incrementSalary();
                       				 System.out.println("Tester new salary: " + t.salary);
						
					}
					if(ch2==4)
					{
						 d.incrementSalary();
                       				 System.out.println("manager new salary: " + m.salary);
						
					}



				}while(ch2<=5);
			}

			
		if(ch1==4)
		{
			System.out.println("Thank You");
			System.exit(0);
		}
	}while(ch1<=3);

	}
}


