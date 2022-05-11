package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.Factory;
import com.mindgate.pojo.Shapes;

public class ShapesMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println(" Enter your choice \n menu \n 1. Circle \n 2. Triangle \n 3. Square");
	
	int choice= scanner.nextInt();
	
	Shapes shape = Factory.getShape(choice);
	if(shape!= null)
	shape.draw();
	else
		System.out.println("invalid shapes choice");
}
}
