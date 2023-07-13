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

    static {
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
    }

    public MailSender() {
        username = getProperties().getProperty("username");
        password = getProperties().getProperty("password");
    }

    public void send() {
        Session session = Session.getInstance(
                properties,
                new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                }
        );

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(
                            getProperties().getProperty("fromUser")
                    )
            );
            message.setSubject("Новый кандидат");
            message.setText(GsonParser.parse().toString());

            Transport.send(message);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    private Properties getProperties() {
        Properties secretProperties = new Properties();

        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            secretProperties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return secretProperties;
    }
}
