class Bank
{
	public int roi()
	{
		return 7;
	}
}
class SBI extends Bank
{
}
class Axis extends Bank
{
	public int roi()
	{
		return 10;
	}
}
class Demo8
{
	public static void main(String args[])
	{
		SBI s = new SBI();
		System.out.println(s.roi());
		Axis a = new Axis();
		System.out.println(a.roi());
	}
}