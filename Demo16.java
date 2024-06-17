import java.util.*;
import java.io.*;
import java.sql.*;
class A
{
	void display() throws FileNotFoundException,SQLException, InvalidAge,NumberFormatException
	{
		for(int i=1;i<=20;i++) 
		{
	
			System.out.println("I :"+i);
			if(i==15) throw new InputMismatchException();
			if(i==14) throw  new ArrayIndexOutOfBoundsException();
			if(i==12) throw new NumberFormatException();
			if(i==10) throw new FileNotFoundException();
			if(i==8) throw new ArrayStoreException();
			if(i==5) throw new SQLException();
			if(i==2) throw new InvalidAge();
		}
	
	}
}
class Demo17
{
	public static void main(String args[])
	{
		try
		{
			A a = new A();
			a.display();
			try
			{
			}
			catch(Exception ee){}
		}
		catch(InputMismatchException ims)
		{
			try
			{
			}
			catch(Exception ee){}
			System.out.println("IM E raised ....!");
		}
		catch(ArrayIndexOutOfBoundsException aio)
		{
			System.out.println(" ArrayIndexOutOfBoundsException raised ....!");

		}
		catch(NumberFormatException ng)
		{
			System.out.println(" NumberFormatException raised ....!");
	
		}
		
		catch(SQLException nfe)
		{
			System.out.println(" SQLException raised ....!");
	
		}
		
		catch(InvalidAge iva)
		{
			System.out.println(" InvalidAge raised ....!");
	
		}

		catch(ArrayStoreException neg)
		{
			try
			{
			}
			finally
			{}
			System.out.println(" ArrayStoreException raised ....!");
	
		}

		catch(FileNotFoundException fng)
		{
			System.out.println(" FileNotFoundException raised ....!");
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally 
		{	
			try
			{
			}
			catch(Exception ee){}

			System.out.println("Thank you");
		}
			
	}
}

class InvalidAge  extends Exception
{
	
	InvalidAge()
	{
	}
}