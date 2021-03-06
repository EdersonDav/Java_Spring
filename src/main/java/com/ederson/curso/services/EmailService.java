package com.ederson.curso.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.ederson.curso.domain.Pedido;

public interface EmailService {
	
	public void sendOrderConfirmationEmail(Pedido obj);
	
	public void sendEmail(SimpleMailMessage msg);
	
	public void sendOrderConfirmationHtmlEmail(Pedido obj);
	
	public void sendHtmlEmail(MimeMessage msg);

}
