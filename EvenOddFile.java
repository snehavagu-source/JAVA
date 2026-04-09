import java.io.*;
import java.util.*;

class EvenOddFile{
    public static void main(String [] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        FileWriter fileeven = new FileWriter("Even.txt");
        FileWriter fileodd = new FileWriter("Odd.txt");
        for(int i=1; i<=n; i++)
        {
            if(i%2==0)
            {
                fileeven.write(i + "\n");
            }
            else
            {
                fileodd.write(i + "\n");
            }
        }
        fileeven.close();
        fileodd.close();
    }
}