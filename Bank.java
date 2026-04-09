
import java.util.*;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}
class BankDemo{



	 void withdraw(int bal,int amt) throws InsufficientBalanceException
	{
		if(amt>bal)
		{	

			throw new  InsufficientBalanceException("Insufficient balance");
		}


		else
		{

			System.out.println("withdrawn successfully");
			System.out.println("remaining balance:" +(bal-amt));
		}

	}

}


class Bank{

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	
	int bal=sc.nextInt();
	int amt=sc.nextInt();
	BankDemo b=new BankDemo();
	try{

	b.withdraw(bal,amt);
	
	}
	catch(NumberFormatException e)
	{
		System.out.println(e.getMessage());
		
	}
	catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

	


}
}