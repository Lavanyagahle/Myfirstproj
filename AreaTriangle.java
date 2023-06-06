package com.firstproj;

import java.util.Scanner;

public class AreaTriangle {
 public static void main(String[] args) {
	float height, base, areatriangle;
	float a, perimeter;
	Scanner sc= new Scanner(System.in);
	//System.out.println("Enter heigth of triangle");
	//height= sc.nextFloat();
	System.out.println("Enter base of triangle");
	base =sc.nextFloat();
	System.out.println("Enter heigth of triangle");
	height= sc.nextFloat();
	System.out.println("Enter third side of triangle");
	a= sc.nextFloat();
	//height = 23.2f;
	//base= 34.6f;
	//a = 45.5f;
	areatriangle = (height * base)/2;
	perimeter = (height+base+a);
	System.out.println("The area of triangle is "+areatriangle);
	System.out.println("The perimeter of triangle is "+perimeter);
	
}
}
