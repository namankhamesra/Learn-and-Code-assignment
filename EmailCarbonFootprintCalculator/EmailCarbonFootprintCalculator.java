package EmailCarbonFootprintCalculator;

public class EmailCarbonFootprintCalculator {
    public float calculateInboxCarbonFootprint(int inboxEmailCount) {
        return Constants.INBOX_EMAIL_CARBN_MULTIPLIER * inboxEmailCount;
    }

    public float calculateSentCarbonFootprint(int sentEmailCount) {
        return Constants.SENT_EMAIL_CARBN_MULTIPLIER * sentEmailCount;
    }

    public float calculateSpamCarbonFootprint(int spamEmailCount) {
        return Constants.SPAM_EMAIL_CARBN_MULTIPLIER * spamEmailCount;
    }
}
