import java.util.Arrays;
import java.util.Scanner;

import Utility.*;
public class PrimeAndAnagram2d {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter range : ");
		int range = sc.nextInt();
		int[] primeno = new int[range];
		primeno=UtilPrimeAnagram.PrimeNumber();
		int[] anagram = UtilPrimeAnagram.checkAnagram(primeno);		
		UtilPrimeAnagram.twoDPrimeAnagram(anagram);
		sc.close(); 
		
	}
	
	

}
