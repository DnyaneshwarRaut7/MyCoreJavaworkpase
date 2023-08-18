package com.operter;

public class MinArray {
	
	public static void main(String[] args) {

		int arr[]= {11 ,2,3,8,6,9,4,6,9,589};
		
		int min= arr[0];    //1
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]<min) {     //8>3
				
				min=arr[i];    //   max=9
			}
		}
		System.out.println("Maximum number:"+min);
		}


}
