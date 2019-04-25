import java.util.Scanner;

import Utility.UtilityDequeue;

public class DequeuePalindromeChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nEnter String to Check Palindrome:");
		String str=sc.nextLine();
		
		char[] stringArray=str.toCharArray();
		
		UtilityDequeue.Enqueue(stringArray);
		
		System.out.println("Displaying Queue");
		UtilityDequeue.DequeueDisplay();
		
		UtilityDequeue.PalindromeChecker();
			
	}

}
