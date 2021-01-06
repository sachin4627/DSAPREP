package com.dustbeen.prep.array;

import java.util.Scanner;
/**
 * Complexity is  O(n) by this way.
 * */
public class ReverseArrray {

	private static void reverseArray(int arr[], int start, int end) {
		while (start < end) {
			int temp = arr[start];
			System.out.println("temp is : "+temp);
			System.out.println("arr[start] Before: "+arr[start]);
			System.out.println("arr[end] Before: "+arr[end]);
			arr[start] = arr[end];

			System.out.println("arr[start] after: "+arr[start]);
			System.out.println("arr[end] after: "+arr[end]);
			arr[end] = temp;

			System.out.println("arr[end] again after: "+arr[end]);
			for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+",");
			}
			System.out.printf("%n","");
			System.out.println("***************************************");
			start++;
			end--;
		}
	}

	private static int[] takingInputArray() {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter the size of the array :");
		int n=sc.nextInt();
		int array[] =new int[n];
		System.out.println("Please enter the array's elements.");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		return array;
	}

	public static void main(String args[]) {
		int arry[] =takingInputArray();
		reverseArray(arry, 0, arry.length-1);
		
	}

}
