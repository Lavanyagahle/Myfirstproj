//Program to find the area of square
package com.firstproj;

import java.util.Scanner;

public class SquareArea {
public static void main(String[] args) {
	int side,areasq, perimeter; //variable declaration
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter side of square");
	side=sc.nextInt();
	//side = 4; //Assigning value
	areasq = side * side;
	perimeter = (4*side);
	System.out.println("The area of square of side "+side+" is "+areasq);
	System.out.println("The perimeter of square is "+perimeter);
	
}
}
