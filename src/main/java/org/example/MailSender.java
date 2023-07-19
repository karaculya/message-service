package org.example;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MailSender {
    private static final Properties properties = new Properties();
    private static final String fileName = "src/main/resources/config.properties";
    private static String username;
    private static String password;

    public MailSender() {
        username = getProperties().getProperty("mail.from");
        password = getProperties().getProperty("mail.from.password");
    }

    public void send() {
        Session session = Session.getInstance(
                getProperties(),
                new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(getUsername(), getPassword());
                    }
                }
        );

        sendMsg(session);
    }

    private void sendMsg(Session session){
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(getUsername()));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(
                            getProperties().getProperty("mail.to")
                    )
            );
            message.setSubject("practicat");
            message.setText(GsonParser.parse().toString());

            Transport.send(message);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    private Properties getProperties() {
        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return properties;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }
}
