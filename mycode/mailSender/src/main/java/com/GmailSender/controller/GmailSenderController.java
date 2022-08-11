package com.GmailSender.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GmailSender.service.GmailService;

@RestController
public class GmailSenderController {

	@Autowired
	private GmailService service;

	@GetMapping("/mail")
	public String gmailSender() {
		service.gmailSender();
		return "Mail send successfully..";
	}

	@GetMapping("/Attachment")
	public String fileAttachment()  {
		try {
			service.withFileAttachment();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "get Attachment successfully..";
	}
}
