class C1  
{
	public static void main(String[] args) 
	{
		System.out.println( "reference : " + args );
		System.out.println( "length of array : " + args.length );
		System.out.println("Array Elements : ") ;
		for ( int i = 0 ; i < args.length ; i++  )
		{
			System.out.println( args[i] ) ;
		}
		int max=0;
		for(int i=0; i<args.length; i++)
		{
			if(max<(args))
			{
				max=(args);
			}
		}
		System.out.println(max);
	}
}