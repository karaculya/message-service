# It's service for sending emails
## Introduction
This service was written to send questionnaires to the mail

## I used:
### JavaMail API
JavaMail is a Java API for receiving and sending email using the SMTP, POP3, and IMAP protocols. JavaMail is part of the Java EE platform, but is also available as an add-on package for use in Java SE applications.
JavaMail does not include a mail server, but free Apache James[en] and Java Email Server (POP3 and SMTP) can be used for such tasks, or the SubEthaSMTP library to create an SMTP server.
### GSON
The GSON library was developed by Google programmers and allows you to convert JSON objects to Java objects and vice versa.
## Installation
### Maven
Add the dependencies to your project:
``` xml
<dependency>
    <groupId>com.sun.mail</groupId>
    <artifactId>javax.mail</artifactId>
    <version>1.6.2</version>
</dependency>

<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>
```
## How it works?

`config.properties` file contains the following properties:
``` properties
mail.from = <sender's mail>
mail.from.password = <sender email password>
mail.to = <recipient's mail>
mail.smtp.auth = true
mail.smtp.starttls.enable = true
mail.smtp.host = smtp.gmail.com
mail.smtp.port = 587
```

`test.json` file contains test data:
``` json
{
  "name": "my name",
  "phone": "my phone",
  "university": "my university",
  "specialization": "my specialization",
  "stage": "my stage",
  "course": 4,
  "hours": 6,
  "startDate": "my start date",
  "endDate": "my end date",
  "petProjects": "my pet projects",
  "ideas": "my ideas",
  "skills": "my skills"
}
```

