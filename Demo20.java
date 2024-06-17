class Demo20 
{
 
	public static void main(String[] args) 
	{
		Car a = new Car();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		Thread t3 = new Thread(a);
		t1.start();                                                                   
		t2.start();
		t3.start();
		t1.setName("Rama");
		t2.setName("Seetha");
		t2.setName("Ravana");
		t1.setPriority(10);
		t1.setPriority(8);
		t1.setPriority(4);
	}
}
class Car implements Runnable
{
		public synchronized void run()
		{
			for(int i=0; i<5; i++)
			{
				try
				{
					if(Thread.currentThread().getName().equals("Rama"))
					{
						System.out.println("    " 	+Thread.currentThread().getName()+":"+i);
					}
					if(Thread.currentThread().getName().equals("Seetha"))
					{
						System.out.println(Thread.currentThread().getName()+":"+i);
					}
					if(Thread.currentThread().getName().equals("Ravana"))
					{
						System.out.println(Thread.currentThread().getName()+":"+i);
					}
					Thread.sleep(1000);
				}
				catch(Exception e) {}
			}
		}
 
	
 
}