package br.com.moreiracruz.java.basico.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void testBankAccountCreation() {
        BankAccount account = new BankAccount("John Doe", "1234", 56789, 1000.0);

        assertEquals("John Doe", account.getCustomerName());
        assertEquals("1234", account.getAgency());
        assertEquals(56789, account.getAccountNumber());
        assertEquals(1000.0, account.getBalance(), 0.001);
    }

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("John Doe", "1234", 56789, 1000.0);
        account.deposit(500.0);

        assertEquals(1500.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount("John Doe", "1234", 56789, 1000.0);
        account.withdraw(500.0);

        assertEquals(500.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount("John Doe", "1234", 56789, 1000.0);
        account.withdraw(1500.0);

        assertEquals(1000.0, account.getBalance(), 0.001); // Balance should not change
    }

}
