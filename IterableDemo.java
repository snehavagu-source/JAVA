import java.util.*;
class MyList implements Iterable<String>{

	ArrayList<String> list=new ArrayList<>();

	void additems(String item)
	{

		list.add(item);
	}


	public Iterator<String> iterator()
	{
		return list.iterator();
		
	}
}



class IterableDemo{

	public static void main(String[] args){

	MyList obj=new MyList();

	obj.additems("cpp");
	obj.additems("java");
	obj.additems("python");

	for(String item:obj)
	{

		System.out.println(item);
	}

	
}

}