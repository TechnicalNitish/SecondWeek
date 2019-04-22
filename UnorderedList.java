import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UnorderedList {
		static Node head;
	public static void main(String[] args) throws FileNotFoundException {
		
		File f=new File("file.txt");
		Scanner sc= new Scanner(f);
			
			
			while(sc.hasNext())
			{
				String s=sc.next();
				insert(s);
			}
			System.out.println("Printing the Files Word");
			show();
			removeAndsearch();
			show();
			
			
	}
	
	public static <T>void insert(T s2)
	{
		
		Node node=new Node();
		
		
			if(head==null)
			{
				node.data=s2;
				node.next=null;
				head=node;
			}
			else
			{
				Node current=head;
				while(current.next!=null)
				{
					current=current.next;
				}
				
				node.data=s2;
				node.next=null;
				current.next=node;
			}
		
	}
	
	public static void show() {
		Node current=head;
		
		if(head==null)
		{
			System.out.println("Empty No any Value is inserted");
		}
		else
		{
			while(current.next!=null)
			{
				System.out.println(current.data);
				current=current.next;
			}
			System.out.println(current.data);
		}
	}
	
	public static void removeAndsearch()
	{
		System.out.println("Enter a value TO search and Remove");
		Scanner in=new Scanner(System.in);
		String search=in.nextLine();
		Node nd=new Node();
		Node current=head,current1=head,current2=head;
		int count=0;
		if(head==null)
		{
			System.out.println("Is Empty");
		}
		else {
			while(current.next!=null)
			{
				if(current.data.equals(search))
				{
					count++;
					System.out.println("Is Found and deleted");
					if(head.data.equals(search))
					{
						head=nd.next;
					}
					else {
						while(current2.next!=null)
						{
							if(current2.data==search)
							{
								current2.next=current.next.next;
							}
						}
						current2=current2.next;
					}
				
					break;
				}
				current=current.next;
			}
			
			if(count==0)
			{
				System.out.println("Not Found Now We are Adding");
				while(current1.next!=null)
				{
					current1=current1.next;
				}
				nd.data=search;
				nd.next=null;
				current1.next=nd;
			}
			
		}
	}
	

}
