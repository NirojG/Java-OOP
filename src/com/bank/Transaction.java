package com.bank;

/**
 * Interface demonstrating ABSTRACTION.
 * We define WHAT a transaction should do, without worrying about HOW it does it.
 */
public interface Transaction {
    void deposit(double amount);
    boolean withdraw(double amount);
    double getBalance();
}
