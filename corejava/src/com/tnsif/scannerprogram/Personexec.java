package com.tnsif.scannerprogram;

import java.util.Scanner;

public class Personexec {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter person name");
		String n=sc.nextLine();
		System.out.println("enter the income");
		int i=sc.nextInt();
		
		Person p1=new Person();
		p1.setName(n);
		p1.setIncome(i);
		Taxcal c=new Taxcal();
		c.caluculatetax(p1);
		System.out.println("after calculation");
		System.out.println(p1);
	}

}
