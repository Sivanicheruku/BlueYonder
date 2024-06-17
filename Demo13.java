class A 
{
	private String name;
	private int id;
	void setId(int id)
	{
		this.id =id;
	}
	
	void setName(String name)
	{
		this.name =name;
	}
	String  getName()
	{
		return name;
	}
	int getId()
	{
		return id;
	}

}
class Demo13
{
	public static void main(String args[])
	{
		A a =new A();
		a.setName("RAMA");
		a.setId(100);
		System.out.println("Id: "+a.getId());
		System.out.println("name: "+a.getName());
	}

}
 

 
		

