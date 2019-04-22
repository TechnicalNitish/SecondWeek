import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OrderList {
	static Node1 head;
	static int count=0;

	public static void main(String[] args) throws FileNotFoundException {
		
		

		File f=new File("abc.txt");
		Scanner sc=new Scanner(f);
		
		while(sc.hasNextInt())
		{
			int n=sc.nextInt();
			count++;
			insert(n);
			
		}
		System.out.println("Before Sorting:");
			show();
			
			sortLinkedList();
			System.out.println("After Sorting:");
			show();
			searchAndAdd();
			show();
	}
	public static void insert(int n)
	{
		Node1 newNode=new Node1();
		if(head==null)
		{
			newNode.data=n;
			newNode.next=null;
			head=newNode;
		}
		else
		{
			Node1 current=head;
			while(current.next!=null)
			{
				current=current.next;
			}
			newNode.data=n;
			newNode.next=null;
			current.next=newNode;
		}
	}
	
	
	public static void show()
	{
		Node1 current=head;
		if(head==null)
		{
			System.out.println("Empty any Node available");
		}
		
		else
		{
			while(current!=null)
			{
				System.out.println(current.data);
				current=current.next;
			}
			
		}
			
	}
	
	
	public static void sortLinkedList()
	{
	     Node1 current = head;
	     Node1 tail = null;
	     while(current != null&& tail != head )
	     {
	       Node1 next = current;
	      for( ; next.next != tail;  next = next.next)
	    {
	    if(next.data >= next.next.data)
	        {
	        int temp = next.data;
	        next.data = next.next.data;
	            next.next.data = temp;
	        }
	    }
	    tail = next;
	   current = head;
	  }
	}
	
	public static void searchAndAdd()
	{
		System.out.println("Enter value to search:");
		Scanner in=new Scanner(System.in);
		int search=in.nextInt();
		
		Node1 current=head;
		int c=0;
		if(head.data==search)
		{
			head=current.next;
			c=1;
		}
		else{
			
		
			while(current!=null)
			{
				if(current.next.data==search)
				{
					
					
					current.next=current.next.next;
					c=1;
					break;
				}
				current=current.next;
			}
		}
		
		if(c==1)
		{
			System.out.println("Is Found And Deleted:");
		}
		else
		{
			Node1 newNode=new Node1();
			if(head.data<=search)
			{
				newNode.data=search;
				newNode.next=head;
				head=newNode;
			}
			while(current.next!=null)
			{
				if(current.next.data<=search)
				{
				
				
					newNode.data=search;
					newNode.next=current.next;
					current.next=newNode;
					System.out.println("IS added");
				}
				current=current.next;
			}
		}
	}

}
