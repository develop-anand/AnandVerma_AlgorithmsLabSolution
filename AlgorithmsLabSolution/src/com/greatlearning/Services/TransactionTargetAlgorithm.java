package com.greatlearning.Services;

import java.util.Scanner;

public class TransactionTargetAlgorithm {

	public void processTransactions (int [] transactions, int targets) {
	int sum=0; 
	int flag = 0;
	
	for (int i = 0; i< transactions.length; i++ ) {
		
		sum+= transactions [i];
		
		// checking if target is achieved
		if (sum >= targets) {
			
			System.out.println("Target achieved after " + (i+1) + " transactions ");
			flag = 1;
			break;
			
		}
	}
		
		if (flag == 0) {
			System.out.println("\nGiven target is not achieved ");
			
		}
		
	}
	
	
}

