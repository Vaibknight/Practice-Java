package vaibhav;

import java.util.*;

public class Practice {
	
	
	
	
	public static int binSearch(int arr[],int key) {
		int start = 0;
		int end = arr.length-1;
		while (start <= end) {
			int mid = (start + end)/2;
			
			if(arr[mid] == key) {
				return mid;
			}else if(arr[start]< arr[mid]) {
				if(key > arr[start] && key < arr[mid]) {
					end = mid-1;
				}
				else {
					start = mid +1;
				}
			}else {
				if(key > arr[mid] && key < arr[end]) {
					start = mid +1;
				}
				else {
					end = mid-1;
				}
			}
		}
		return -1;
	}
	
	public static void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,6,7,0,1,2};
		
		System.out.print(binSearch(arr,1));
		
		
	}

}
