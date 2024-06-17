class Parent
{
	
	
	Parent()
	{
		System.out.println("Hi Parent");
				
	}
}
class Child extends Parent
{
	
	
	Child()
	{
		System.out.println("Hi Child");
				
		
	}
}
class Demo3
{
	public static  void main(String[] args)
	{
		//Parent p = new Parent();
		Child c = new Child();
	}
}
