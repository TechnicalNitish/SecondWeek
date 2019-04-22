

public class PrimrRange2d {
	static int arr[][]=new int[10][28];
	
	public static void main(String[] args) {
		int range=0;
		int s=1;
		int tempLowRange=0;
		int tempHighRange=0;
	
		
		int row=0;
		int col;
	
		
		while(range<1000)
		{
			tempHighRange=(1000/10)*s;
			col=0;
			for(int i=tempLowRange;i<=tempHighRange;i++)
			{
				
				int c=0;
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						c=1;
					}
				}
				if(c==0)
				{
					
					arr[row][col]=i;
					
					
					  col++;
				
				}
				
				
			}
			
			row=row+1;
			tempLowRange=(1000/10)*s;
			range=tempLowRange;
			s=s+1;
			
		}
		System.out.println("Dispalying Prime in Range And Stored in 2d Array");
		for(int k=0;k<10;k++)
		{
			for(int l=0;l<28;l++)
			{
				System.out.print(" "+arr[k][l]);
			}
			System.out.println();
		}
		
		
		

	}

}
