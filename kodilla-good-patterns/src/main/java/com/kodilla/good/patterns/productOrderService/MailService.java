package com.kodilla.good.patterns.productOrderService;

public class MailService implements InformationService{
    @Override
    public void inform(User user) {
        System.out.println("Sending information to user: " + user.toString());
    }
}
