import java.util.Scanner;

class Fact2
{
	public static void main(String[] args)
	{
		long n, fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Entter a number");
		long num=s.nextLong();
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}