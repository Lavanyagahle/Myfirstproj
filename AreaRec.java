//Program to calculate area of rectangle
package com.firstproj;

import java.util.Scanner;

public class AreaRec {
public static void main(String[] args) {
	int length, breadth,arearec,perimeter;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the length of rectangle");
	length=sc.nextInt();
	System.out.println("Enter the breadth of rectangle");
	breadth=sc.nextInt();
	//length = 23;
	//breadth =45;
	arearec = length * breadth;
	perimeter = ((length+ breadth)*2);
	System.out.println("The area of rectangle is "+arearec);
	System.out.println("The perimeter of rectangle is "+perimeter);
}
}
