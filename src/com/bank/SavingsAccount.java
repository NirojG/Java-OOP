package com.bank;

/**
 * Class demonstrating INHERITANCE (extends Account) 
 * and POLYMORPHISM (overriding the withdraw method).
 */
public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance); // Call the parent's constructor
        this.interestRate = interestRate;
    }

    // Polymorphism: We define the specific withdrawal logic for a Savings Account
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: €" + amount + " | Remaining: €" + balance);
            return true;
        }
        System.out.println("Withdrawal failed: Insufficient funds.");
        return false;
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest applied at " + interestRate + "%");
    }
}
