package com.dustbeen.prep.array;

public class ReverseArrayByHalfComplexity extends RecursiveReverseArray{


	public static void main(String[] args) {
		int arr[]=getInputformUser();
		int arrFinal[]=reverseTheArray(arr,0,arr.length-1);
		printArray(arrFinal);
	}

	private static int[] reverseTheArray(int[] arr, int start, int end) {
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[start];
			arr[start]   = arr[end];
			arr[end] = temp;
			end--;
			start++;
		}
		return arr;
	}

}
