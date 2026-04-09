import java.util.*;
	

	interface Father{

		void property();
}

	interface Mother{

		void cooking();
}

class Child implements Father,Mother{


		public void property()
		{
			System.out.println("child gains property from his father");
		}

		public void cooking()
		{

			System.out.println("child gains cooking skills from his mother");
		}
}



class MulDemo{

	public static void main(String[] args)
	{
		Child c=new Child();

		c.property();

		c.cooking();
	}

}

