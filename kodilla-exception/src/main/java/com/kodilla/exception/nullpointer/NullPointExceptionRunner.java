package com.kodilla.exception.nullpointer;

public class NullPointExceptionRunner {

    public static void main(String[] args) {
        User user = null;
        MessageSender messageSender = new MessageSender();

        try{
            messageSender.sendMessageToUser(user, "Hello");
        } catch (MessageNotSendException e){
            System.out.println("Message is not send," +
                    " but my program still running  very well");
        }
        System.out.println("Processing other login!");
    }
}
