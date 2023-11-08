package EmailCarbonFootprintCalculator;

import java.util.Scanner;

public class EmailCarbonFootprintApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailCarbonFootprintCalculator calculator = new EmailCarbonFootprintCalculator();

        while (true) {
            System.out.print("Enter email (or 'exit' to quit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String emailId = input;
            System.out.print("No. of mail in Inbox: ");
            int inboxEmailCount = scanner.nextInt();
            System.out.print("No. of mail in Sent: ");
            int sentEmailCount = scanner.nextInt();
            System.out.print("No. of mail in Spam: ");
            int spamEmailCount = scanner.nextInt();

            scanner.nextLine();

            float inboxCarbonFootprint = calculator.calculateInboxCarbonFootprint(inboxEmailCount);
            float sentCarbonFootprint = calculator.calculateSentCarbonFootprint(sentEmailCount);
            float spamCarbonFootprint = calculator.calculateSpamCarbonFootprint(spamEmailCount);

            float totalCarbonFootprint = inboxCarbonFootprint + sentCarbonFootprint + spamCarbonFootprint;

            System.out.println("\nEmail: " + emailId);
            System.out.println("Inbox Carbon Content: " + inboxCarbonFootprint + " kg");
            System.out.println("Sent Carbon Content: " + sentCarbonFootprint + " kg");
            System.out.println("Spam Carbon Content: " + spamCarbonFootprint + " kg");
            System.out.println("Total Carbon Content: " + totalCarbonFootprint + " kg");
        }
    }
}