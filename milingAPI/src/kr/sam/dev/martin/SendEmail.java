package kr.sam.dev.martin;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
 public static void main(String[] args) {

  String host     = "smtp.naver.com";
  final String user   = "spdlxmghs@naver.com";
  final String password  = "kguta143!1";

  String to     = "kim.silvina@gmail.com"; 

  
  // Get the session object
  Properties props = new Properties();
  props.put("mail.smtp.host", host);
  props.put("mail.smtp.auth", "true");

  Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
   protected PasswordAuthentication getPasswordAuthentication() {
    return new PasswordAuthentication(user, password);
   }
  });

  // Compose the message
  try {
   MimeMessage message = new MimeMessage(session);
   message.setFrom(new InternetAddress(user));
   message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

   // Subject
   message.setSubject("홍길동 메일 테스트입니다");
   
   // Text
   message.setText("홍길동의 메일 성공입니다.");

   // send the message 
   Transport.send(message);
   System.out.println("message sent successfully...");

  } catch (MessagingException e) {
   e.printStackTrace();
  }
 }
}