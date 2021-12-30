package com.greatlearning.mergesort;
import java.util.Scanner;


public class MergeSortImplementation {
	
	static Scanner sc = new Scanner (System.in);
	
	private void merge (int start, int mid, int end, int[] arr)
	{
		int[] left = new int[mid-start+1];
		int[] right = new int[end-mid];
		
		int l = start;
		int r = mid+1;
		
		int index = 0;
		
		while(index<mid-start+1)
			left[index++] = arr[l++];
		
		index = 0;
		
		while(index<end-mid)
			right[index++] = arr[r++];
		
		l=r=0;
		index = start;
		
		while(l<mid-start+1 && r<end-mid)
		{
			if (left[l]>right[r])
				arr[index++] = left[l++];
			else
				arr[index++] = right[r++];
		}
			
			while(l<mid-start+1)
				arr[index++] = left[l++];
			
			while(r<end-mid)
				arr[index++] = right[r++];
			
		
		
			
	}
	
	public void mergeSort(int start, int end, int[] arr)
	{
		if (start<end)
		{
			int mid = start+ (end-start)/2;
			mergeSort(start, mid, arr);
			mergeSort(mid+1,end,arr);
			merge(start,mid,end,arr);
		}
	}

	/*public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the array");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		MergeSortImplementation ms = new MergeSortImplementation();
		ms.mergeSort(0,arr.length-1,arr);
		
		System.out.println("Sorted array");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}

	}*/

}
