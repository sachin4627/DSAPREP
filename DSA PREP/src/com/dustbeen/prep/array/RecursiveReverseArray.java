package com.dustbeen.prep.array;

import java.util.Scanner;

public class RecursiveReverseArray {
	
	protected static int[] getInputformUser() {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in); 
		System.out.println("Enter the size of the aaray :");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elemenent of the array :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	private static int[] reverseTheArrayByRecusion(int[] arr,int start, int end) {
		int temp;
		if(start<end) {
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		reverseTheArrayByRecusion(arr, start+1, end-1);   // recursion takes place here 
		}
		return arr;
	}
	public static void main(String arrgs[]) {
		int arr[]=getInputformUser();
		int arrFinal[]=reverseTheArrayByRecusion(arr, 0, arr.length-1);
		printArray(arrFinal);
	}

	protected static void printArray(int[] arrFinal) {
		for(int i=0;i<arrFinal.length;i++) {
			System.out.println(arrFinal[i]+",");
		}		
	}
}

