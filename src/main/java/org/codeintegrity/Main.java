package org.codeintegrity;

public class Main {
    public static void main(String[] args) {
        // Create a new bank
        Bank mouseBank = new Bank("Mouse Bank");

        // Create a customer
        Customer customer1 = new Customer("John Doe", "C001");

        // Add accounts to the customer
        BankAccount account1 = new BankAccount("123456", 1000.0);
        BankAccount account2 = new BankAccount("789012", 2000.0);
        customer1.addAccount(account1);
        customer1.addAccount(account2);

        // Add customer to the bank
        mouseBank.addCustomer(customer1);

        // Display all customers
        mouseBank.displayAllCustomers();

        // Display customer accounts
        customer1.displayAccounts();

        // Perform some transactions
        Transaction depositTransaction = new Transaction(account1, "deposit", 500.0);
        Transaction withdrawTransaction = new Transaction(account2, "withdraw", 300.0);

        // Display transaction details
        System.out.println(depositTransaction.getTransactionDetails());
        System.out.println(withdrawTransaction.getTransactionDetails());

        // Display balances after transactions
        account1.displayBalance();
        account2.displayBalance();
    }
}