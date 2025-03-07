package br.com.moreiracruz.java.basico.service;

public class BankAccountService {

    public String createWelcomeMessage(BankAccount bankAccount) {
        return String.format(
            "Hello %s, thank you for creating an account at our bank, your agency is %s, account %d and your balance %.2f is now available for withdrawal.",
            bankAccount.getCustomerName(),
            bankAccount.getAgency(),
            bankAccount.getAccountNumber(),
            bankAccount.getBalance()
        );
    }

}
