package day1;

import java.util.Scanner;

public class UserInputConcept {

	public static void main(String[] args) {
		
				Scanner scan=new Scanner(System.in);
		        System.out.println("Enter First number:");
		        int num1=scan.nextInt();
		        System.out.println("Enter second number:");
		        int num2=scan.nextInt();
		        
                int res=num1+num2;
                System.out.println("Total result is:"+res);
	}

}
