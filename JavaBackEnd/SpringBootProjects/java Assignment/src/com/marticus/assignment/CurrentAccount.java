package com.marticus.assignment;

import java.util.Scanner;

public class CurrentAccount  {
	int accountNumber = 987654321;
	int balance = 10000;

	Scanner sc = new Scanner(System.in);
	public void accountNumber() {
		System.out.println("Please Enter the Account Number");
		int acNumber = sc.nextInt();

		if(acNumber==accountNumber) {
			while(true) {
				System.out.println("Select the number to perform operations");
				System.out.println(" 1 => for Withdraw Money");
				System.out.println(" 2 => for Deposit Money");

				int choice = sc.nextInt();
				switch(choice) {
				case 1:
				{
					System.out.println("Enter your withdrawn Amount");
					int withdraw = sc.nextInt();
					if(balance>=withdraw) {
						balance -= withdraw;
						System.out.println("Transaction Successfull!");
						System.out.println("Please collect your money");
						System.out.println("Available balance is : "+ balance);
						System.out.println("");
					}
					else {
						System.out.println("Insufficient Balance");
					}
					break;
				}
					
				case 2:
				{
					System.out.println("Enter your deposit Amount :");
					int deposit=sc.nextInt();

					deposit += balance ;
					System.out.println("Your amount has been deposited successfully!!");
					System.out.println("Available balance:"+deposit);
					break;

				}
				default:
					System.out.println("Please choose correct options");
					
				}
				System.out.println("Thank You for using ATM! ");
				System.exit(0);


			}

		}
		else {
			System.out.println("Invalid Account Number");
			accountNumber();
		}
		
	}

}


