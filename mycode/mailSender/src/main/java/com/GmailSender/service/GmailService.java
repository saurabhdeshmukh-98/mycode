package com.GmailSender.service;

import java.io.File;
import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class GmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	public String gmailSender() {
		SimpleMailMessage mailMessage = new SimpleMailMessage();

		mailMessage.setFrom("saurabh.deshmukh@tectoro.com");
		mailMessage.setTo("arun.sharma@tectoro.com");
		mailMessage.setText("Hii i am saurabh have to inform you this is remainder mail..");
		mailMessage.setSubject("Adharcard verification");
		mailMessage.setSentDate(new Date());

		javaMailSender.send(mailMessage);
		return "mail sended";
	}

	public void withFileAttachment() throws MessagingException {
		MimeMessage message = javaMailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			helper.setFrom("saurabh.deshmukh@tectoro.com");
			helper.setTo("sanjay.kumar@tectoro.com");
			helper.setText("Hii this is demo file..");
			helper.setSubject("text.file");
			helper.setSentDate(new Date());

			File file = new File("/home/tectoro/Downloads/grep.png");
			helper.addAttachment(file.getName(), file);
			helper.setText("this demo photo..");

			// invoke send()
			javaMailSender.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
