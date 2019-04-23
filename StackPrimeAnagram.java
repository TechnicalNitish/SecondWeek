import java.util.Scanner;

import Utility.*;
public class StackPrimeAnagram {
	
	public static void main(String[] args) {
		
		
	int[] primeArray=UtilPrimeAnagram.PrimeNumber();
	int[] anagramArray=UtilPrimeAnagram.checkAnagram(primeArray);
		
	UtilPrimeAnagram.StackInput(anagramArray);
	System.out.println("-------------Displaying Stack----------");
	UtilPrimeAnagram.StackDisplay();
	}

}
