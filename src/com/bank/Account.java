package com.bank;

/**
 * Abstract class demonstrating ENCAPSULATION and ABSTRACTION.
 * It hides private data and provides public methods to interact with it safely.
 */
public abstract class Account implements Transaction {
    // Private fields: external code cannot change these directly (Encapsulation)
    private String accountNumber;
    private String accountHolder;
    
    // Protected field: child classes can access this, but the outside world cannot
    protected double balance;

    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Getters allow safe, read-only access to our encapsulated data
    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    
    @Override
    public double getBalance() { return balance; }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: €" + amount + " | New Balance: €" + balance);
        }
    }

    // Abstract method: forces child classes to create their own specific withdrawal rules (Polymorphism)
    public abstract boolean withdraw(double amount);
}
