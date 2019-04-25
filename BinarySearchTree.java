package com.bridgeit.DataStructure;
/*
 * Program for Binary search tree
 */

import com.bridgeit.Utilpackage.Utility;

public class BinarySearchTree {
	static int factorial1=1;
	static int factorial2=1;
	static int factorial3=1;
	
	public static int factorial(int n) {
		for(int i=1;i<=n;i++) {
			factorial1=i*factorial1;
		}
		return factorial1;
	}
	public static int factorial1(int n) {
		int n1=2*n;
		for(int i=1;i<=n1;i++) {
			factorial2=i*factorial2;
		}
		return factorial2;
	}
	public static int factorial2(int n) {
		int n2=n+1;
		for(int i=1;i<=n2;i++) {
			factorial3=i*factorial3;
		}
		return factorial3;
	}
	public static void main(String[] args) {
		System.out.println("Enter  number: ");
		int num=Utility.getInteger();
		int value=(factorial1(num)/factorial2(num)*factorial(num));
		System.out.println(value+" trees can be created using "+num+" nodes");
	}	
}