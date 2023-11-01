import java.util.Scanner;

public class CalculateCarbonFootPrint {
    
    public static float calculateInboxCarbonFootprint(int inboxEmailCount) {
        return (4.0f * inboxEmailCount) / 1000;
    }

    public static float calculateSentCarbonFootprint(int sentEmailCount) {
        return (4.0f * sentEmailCount) / 1000;
    }

    public static float calculateSpamCarbonFootprint(int spamEmailCount) {
        return (0.4f * spamEmailCount) / 1000;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

            float inboxCarbonFootprint = calculateInboxCarbonFootprint(inboxEmailCount);
            float sentCarbonFootprint = calculateSentCarbonFootprint(sentEmailCount);
            float spamCarbonFootprint = calculateSpamCarbonFootprint(spamEmailCount);

            float totalCarbonFootprint = inboxCarbonFootprint + sentCarbonFootprint + spamCarbonFootprint;

            System.out.println("\nEmail: " + emailId);
            System.out.println("Inbox Carbon Content: " + inboxCarbonFootprint + " kg");
            System.out.println("Sent Carbon Content: " + sentCarbonFootprint + " kg");
            System.out.println("Spam Carbon Content: " + spamCarbonFootprint + " kg");
            System.out.println("Total Carbon Content: " + totalCarbonFootprint + " kg");
        }
    }
}
