
class Table{
        synchronized void printTable(int n)
        {
            for(int i=1;i<=10;i++)
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(n+ "*" + i + "=" + n*i);
            }
        }
}

class Thread1 extends Thread{
    Table t;
    Thread1(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(5);
    }


}
class Thread2 extends Thread{
    Table t;
    Thread2(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(10);
    }
}
class Thread3 extends Thread{
    Table t;
    Thread3(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(15);
    }


}

public class Synchro {
    public static void main(String[] args) 
    {
        Table t = new Table();

        Thread1 t1 = new Thread1(t);
        Thread2 t2 = new Thread2(t);
        Thread3 t3 = new Thread3(t);

        t1.start();
        t2.start();
        t3.start();
    }
}
