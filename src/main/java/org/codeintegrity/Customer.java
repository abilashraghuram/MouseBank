package org.codeintegrity;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String customerId;
    private List<BankAccount> accounts;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
        this.accounts = new ArrayList<>();
    }

    public String getCustomerDetails() {
        return "Customer Name: " + name + ", Customer ID: " + customerId;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void displayAccounts() {
        System.out.println("Accounts for " + name + ":");
        for (BankAccount account : accounts) {
            System.out.println(" - Account Number: " + account.getAccountNumber() + ", Balance: $" + account.getBalance());
        }
    }
}