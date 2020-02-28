import java.util.Scanner ;

class Fact
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
		int fact=1;
		for(int i=1; i<=a[i]; i++)
		{
		
			fact=fact*(a[i]) ;
			
		}
		System.out.println("Factorial of a number is"  + fact );

		/*System.out.println("---------------------------------------");
		System.out.println("Sum of All The numbers is :" + sum);
		System.out.println("---------------------------------------");
		System.out.println("Average =" + sum/size);
		System.out.println("---------------------------------------");*/

	}
}