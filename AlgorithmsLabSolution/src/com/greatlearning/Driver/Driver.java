package com.greatlearning.Driver;

import java.util.Scanner;

import com.greatlearning.Services.TransactionTargetAlgorithm;

public class Driver {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		TransactionTargetAlgorithm transactionTargetAlgorithm = new TransactionTargetAlgorithm();
		
		System.out.println("Enter the No Of transactions of transactions array");
		
		// Get totalNoOfTransacations of the Transactions array
		int totalNoOfTransactions = scanner.nextInt();
		
		
		// Initialise  Transactions Array
		int[] transactions = new int [totalNoOfTransactions];
		
		System.out.println("Enter the values of Transactions ");
		
		//Get The Transactions
		for (int i= 0; i <totalNoOfTransactions; i++)
			transactions [i] = scanner.nextInt();
			
		//Get the no Of Targets
			System.out.println("Enter the total no of targets that to be achieved ");
			
			int targetCount = scanner.nextInt();
			
			System.out.println("Enter the value of Targets ");
			
			int target;
			for (int i = 0; i < targetCount; i++) {
				target = scanner.nextInt();
			transactionTargetAlgorithm.processTransactions(transactions, target);
		}
	}
	

}