class Parent
{
	int site = 5;
	int money=100000;
	String car="Hyndai";
	
	void use()
	{
		System.out.println("Site:"+site);
		System.out.println("money :"+money);
		System.out.println("car :"+car);
		
	}
}
class Child extends Parent
{
	
	int money=50000;
	String car="BENZ";
	
	void use()
	{
		System.out.println("Site:"+site);
		System.out.println("money :"+money);
		System.out.println("car :"+car);
		System.out.println("parent car :"+super.car);

		
		
	}
}
class Demo4
{
	public static  void main(String[] args)
	{
		Parent p = new Parent();
		p.use();
		Child c = new Child();
		c.use();
	}
}


