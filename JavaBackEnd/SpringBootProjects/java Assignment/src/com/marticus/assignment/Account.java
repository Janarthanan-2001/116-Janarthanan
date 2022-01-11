package com.marticus.assignment;

import java.util.Scanner;

public class Account {
	

	public static void main(String[] args) {
		System.out.println("Welcome to the bank ATM !!");
		System.out.println("");
	
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please Select Account:");
			System.out.println(" 1 =>  Savings Account");
			System.out.println(" 2 =>  Current Account");
			System.out.println(" 0 =>  EXIT");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
			{
				SavingsAccount sa = new SavingsAccount();
				sa.accountNumber();
				break;
			}
				
			case 2:
			{
				CurrentAccount ca = new CurrentAccount();
				ca.accountNumber();
				break;
			}
				
			default:
				System.out.println("Please choose correct options... Exitting");
				
			}
			System.out.println("Thank You for using ATM!");
				
			}
		}
	}

		
		
		
		
		
		
		

