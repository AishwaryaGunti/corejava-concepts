package com.tnsif.scannerprogram;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String n=sc.nextLine();
		System.out.println("enter your id");
		int i=sc.nextInt();
		
		System.out.println("name of the student"+n);
		System.out.println("id of the student"+i);
		
	}

}
