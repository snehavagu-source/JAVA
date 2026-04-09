class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for " + name);
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice", 1000.0);
        Customer customer2 = new Customer("Bob", 1500.0);

        customer1.deposit(500.0);
        customer2.withdraw(200.0);

        System.out.println(customer1.getName() + "'s balance: " + customer1.getBalance());
        System.out.println(customer2.getName() + "'s balance: " + customer2.getBalance());
    }
}
