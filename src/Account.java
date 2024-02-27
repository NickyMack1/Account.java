class Account {
    private String name;
    private String accNumber;
    private double balance;

    // Constructors
    public Account(String name, String accNumber) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = 0.0; // Assuming initial balance of zero
    }

    public Account(String name, String accNumber, double balance) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Mutator methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

class Transactions {
    public static void main(String[] args) {
        Account acc1 = new Account("John Doe", "123456");
        Account acc2 = new Account("Jane Smith", "654321", 1000.0);

        System.out.println("Initial balances:");
        System.out.println(acc1.getName() + "'s balance: $" + acc1.getBalance());
        System.out.println(acc2.getName() + "'s balance: $" + acc2.getBalance());

        // Perform transactions
        acc1.deposit(500);
        acc2.withdraw(200);

        System.out.println("\nAfter transactions:");
        System.out.println(acc1.getName() + "'s balance: $" + acc1.getBalance());
        System.out.println(acc2.getName() + "'s balance: $" + acc2.getBalance());
    }
}
