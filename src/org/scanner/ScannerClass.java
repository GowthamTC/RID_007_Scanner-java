package org.scanner;
// Day2 Q1
import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		
		System.out.println("Day2 Q1");
		System.out.println("\nEnter emp id");
		int nextInt = i.nextInt();
		System.out.println("emp id");
		
		System.out.println("Enter Employe Name");
		String next = i.next();
		System.out.println("Employe Name");
		
		System.out.println("Emp Email Id");
		String next4 = i.next();
		System.out.println("Employe Email Id");
		
		System.out.println("Emp Phone no");
		long nextLong = i.nextLong();
		System.out.println("Emp Phone No");
		
		System.out.println("Emp Salary");
		float nextFloat = i.nextFloat();
		System.out.println("Emp Salary");
		
		System.out.println("Emp Gender");
		String next2 = i.next();
		System.out.println("Emp Gender");
		
		System.out.println("Employe city");
		String next3 = i.next();
		System.out.println("Employe City");
	}

}
