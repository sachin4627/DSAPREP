package com.dustbeen.prep.array;

import com.dustbeen.prep.util.BaseCode;

public class KthMaximunElement extends BaseCode{
	static int k=0;
	public static void main(String[] args) {
		k=Integer.parseInt(takeInputforAValue("Enter the kth postion :"));
		int arr[]=getInputformUser();
		findKthMaxElement(arr);
		findKthMinElement(arr);
	}
// 6 5 4 3 2 1
	private static void findKthMinElement(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			if(i==k-1) {
				System.out.println("here is "+k+"th minimum element :"+arr[i]);
				break;
			}
		}
	}

	private static void findKthMaxElement(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			if(i==k-1) {
				System.out.println("here is our "+k+"th maximum element :"+arr[i]);
				break;
			}
		}
	}

}
