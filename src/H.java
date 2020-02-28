import java.util.Scanner;

class H
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=s.nextInt();

		int arr[]=new int[size];

		for(int i=0; i<size; i++)
		{
			System.out.println("Enter the value of Element" +(i+1));
			arr[i]=s.nextInt();
		}

		//For Lowest Number
		int min=0;
		for(int i=0; i<size; i++)
		{
			if(min>arr[i]);
			{
				min=arr[i];
			}
		}
		System.out.println("lowest number among all the elements is :" + min);
	}
}