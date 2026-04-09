
import java.io.*;
public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("demo1.txt");
       
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
