import java.util.Scanner ;

class Fact1
{
	public static void main(String[] args)
	{
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		int fact=1;
		for(int i=1; i<=num; i++ )
		{
			fact=fact*i;
		}
		System.out.println("Factorial of a number" + num + "is: " + fact);
	}
}