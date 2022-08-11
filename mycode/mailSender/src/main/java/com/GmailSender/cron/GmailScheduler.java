package com.GmailSender.cron;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import com.GmailSender.service.GmailService;

@Configuration
public class GmailScheduler {

	@Autowired
	private GmailService gmailService;

	@Scheduled(cron = "0 0 16 * * *")
	public void gmailSeduler() {
		gmailService.gmailSender();
	}
}
