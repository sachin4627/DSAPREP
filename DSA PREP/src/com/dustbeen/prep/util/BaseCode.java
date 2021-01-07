package com.dustbeen.prep.util;

import java.util.Scanner;

public class BaseCode {

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
	protected static void printArray(int[] arrFinal) {
		for(int i=0;i<arrFinal.length;i++) {
			System.out.println(arrFinal[i]+",");
		}		
	}
	
	protected static void printTwoValues(String firstString ,String secondString,String firstValue,String secondValue) {
		System.out.println(firstString+firstValue);
		System.out.println(secondString+secondValue);
	}
}
