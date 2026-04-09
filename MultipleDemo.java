import java.util.*;

class MultipleDemo{

	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	 System.out.print("Enter value of a : ");

	int a=sc.nextInt();

	System.out.print("Enter value of b : ");
	int b=sc.nextInt();

	int n=sc.nextInt();

	int arr[] =new int[n];

  	for (int i = 0; i < n; i++) 
	{
            arr[i] = sc.nextInt();
        }


	 System.out.print("Enter index to access   : ");
        int index = sc.nextInt();

	try
	{
		int div=a/b;
		System.out.println(div);

		int val=arr[index];

		System.out.println(val);
	}	

	catch(ArithmeticException e)
	{

		System.out.println("cannot divisible with zero" +e);
	}

	catch (ArrayIndexOutOfBoundsException e) 
	{
            	System.out.println("Array index is out of bounds");
        } 
	catch (Exception e) 
	{
            	System.out.println("General exception occurred");
        }

	
}

}