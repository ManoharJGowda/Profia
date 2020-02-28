import java.util.Scanner;

class B
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=s.nextInt();
		int n=num;
		System.out.println("-------------------");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i>=j)
				{
					System.out.print(j+1);

				}
				else
				{
					System.out.print("  ");
				}
		 	}
	      System.out.println( );
	    }

	
}
	
}