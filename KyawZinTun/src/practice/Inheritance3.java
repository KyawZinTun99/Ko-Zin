package practice;
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        balance += (balance * interestRate / 100);
        System.out.println("Interest added. New balance: $" + balance);
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}

public class Inheritance3 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 5000, 5);
        CurrentAccount ca = new CurrentAccount("CA456", 2000, 1000);

        sa.deposit(1000);
        sa.addInterest();
        sa.withdraw(3000);
        sa.displayBalance();

        System.out.println();

        ca.withdraw(2500);
        ca.displayBalance();
    }
}
