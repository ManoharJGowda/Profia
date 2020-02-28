class C3
{
	public static void test(char ch , int... a)
	{
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args)
	{
		test('g' ,10 );
		test('b' ,2 ,34, 45, 67, 34 );
		test('a' ,24, 67, 67, 89 );
	}
}