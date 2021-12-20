package com.greatlearning.Driver;

import java.util.Scanner;

import com.greatlearning.Service.MergeSort;
import com.greatlearning.Service.NotesCount;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		MergeSort mergeSort = new MergeSort ();
		
		NotesCount notesCount = new NotesCount ();
		
		System.out.println("Enter the total number of Denominations ");
		
		int totalNoOfDenominations = scanner.nextInt();
		
		// Initialising Notes Array
		int [] notes = new int [totalNoOfDenominations];
		
		// Get Currency denominations
		System.out.println("Enter the denominations value ");
		
		for (int i = 0; i < totalNoOfDenominations; i++) {
			notes[i] = scanner.nextInt();
	
		}
	
	// Amount to pay
	
		System.out.println("Enter the amount you want to pay ");
		int amount = scanner.nextInt();
		

		mergeSort.sort(notes,0,notes.length-1);
		
		notesCount.notesCountImplementation(notes, amount);
		
	
		
		

}
}


