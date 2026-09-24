package com.bank;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Core Banking System Initialized ===");
        
        // Instantiating our object
        SavingsAccount myAccount = new SavingsAccount("FI-8829102", "Niroj Gautam", 1000.0, 3.5);
        
        System.out.println("Account Holder: " + myAccount.getAccountHolder());
        System.out.println("Initial Balance: €" + myAccount.getBalance());
        System.out.println("---------------------------------------");
        
        // Simulating transactions
        myAccount.deposit(250.0);
        myAccount.withdraw(100.0);
        myAccount.applyInterest();
        
        System.out.println("---------------------------------------");
        System.out.println("Final Account Audit Balance: €" + myAccount.getBalance());
    }
}
