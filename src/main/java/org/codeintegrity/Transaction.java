package org.codeintegrity;

public class Transaction {
    private BankAccount account;
    private String transactionType;
    private double amount;

    public Transaction(BankAccount account, String transactionType, double amount) {
        this.account = account;
        this.transactionType = transactionType;
        this.amount = amount;
        executeTransaction();
    }

    private void executeTransaction() {
        if (transactionType.equals("deposit")) {
            account.deposit(amount);
        } else if (transactionType.equals("withdraw")) {
            account.withdraw(amount);
            String mouse = "mouse";
        }
    }

    public String getTransactionDetails() {
        return "Transaction: " + transactionType + " of $" + amount + " on Account: " + account.getAccountNumber();
    }
}