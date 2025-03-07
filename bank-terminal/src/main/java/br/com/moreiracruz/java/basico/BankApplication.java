package br.com.moreiracruz.java.basico;

import java.util.Scanner;

import br.com.moreiracruz.java.basico.service.BankAccount;
import br.com.moreiracruz.java.basico.service.BankAccountService;

public class BankApplication {

    public static void main(String[] args) {
        String customerName = null;
        String agency = null;
        Integer accountNumber = null;
        Double initialBalance = null;

        Scanner scanner = new Scanner(System.in);

        customerName = readInput(scanner, "Please enter the customer name: ");
        agency = readInput(scanner, "Please enter the agency: ");
        accountNumber = readIntegerInput(scanner, "Please enter the account: ");
        initialBalance = readDoubleInput(scanner, "Please enter the initial balance: ");

        scanner.close();

        BankAccount bankAccount = new BankAccount(customerName, agency, accountNumber, initialBalance);
        BankAccountService service = new BankAccountService();
        System.out.println(service.createWelcomeMessage(bankAccount));
    }

    private static String readInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Invalid value! Please try again!");
        }
    }

    private static Integer readIntegerInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine().trim();

                if (!input.isEmpty()) {
                    return Integer.parseInt(input);
                }
                System.out.println("Invalid value! Please try again!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid value! Please try again!");
            }
        }
    }

    private static Double readDoubleInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine().trim();

                if (!input.isEmpty()) {
                    return Double.parseDouble(input);
                }
                System.out.println("Invalid value! Please try again!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid value! Please try again!");
            }
        }
    }

}
