package com.ederson.curso.services;

import org.springframework.mail.SimpleMailMessage;

import com.ederson.curso.domain.Pedido;

public interface EmailService {
	
	public void sendOrderConfirmationEmail(Pedido obj);
	
	public void sendEmail(SimpleMailMessage msg);

}
