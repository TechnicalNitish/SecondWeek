package Utility;

public class UtilityDequeue {
	static Dequeue front,rear;
	
		public static void	Enqueue(char[] stringArray)
		{
			for(int i=0;i<stringArray.length;i++)
			{
				Dequeue node=new Dequeue();
				if(front==null&&rear==null)
				{
					node.data=stringArray[i];
					node.prev=null;
					node.next=null;
					front=rear=node;
					
				}
				else {
					Dequeue current=front;
						while(current!=null)
						{
							
							
							current=current.next;
						}
						node.data=stringArray[i];
						node.prev=rear;
						node.next=null;
						rear.next=node;
						rear=node;
					
				}
			}
	
		}
		
		
		//Displaying Dequeue using Doubly linked list
		
		public static void DequeueDisplay()
		{
			Dequeue current=front;
			
			if(front==null&&rear==null)
			{
				System.out.println("Queue Is Empty:");
			}
			else {
				while(current!=rear)
				{
					System.out.println(current.data);
					current=current.next;
				}
				System.out.println(current.data);
			}
		}
		
		//palindrome checker of String
		
		public static void PalindromeChecker()
		{
			
			
			if(front==null&&rear==null)
			{
				System.out.println("Queue Is Empty");
			}
			else {
				Dequeue front1=front;
				Dequeue rear1=rear;
				boolean isPalindrome=false;
				while(front1!=rear1)
				{
					if(front1.data==rear1.data)
					{
						
						if(front1.next==rear1||rear1.prev==front1&&front1.next.data==rear1.data)
						{
							isPalindrome=true;
							
							break;
						}
						else {
							
						
								front1=front1.next;
								front1.prev=null;
								rear1=rear.prev;
								rear1.next=null;
						}
							
						
					}
					else {
						break;
					}
					
					
					
					front1=front1.next;
				}
				
				if(isPalindrome==true)
				{
					System.out.println("Is palindrome");
				}
				else {
					System.out.println("Not Palindrome:");
				}
				
				
				
			}
			
		}
		
		public static void dequeue()
		{
			Dequeue rear1=rear;
			
			if(rear==null||front==rear)
			{
				System.out.println("Is EMpty");
			}
			else
			{
				rear=rear.prev;
				front=front.next;
			}
		}
}
