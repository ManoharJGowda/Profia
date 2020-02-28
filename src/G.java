import java.util.Scanner; //maximum value among all the elements

class G
{
	public static void main(String[] args)
	{
		int max=0;
		Scanner s=new Scanner(System.in);
		//input for user
		System.out.println("Enter the size of an array");
		int size=s.nextInt();
		//create an arraay
		int[] arr=new int[size];
		//assign values
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter value of Element:" +(i+1));
			arr[i]=s.nextInt();
		}

		for(int i=0; i<size; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum value is:" + max);

	}
}