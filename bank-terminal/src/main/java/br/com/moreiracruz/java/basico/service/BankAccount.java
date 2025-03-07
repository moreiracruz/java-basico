package br.com.moreiracruz.java.basico.service;

public class BankAccount {
    private String customerName = null;
    private String agency = null;
    private int accountNumber;
    private double balance;

    public BankAccount(String customerName, String agency, int accountNumber, double balance) {
        this.customerName = customerName;
        this.agency = agency;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAgency() {
        return agency;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

}
