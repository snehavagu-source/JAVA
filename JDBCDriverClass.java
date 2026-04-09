import java.util.Scanner;

class JDBCDriverClass
{
    public static void main(String[] args)
    {
        JDBCOperations obj = new JDBCOperations();
        Scanner sc = new Scanner(System.in);

        int choice, res;

        do
        {
            System.out.println("\n===== CRUD MENU =====");
            System.out.println("1. Create Table");
            System.out.println("2. Insert Data");
            System.out.println("3. Update Data");
            System.out.println("4. Delete Data");
            System.out.println("5. Display Data");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    res = obj.CreateTableInDB(
                        "CREATE TABLE IF NOT EXISTS studinfo3(" +
                        "sid INT PRIMARY KEY, " +
                        "sname VARCHAR(20), " +
                        "course VARCHAR(20))"
                    );
                    System.out.println("Table Created!");
                    break;

                case 2:
                    res = obj.insertDataToDB(
                        "INSERT INTO studinfo3 VALUES(1,'Dinesh','B.Tech')"
                    );
                    if(res > 0)
                        System.out.println(" Inserted Successfully!");
                    else
                        System.out.println("Insert Failed");
                    break;

                case 3:
                    res = obj.updateDataInDB(
                        "UPDATE studinfo3 SET sname='Ravi' WHERE sid=1"
                    );
                    if(res > 0)
                        System.out.println(" Updated Successfully!");
                    else
                        System.out.println("Update Failed");
                    break;

                case 4:
                    res = obj.deleteDataFromDB(
                        "DELETE FROM studinfo3 WHERE sid=1"
                    );
                    if(res > 0)
                        System.out.println(" Deleted Successfully!");
                    else
                        System.out.println(" Delete Failed");
                    break;

                case 5:
                    obj.displayData("SELECT * FROM studinfo3");
                    break;

                case 6:
                    System.out.println(" Exiting...");
                    break;

                default:
                    System.out.println(" Invalid choice");
            }

        } while(choice != 6);

        sc.close();
    }
}