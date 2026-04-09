
import java.util.*;

class Student implements Comparable<Student>
{

	int id;
	String name;

	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public int compareTo(Student s)
	{

		return this.id-s.id;
	}

		
}

class NameComparator implements Comparator<Student>
{

	public int compare(Student s1,Student s2)
	{

		return s1.name.compareTo(s2.name);
	}

}


class CompDemo{

	public static void main(String[] args){
	
		ArrayList<Student> list=new ArrayList<Student>();

		list.add(new Student(2,"dinesh"));
		list.add(new Student(3,"ram"));
		list.add(new Student(1,"janu"));

		Collections.sort(list);

		System.out.println("sorted by id - comaparable");

		for(Student s:list)
		{

			System.out.println(s.id +" "+ s.name);
		}

		Collections.sort(list,new NameComparator());

		System.out.println("sorted by name -comparator");

		for(Student s:list)

		{

			System.out.println(s.id +" " + s.name);
		}
	}

}