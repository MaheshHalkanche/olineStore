package com.arraylist;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAcount acount = new BankAcount("Mahesh Halkanche", "9527531139");
		acount.showMenu();

	}

}

class BankAcount
{
	int balance;
	int PreviousTransaction;
	String CustomerName;
	String CustId;
	
	BankAcount(String cname,String cid)
	{
		CustomerName =cname;
		CustId =  cid;
	}
	
	void deposit(int amount)
	{
		if(amount !=0)
		{
			balance = balance + amount;
			PreviousTransaction = amount;
		}
	}
	
	void withdraw(int amount)
	{
		if(amount != 0)
		{
			balance = balance -amount;
			PreviousTransaction = -amount;
		}
	}
	void getPreviousTransaction()
	{
		if(PreviousTransaction > 0)
		{
			System.out.println("Deposited :"+PreviousTransaction);
		} else if(PreviousTransaction < 0)
		{
			System.out.println("withdrawn ::"+ Math.abs(PreviousTransaction));
		}else
		{
			System.out.println("no transaction accured");
		}
	}
	void showMenu()
	{
		char option ='\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome:"+ CustomerName);
		System.out.println("customerId is "+ CustId);
		System.out.println("\n");
		System.out.println("A.check Balance");
		System.out.println("B.Deposit");
		System.out.println("C.WithDraw");
		System.out.println("D.Previous Transaction");
		System.out.println("E. Exit");
		
		do {
			System.out.println("===========================================");
			System.out.println("Enter an Option");
			System.out.println("============================================");
			option = scanner.next().charAt(0);
	 		System.out.println("\n");
			
			switch (option) {
			case 'A':
			System.out.println("-----------------------------------------------");
			System.out.println("Balance ="+ balance);
			System.out.println("-----------------------------------------------");
			System.out.println("\n");
			break;
			
			case 'B':
				System.out.println("-----------------------------------------------");
				System.out.println("Enter an amount to deposit");
				System.out.println("-----------------------------------------------");
				int amount = scanner.nextInt();
				deposit(amount);				
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("-----------------------------------------------");
				System.out.println("Enter an amount to WithDraw");
				System.out.println("-----------------------------------------------");
				int amount2 = scanner.nextInt();
				withdraw(amount2);				
				System.out.println("\n");
				break;
			
			case 'D':
				System.out.println("-----------------------------------------------");
				getPreviousTransaction();
				System.out.println("-----------------------------------------------");								
				System.out.println("\n");
				break;
			
			case 'E':
				System.out.println("--------------------------------------");
				

			default:
				System.out.println("Unexpected value");
			}
			
		}while(option != 'E');
		{
			System.out.println("thank you for using our servies");
		}
		
	}
	
}
