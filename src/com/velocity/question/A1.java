package com.velocity.question;


import java.util.Scanner;

//printing element in array using scanner class 
public class A1 {
//	public static int getarray(int n) {
//		Scanner scn = new Scanner(System.in);
//		
//		int arr []=new int[n];                                  //int arr[] = new int[10]
//		
//		for (int i=0; i<n;i++ ) {
//			System.out.print("enter the 10 element >> ");
//			 arr[i]=scn.nextInt();
//			
//		}
//		
//		for (int i=0; i<=arr.length;i++ ) {
//			System.out.println(arr[i]);
//			
//		}
//		
//		return n;
		
//}
public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	System.out.println("enter the size of array");
	int n =scn.nextInt();
	int arr []=new int[n];
	
	for (int i=0; i<arr.length;i++ ) {                      // 0 1 2 3 4 
		System.out.print("enter the  element >> ");        //   1 2 3 4 5
		arr[i]=scn.nextInt();
		}

	for (int i=0; i<arr.length;i++ ) {
		System.out.println(arr[i]);
	}
	
	
}

}
