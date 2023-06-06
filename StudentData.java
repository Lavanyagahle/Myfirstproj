package com.firstproj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentData {
public static void main(String[] args) throws IOException {
	String name;
	int age;
	float fees;
	char gen;
	//InputStreamReader inputstreamreader= new InputStreamReader(System.in);
	//BufferedReader bufferreader= new BufferedReader(inputstreamreader);
	BufferedReader bufferreader=new BufferedReader(new InputStreamReader(System.in));
	//readLine()--->String
	//read()--->ascii value
	System.out.println("Enter the name");
	name = bufferreader.readLine();
	System.out.println("Enter the age");
	age = Integer.parseInt(bufferreader.readLine());
	System.out.println("Enter the fees");
	fees = Float.parseFloat(bufferreader.readLine());
	System.out.println("Enter the gender");
	gen = (char)bufferreader.read();
	System.out.println("Name = "+name);
	System.out.println("Age = "+age);
	System.out.println("Fees = "+fees);
	System.out.println("Gender = "+gen);
}
}
