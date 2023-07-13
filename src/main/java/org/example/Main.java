package org.example;

public class Main {

    public static void main(String[] args) {
        MailSender mailSender = new MailSender();

        mailSender.send(
                "Test",
                "This is test text!",
                "karin0akhmadullina@gmail.com"
        );

    }

}