package com.service;

import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class emailService
{
	public static void emailSend(String to1,String title1,String content1) throws AddressException, MessagingException
	{
		String to=to1;
		String title=title1;
		String content=content1;
		
		
		
		String from="liu198332@163.com";
		String password="198332";
        
		
		
		String mailServer="smtp."+from.substring(from.indexOf("@")+1,from.length());//设置邮件服务器
		
		Properties prop=new Properties();
		prop.put("mail.smtp.host", mailServer);
		prop.put("mail.smtp.auth", "true");
		
		Session sess=Session.getDefaultInstance(prop);
		sess.setDebug(true);
		MimeMessage message=new MimeMessage(sess);
		message.setFrom(new InternetAddress(from));//设置发件人
		message.setRecipients(Message.RecipientType.BCC, to);//设置收件件人
		message.setSubject(title);//设置邮件主题
		
		Multipart mul=new MimeMultipart();
		BodyPart mdp=new MimeBodyPart();
		mdp.setContent(content, "text/html;charset=gb2312");
		mul.addBodyPart(mdp);
		message.setContent(mul);//设置邮件内容;
		
		message.saveChanges();
		Transport transport=sess.getTransport("smtp");
		transport.connect(mailServer, from, password);
		transport.sendMessage(message, message.getAllRecipients());
		transport.close();
	}

}
