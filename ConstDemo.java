import java.util.*;
	class Const{

	int id;
	String name;
	String college;


	Const()
	{
		id=0;
		name="unknown";
		
	}
	
	Const(int id,String name, String college)
	{

		this.id=id;
		this.name=name;
		this.college=college;
		
	}

}


class ConstDemo{

	public static void main(String[] args){

		Const obj=new Const();
		Const obj1=new Const();
		Const obj2=new Const(101,"dinesh","aditya University");


		System.out.println("ID :"+ obj1.id  +"\n" + "Name :"+obj1.name);
		System.out.println("ID :"+ obj2.id+"\n"+ "Name :" + obj2.name +"\n" + "College : " +obj2.college);
	
	}

}
