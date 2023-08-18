package com.operter;

public class MaxArray {

	public static void main(String[] args) {

	int arr[]= {1,2,3,8,6,9,4,6,9,589};
	
	int max= arr[0];    //1
	
	for(int i=1;i<arr.length;i++) {
		
		if(arr[i]>max) {     //8>3
			
			max=arr[i];    //   max=9
		}
	}
	System.out.println("Maximum number:"+max);
	}

}
