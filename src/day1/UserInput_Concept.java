package day1;

import java.util.Scanner;

public class UserInput_Concept {


	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=scan.nextInt();
		
		System.out.println("Enter second number"); 
		int num2=scan.nextInt();
		
		int res=num1+num2;
		System.out.println("Total result is"+res);


	
	
		System.out.println("Enter first String");
		String s=scan.next();
		
		System.out.println("Enter second String");
		String s1=scan.next();
		
		String total=s+s1;
		System.out.println("Complete string:"+total);
		
	}




}
