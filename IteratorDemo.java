
import java.util.*;
class IteratorDemo{


	public static void main(String[] args){


		ArrayList<String> list=new ArrayList<>();

		list.add("java");
		list.add("python");
		list.add("cpp");

		Iterator<String> item=list.iterator();

		while(item.hasNext())
		{

			System.out.println(item.next());
		}
}
}