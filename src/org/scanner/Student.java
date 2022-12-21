package org.scanner;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Student Id");
		long nextLong = s.nextLong();
	
		
		System.out.println("Student Name");
		String nextLine = s.nextLine();
		
//		System.out.println("Student Email");
//		String next = s.next();
//		System.out.println("Email"+next);
	
		long nextLong2 = s.nextLong();
		System.out.println("Student PhoneNo");
		
		String next2 = s.next();
		System.out.println("Student Dep");
		
		char charAt = s.next().charAt('m');
		System.out.println("Student Gender");
		
		String next3 = s.next();
		System.out.println("Student City");
		
	}

}
