package com.ind;

import java.util.Scanner;

public class IndustryName {
	
	public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
	
		
		
		
		System.out.println("Enter your full name:");
	     String nextLine = r.nextLine();
		
	     System.out.println("Enter your Gender:");
			char charAt = r.next().charAt(0);
		System.out.println("Enter your name:");
		String next = r.next();
	
		
		
		System.out.println("Enter Founder full name:" + nextLine);
		System.out.println("Enter Founder Gender:" + charAt);
		System.out.println("Enter Founder Name:" + next );	
		
	}

}
