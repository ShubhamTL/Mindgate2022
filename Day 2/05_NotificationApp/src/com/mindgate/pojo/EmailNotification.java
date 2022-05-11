package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class EmailNotification  implements Notification{

	@Override
	public void sendNotification(String to, String message) {
		System.out.println("sending Mail Notification");
		System.out.println("Mail Id ::"+ to);
		System.out.println("Massage ::"+ message);
	}

	
}
