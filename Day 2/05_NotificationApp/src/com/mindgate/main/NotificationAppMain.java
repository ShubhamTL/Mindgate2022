package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.Factory;
import com.mindgate.pojo.SMSNotification;
import com.mindgate.service.Notification;

public class NotificationAppMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String to;
		String message;
		int choice;
		System.out.println(
				" Enter your choice which Notification you want  \n menu \n 1. SMS Notification "
				+ "\n 2.Mail Notification \n 3. SMS Notification");
		choice = scanner.nextInt();
		System.out.println(" Entere contact :: ");
		to = scanner.next();
		scanner.nextLine();
		System.out.println("enter massage ::");
		message = scanner.nextLine();

		Notification notification = Factory.getNotification(choice);
		if (notification != null)
			notification.sendNotification(to, message);
		else
			System.out.println(" wrong choice");

	}
}
