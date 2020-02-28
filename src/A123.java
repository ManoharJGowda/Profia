class A123
{
	public static void test(Object a)
	{
		System.out.println("From Test Object:" + a );
	}

	public static void test(int a)
	{
		System.out.println("From Test int :" + a);
	}

	public static void test(double a)
	{
		System.out.println("From Test double :" + a);
	}

	public static void test(float a)
	{
		System.out.println("From Test float :" + a);
	}

	public static void test(char ch)
	{
		System.out.println("From Test char :" + ch);
	}

	public static void test(boolean a)
	{
		System.out.println("From Test boolean :" + a);
	}


	public static void test(Integer a)
	{
		System.out.println("From Test Integer :" + a);
	}

	public static void test(Double a)
	{
		System.out.println("From Test Double :" + a);
	}

	public static void test(Float a)
	{
		System.out.println("From Test Float :" + a);
	}

	

	public static void test(Boolean a)
	{
		System.out.println("From Test Boolean :" + a);
	}


	public static void main(String[] args)
	{
		System.out.println("From main");
		System.out.println("-------------------");
		test();

	}

}