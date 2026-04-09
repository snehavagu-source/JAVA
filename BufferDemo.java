import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;  
import java.io.IOException;

class BufferDemo {
    public static void main(String[] args) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter("demo.txt"));
        bw.write("Hello, this is a demo of BufferedWriter.");
        bw.close();
        System.out.println("Data written to file successfully.");

        BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
        String line;    
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}