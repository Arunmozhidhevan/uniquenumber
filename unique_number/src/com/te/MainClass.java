package com.te;

import java.util.Scanner;

public class MainClass extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		System.out.println("enter a value");
		int n=scanner.nextInt();
		int result = getUnique(n);
		if(result==1)
			System.out.println("Unique");
		else
			System.out.println("Not Unique");
	}

}
