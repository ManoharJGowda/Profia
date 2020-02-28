class C2
{
	public static void main(String[] args)
	{
		if(args.length==0)
		{
			System.out.println("Pass Some Values");
		}
		else if(args.length>2 || args.length<2)
		{
			System.out.println("This is designed for only 2 values");
		}
		else
		{
			int a,b;
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			int res=a+b;
			System.out.println( a  + "+" + b  + "=" + res );
		}
	}
}