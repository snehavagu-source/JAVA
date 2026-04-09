
import java.util.*;


	class Shape{

		void area(int a)
		{

			System.out.println("square" + (a*a));
		}

		void area(int l,int b)
		{

			System.out.println("Rectangle :" + (l*b));
		}
}

class MethDemo{


	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		Shape s=new Shape();

		System.out.println("Area of square: " );
		int a=sc.nextInt();
		s.area(a);

		System.out.println("Area of Rectangle: " );
		int l=sc.nextInt();
		int b=sc.nextInt();
		s.area(l,b);

		

		
}

}