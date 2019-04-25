import java.util.Scanner;

import Utility.BankQueue;
import Utility.Bankqueue;

public class BankingCashCounter {
			
	public static void main(String[] args) {
		int choice;
		int bankBalance=100000;
		Scanner in=new Scanner(System.in);
		
		System.out.println("How many Person want to add:");
		int person=in.nextInt();
		Bankqueue.Addperson(person);
		Bankqueue.queueShow();
		System.out.println("\nSelect from following choice:");
		do {
			
			System.out.println("\n1.Deposite Cash\n2.Withdraw Cash\n3.Exit");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
						boolean deposite=Bankqueue.deleteQueue();
							if(deposite==true)
							{
								System.out.println("Welcome Deposite to Cash Counter ");
								System.out.println("How Much cash You Want to Add:");
								int cash=sc.nextInt();
								bankBalance +=cash;
								
							}
							else {
								System.out.println("\nkripya Mahasay pankatti me aaye :)");
							}
						break;
				case 2:
						boolean withdraw=Bankqueue.deleteQueue();
							if(withdraw==true)
							{
								System.out.println("Welcome Aap kitna Rokada Nikale chahte hai");
								int cash=sc.nextInt();
								if(bankBalance>=cash)
								bankBalance-=cash;
								else
									System.out.println("Maaf Kare ^^\n Rokada Available Nahi hai ");
								
							}else {
								System.out.println("Kripya pahle Line me aaye :)");
							}
					
								break;
				case 3:System.out.println("Dhnyawad Dubara Mile:");
						break;
				default: System.out.println("\nEnter valid choice:");
					
			}
		}while(choice!=3);
	}

}
