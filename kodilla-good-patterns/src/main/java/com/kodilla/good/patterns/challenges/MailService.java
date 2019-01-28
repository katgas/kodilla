package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService{
    private String message;

    public MailService(final String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public void inform(User user) {
        System.out.println("\nDear " + user.getName() + " " + user.getSurname() + ", \n" +
                "Your order has been placed successfully.\n" + getMessage());
    }
}
