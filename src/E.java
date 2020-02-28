import java.util.Scanner; //size of an array  , elements of an array , display all elements of an the array 

class E
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Size Of an array");
		int size=s.nextInt();
		//create integer array
			int[] a=new int[size];
		//read the value
			System.out.println("Enter the values");
			for(int i=0; i<a.length; i++)
			{
				System.out.println("Enter element" + (i+1));
				a[i]=s.nextInt();
			}
			//display elements
			for(int i=0; i<a.length; i++)
			{
				System.out.println(a[i]);
			}
		
	}
}