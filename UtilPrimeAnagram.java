package Utility;

import java.util.Arrays;

public class UtilPrimeAnagram {
	static stack top;
	static Queue front,rear;
	public static int[] PrimeNumber() 
	{
		int range=1000;
		boolean isPrime = true;
		int count = 0;
		int primeno[]=new int[range];		   
		for (int i = 0; i <=range; i++)         
		{ 		  
			for(int j=2; j<i ;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
				else 	
					isPrime=true;
			}
			if(isPrime==true)
				primeno[count++]=i;
		}
		
		return primeno ;		     
}
	

	
	
	
	public static int[] checkAnagram(int[] primenumber)
	{
		System.out.println("\nThe prime number which are Anagram:");
		int anagram = 0;
		int[] anagramArray = new int[primenumber.length]; 
		for (int  i = 0; i < primenumber.length; i++)
		{
			for (int j = 0; j < primenumber.length; j++)
			{
				if(primenumber[i]>0 && primenumber[j]>0 && primenumber[i]!=primenumber[j])
				{     
					String string1 = Integer.toString(primenumber[i]);
					String string2 = Integer.toString(primenumber[j]);
					anagram=checkPrimeAnagram(string1, string2);
					if(anagram>0)
					{
						anagramArray[i] = anagram;
						
					}
				}
			}
		}
		return anagramArray;				        
	}
	
	
	
	
	
	
	
	private static int checkPrimeAnagram(String string1, String string2)
	{
		int anagram =0 ;
		char[] ch1 = string1.toCharArray();
		char[] ch2 = string2.toCharArray();
		boolean result=false;
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		result = Arrays.equals(ch1,ch2);
		if(result==true)
		{
			anagram = Integer.parseInt(string1);
			 
			return anagram;
		}
		return anagram;		
	}
	
	
	
	
	public static void twoDPrimeAnagram(int[] anagram)
	{
		int row = 20 ,column = 26;
		int[][] anagramArray = new int[row][column];
		int temp = 100 , k=0;
		for(int i = 0 ;i<row; i++)
		{
			for(int j= 0 ; j<column ; j++)
			{
				if(k<anagram.length )
				{
					if(anagram[k] <= temp )
					{
						anagramArray[i][j] = anagram[k];
						k = k+1;
					}
				} 
			} 	
			temp = temp + 100;
		}

		System.out.println("");
		for(int i = 0 ;i<row ; i++)
		{
			for(int j= 0 ; j<column ; j++)
			{
				if(anagram[j]>0)
				{
					//printing prime anagram numbers in 2D array
					if(anagramArray[i][j] != 0)
					{
						System.out.print(anagramArray[i][j]+"\t");
					}
				}
			}
			System.out.println();
		}
	}
	
	public static void StackInput(int[] anagramArray)
	{
		
		for(int i=0;i<anagramArray.length;i++)
		{
			stack node=new stack();
			if(top==null)
			{
				node.data=anagramArray[i];
				node.next=null;
				top=node;
			}
			else
			{
				node.data=anagramArray[i];
				node.next=top;
				top=node;
			}
		}
	}
	
	//Stack Display Method
	public static void StackDisplay()
	{
		int p=0;
		stack current=top;
		if(top==null)
		{
			System.out.println("Stack is empty");
		}
		else {
				while(current!=null)
				{
					if(current.data==0)
					{
						p++;
					}
					else {
					System.out.println(current.data);
					}
					current=current.next;
				}
		}
	}
	
	//queue insert method 
	public static void Queueinsert(int[] primeArray)
	{
		
		for(int i=0;i<primeArray.length;i++)
		{
			Queue node=new Queue();
			if(front==null&&rear==null)
			{
				node.data=primeArray[i];
				node.next=null;
				front=rear=node;
			}
			else {
				node.data=primeArray[i];
				node.next=null;
				rear.next=node;
				rear=node;
			}
		}
	}
	
	
	//Displaying Queue 
	
	public static void QueueDisplay()
	{
		
		if(front==null&&rear==null)
		{
			System.out.println("Queue Is Empty:");
		}
		else {
				Queue current=front;
				while(current!=rear)
				{
					if(current.data!=0)
					{
						System.out.println(current.data);
					}
					current=current.next;
				}
		}
		
	}
	
	
	
	
	
}
