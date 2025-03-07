package br.com.moreiracruz.java.basico.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BankAccountServiceTest {

    @Test
    public void testCreateWelcomeMessage() {
        BankAccount account = new BankAccount("John Doe", "1234", 56789, 1000.0);
        BankAccountService service = new BankAccountService();

        String expected = "Hello John Doe, thank you for creating an account at our bank, your agency is 1234, account 56789 and your balance 1000,00 is now available for withdrawal.";
        assertEquals(expected, service.createWelcomeMessage(account));
    }

}
