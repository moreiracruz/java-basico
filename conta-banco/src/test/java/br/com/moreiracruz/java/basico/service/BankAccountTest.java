package br.com.moreiracruz.java.basico.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("12345", 100.0);
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount("12345", 100.0);
        account.withdraw(50.0);
        assertEquals(50.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount("12345", 100.0);
        account.withdraw(150.0);
        assertEquals(100.0, account.getBalance(), 0.001);
    }

}
