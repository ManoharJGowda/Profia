import java.util.Scanner ;

class Average
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a size of an array");
		int size = s.nextInt();
		//create an array
		int[] a=new int[size];

		//generate and assign values
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter the elements:" + (i+1));
			a[i]=s.nextInt();
		}

		//to find average of a numbers
		int sum=0;
		for(int i=0; i<size; i++)
		{
			sum=sum+a[i] ;
		}
		System.out.println("---------------------------------------");
		System.out.println("Sum of All The numbers is :" + sum);
		System.out.println("---------------------------------------");
		System.out.println("Average =" + sum/size);
		System.out.println("---------------------------------------");

	}
}