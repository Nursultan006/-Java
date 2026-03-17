public class BankAccountMain {

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("KZ123", 1000, 5);
        CreditAccount credit = new CreditAccount("KZ999", 500, 2000);

        // Сберегательный счет
        savings.displayInfo();
        savings.deposit(500);
        savings.addInterest();
        savings.withdraw(300);
        savings.displayInfo();

        System.out.println("----------------------");

        // Кредитный счет
        credit.displayInfo();
        credit.withdraw(1000);
        credit.deposit(200);
        credit.displayInfo();
    }
}

// Базовый класс
class BankAccount {

    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayInfo() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

// Сберегательный счет
class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Interest rate: " + interestRate + "%");
    }
}

// Кредитный счет
class CreditAccount extends BankAccount {

    double creditLimit;

    CreditAccount(String accountNumber, double balance, double creditLimit) {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    void withdraw(double amount) {
        if (balance + creditLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn (credit): " + amount);
        } else {
            System.out.println("Credit limit exceeded!");
        }
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Credit limit: " + creditLimit);
    }
}