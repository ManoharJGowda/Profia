import java.util.Scanner;

class D
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=s.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter the value");
		int max=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter The elements:" + (i+1));
			arr[i]=s.nextInt();
			if(max>arr[0])
			{
				continue;
		     }
		 }
	        return max;
		System.out.println(arr[i]);
		

	}
}