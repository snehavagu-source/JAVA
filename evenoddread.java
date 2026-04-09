import java.io.*;
import java.util.*;

class evenoddread{
    public static void main(String [] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        FileWriter fileeven = new FileWriter("Even.txt");
        FileWriter fileodd = new FileWriter("Odd.txt");
        for(int i=1; i<=n; i++)
        {
            int num = sc.nextInt();
            if(num%2==0)
            {
                fileeven.write(num + "\n");
            }
            else
            {
                fileodd.write(num + "\n");
            }
        }
        fileeven.flush();
        fileeven.close();
        fileodd.flush();
        fileodd.close();
    }
}