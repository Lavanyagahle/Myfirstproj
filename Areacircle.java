//Program to calculate area of circle
package com.firstproj;

import java.util.Scanner;

public class Areacircle {
public static void main(String[] args) {
	float radius, areacircle,pie,circum;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter value of radius");
	radius = sc.nextFloat();
	System.out.println("Enter value of pie");
	pie=sc.nextFloat();
	//pie = 3.14159f;
	//radius = 23.4f;
	areacircle = (pie*radius*radius);
	System.out.println("The area of circle is "+areacircle);
	circum = (2*pie*radius);
	System.out.println("The circumference of circle is "+circum);
}
}
