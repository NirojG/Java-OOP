# Simple Banking System (Java OOP Practice)

I built this small console app to get comfortable with Object-Oriented Programming (OOP) in Java. Instead of just reading theory or watching tutorials, I wanted to build a simple project from scratch to see how classes, objects, and interfaces actually fit together.

---

## What I Learned & Practiced

Working on this helped me understand the four core OOP concepts in a real scenario:

* **Abstraction (`Transaction.java`):** I used an interface to outline the actions an account should support (deposit, withdraw, check balance). It sets the rules without worrying about how each account type does the math.
* **Encapsulation (`Account.java`):** Kept variables like the balance and account details `private` and `protected`. This means outside code cannot randomly change the balance—it has to go through `deposit()` or `withdraw()` checks.
* **Inheritance (`SavingsAccount.java`):** Instead of rewriting all the basic account logic, `SavingsAccount` just inherits from `Account` using `extends` and adds its own specific features like interest calculation.
* **Polymorphism:** The `SavingsAccount` overrides the `withdraw()` method from the parent class to enforce its own rules (like making sure you don't withdraw more money than you actually have).

---

## Project Structure

```text
src/com/bank/
├── Transaction.java      # Interface defining the basic operations
├── Account.java          # Base class holding shared data and methods
├── SavingsAccount.java   # Child class with specific savings rules
└── Main.java             # Runs the simulation and tests the logic