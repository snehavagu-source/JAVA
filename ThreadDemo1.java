
import java.util.*;
class GoodMorningRunnable implements Runnable{

	public void run()
	{

		try
		{
			while(true)
			{
			System.out.println("Good morning");
			Thread.sleep(1000);
		
		}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}	
			
	
	}

}

class HelloRunnable implements Runnable{

	public void run()
	{

		try
		{
			while(true){
			System.out.println("Hello");
			Thread.sleep(2000);
		}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}	
	
	
	}

}

class WelcomeRunnable implements Runnable{

	public void run()
	{

		try
		{
			while(true){
			System.out.println("Welcome");
			Thread.sleep(3000);
		}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}	
	
	
	}

}





class ThreadDemo1{

	public static void main(String[] args){
		

	GoodMorningRunnable gr=new GoodMorningRunnable();
	HelloRunnable hr=new HelloRunnable();
	WelcomeRunnable we=new WelcomeRunnable();

	Thread t1=new Thread(gr);
	Thread t2=new Thread(hr);
	Thread t3=new Thread(we);

	t1.start();
	t2.start();
	t3.start();
	

	}

}