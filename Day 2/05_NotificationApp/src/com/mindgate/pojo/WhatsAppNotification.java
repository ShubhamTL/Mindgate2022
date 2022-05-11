package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class WhatsAppNotification implements Notification{
	public void sendNotification(String to, String message) {
		System.out.println("sending WhatsApp Notification");
		System.out.println("WhatsApp Number ::"+ to);
		System.out.println("Massage ::"+ message);
	}
}
