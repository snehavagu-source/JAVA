import java.util.*;

abstract class Shape{
	abstract void area();
}

class Rectangle extends Shape{
	int l,b;
	
	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void area()
	{

		System.out.println("Rectangle: "+ (l*b));
	}
}

 class Square extends Shape{
	int s;

	Square(int s)
	{
		this.s=s;
	}

	 public void area()
	{

		System.out.println("square:" + (s*s));
	}
}



class AbsDemo{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.println("enter l and b values:");

		int l=sc.nextInt();
		int b=sc.nextInt();

		Rectangle r=new Rectangle(l,b);
		r.area();
		System.out.println("enter s value:");

		int s=sc.nextInt();
	

		Square e=new Square(s);
		e.area();
	}

}