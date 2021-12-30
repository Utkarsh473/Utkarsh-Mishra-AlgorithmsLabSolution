package com.greatlearning.lab;
import java.util.Scanner;
import com.greatlearning.mergesort.*;

public class MinimumNotes {
	
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		// Take the size of currency denominations as input
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		
		// Allocate the array of size entered as notes[] to hold denominations
		int[] notes = new int[size];
		
		// Take the input of currency denominations
		System.out.println("Enter the currency denominations value");
		for (int i=0;i<size;i++)
		{
			notes[i] = sc.nextInt();
		}
		
		// Take the input of amount to be paid
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		
		//sort the array using merge sort
		MergeSortImplementation ms = new MergeSortImplementation();
		ms.mergeSort(0,notes.length-1,notes);
		
		//print the sorted array
		/*
		System.out.println("Sorted denomination array:");
		for (int i=0;i<notes.length;i++)
		System.out.println(notes[i]);
		*/
		
		//algorithm to find the minimum number of notes
		int index = 0;
		int amt = amount;
		int len = notes.length;
		System.out.println("Your payment approach in order to give min no of notes will be");
		while(index<len)
		{

				//increase index of the array while amount remains lesser than the individual array elements
				while(index<len&&amt<notes[index])
					index++;
				
				//break if end of array is reached
				if(index>=len)
					break;
				else
				{
				// extract the number of notes by dividing amount by notes of index	
				int numOfNotes = amt/notes[index];
				// reduce the amount after note extraction
				amt = amt%notes[index];
				System.out.println(notes[index]+":"+numOfNotes);
				index++;
				}
			
		}
		

	}

}
