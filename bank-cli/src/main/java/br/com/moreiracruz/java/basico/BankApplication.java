package br.com.moreiracruz.java.basico;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import br.com.moreiracruz.java.basico.service.BankAccount;

public class BankApplication {

	public static void main(String[] args) {
		Options options = new Options();
		options.addOption("c", "create", false, "Create a new bank account");
		options.addOption("d", "deposit", true, "Deposit money into the account");
		options.addOption("w", "withdraw", true, "Withdraw money from the account");
		options.addOption("b", "balance", false, "Check the account balance");
		options.addOption("h", "help", false, "Show help");

		CommandLineParser parser = new DefaultParser();
		HelpFormatter formatter = new HelpFormatter();
		CommandLine cmd;

		try {
			cmd = parser.parse(options, args);

			if (cmd.hasOption("h")) {
				formatter.printHelp("bank-app", options);
				System.exit(0);
			}

			BankAccount account = new BankAccount("12345", 0.0);

			if (cmd.hasOption("c")) {
				System.out.println("Account created with number: " + account.getAccountNumber());
			}

			if (cmd.hasOption("d")) {
				double amount = Double.parseDouble(cmd.getOptionValue("d"));
				account.deposit(amount);
				System.out.println("Deposited: " + amount);
			}

			if (cmd.hasOption("w")) {
				double amount = Double.parseDouble(cmd.getOptionValue("w"));
				account.withdraw(amount);
				System.out.println("Withdrawn: " + amount);
			}

			if (cmd.hasOption("b")) {
				System.out.println("Current balance: " + account.getBalance());
			}

		} catch (ParseException e) {
			System.out.println(e.getMessage());
			formatter.printHelp("bank-app", options);
			System.exit(1);
		}
	}

}
