import java.util.*;

	class Animal{

		void sound()
		{	

			System.out.println("Sounds something");
		}

}

	class Dog extends Animal{


		void bark()
		{
			System.out.println("Dog sounds bow");
			
		}
}

	class Cat extends Dog{

		void meow()
		{

			System.out.println("cat sounds meow");
		}
}



class HeriDemo{

	public static void main(String[] arg){


		Cat obj=new Cat();
		obj.sound();
		obj.bark();
		obj.meow();

}




}

