package com.dustbeen.prep.array;

import com.dustbeen.prep.util.BaseCode;

public class FindMaxMin extends BaseCode {

	public static void main(String[] args) {
		int arr[] = getInputformUser();
		printTwoValues("max value is :", "min value is :", findMax(arr), findMin(arr));
	}

	private static String findMin(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int min = 0;
		int minFinal = 0;
		minFinal = arr[start];
		for (int i = 0; i < arr.length / 2; i++) {

			int temp = arr[start];
			int tempEnd = arr[end];
			if (temp > tempEnd) {
				min = temp;
				if (minFinal > min) {
					minFinal = min;
				}
			} else {
				min = temp;
				if (minFinal > min) {
					minFinal = min;
				}
			}
			start++;
			end--;
		}
		return String.valueOf(minFinal);

	}

	private static String findMax(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int max = 0;
		int maxFinal = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[start];
			int tempEnd = arr[end];
			if (temp < tempEnd) {
				max = tempEnd;
				if (maxFinal < max) {
					maxFinal = max;
				}
			} else {
				max = temp;
				if (maxFinal < max) {
					maxFinal = max;
				}
			}
			start++;
			end--;
		}
		return String.valueOf(maxFinal);
	}

}
