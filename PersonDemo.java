import java.util.*;

class Person{

	int id;
	String name;
	int age;
	String sport;
	String qualify;
	
	

void personaldetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your id:");
		id=sc.nextInt();
		System.out.println("enter your name:");
		name=sc.next();
		sc.nextLine();
		System.out.println("enter your age:");
		age=sc.nextInt();
	}


 void displaypersonaldetails()
	{

		System.out.println("personaldeatils:");
		System.out.println("ID :" + id);
		System.out.println("Name : " + name);
		System.out.println("Age :" + age);
		
		
	}
		
		
		
	
	
void qualifydetails()

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your sport:");
		sport=sc.next();
		System.out.println("enter your qualification:");
		qualify=sc.next();

		
	}

	void displayqualifydetails()
	{

		System.out.println("Qualification details:");
		System.out.println("sport :" + sport);
		System.out.println("qualification :" +qualify);

	}

	

}






class PersonDemo{
	
	public static void main(String[] args){
		
		Person p=new Person();
		p.personaldetails();
		p.displaypersonaldetails();
		p.qualifydetails();
		p.displayqualifydetails();


	}
	
}