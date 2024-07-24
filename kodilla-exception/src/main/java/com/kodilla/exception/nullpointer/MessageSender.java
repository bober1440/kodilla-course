package com.kodilla.exception.nullpointer;

public class MessageSender {
    public void sendMessageToUser (User user, String message) throws MessageNotSendException {
        if (user != null) {
            System.out.println("Sending message: " + message + " to user: " + user.getName());
        } else {
            throw new MessageNotSendException("Object user was null");
        }
    }
}
