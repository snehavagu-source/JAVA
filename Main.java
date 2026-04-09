import java.util.*;

class Producer extends Thread{

	BoxDemo b;

	Producer(BoxDemo b)
	{

		this.b=b;
	}
	public void run()
	{

		for(int i=0;i<=5;i++)

		{
			b.producer(i);
	}	}
	

}


class Consumer extends Thread{
	BoxDemo b;
	Consumer(BoxDemo b)
	{

		this.b=b;
	}

	public void run()
	{

		for(int i=0;i<=5;i++)
		{
			b.consumer();
			
		}
	}

}

class BoxDemo{

	int value;
	boolean available =false;

		synchronized void producer(int val)
		{
			if(available)
			{

				try{
				wait();

				}catch(Exception e)
				{
					System.out.println(e);
				}
			}

			value=val;
			System.out.println("producer : " +val);

			available =true;
			notify();
			
		}

		synchronized void consumer()
		{

			if(!available)
			{

				try
				{

					wait();
				}
				catch(Exception e)
				{

					System.out.println(e);
				}
			}

			System.out.println("consumer : " +value);
			available=false;
			notify();
		}
		
	}





class Main{

	public static void main(String[] args)
	{

		BoxDemo b=new BoxDemo();

		Producer p=new Producer(b);
		Consumer c=new Consumer(b);

		p.start();
		c.start();
	}


}
