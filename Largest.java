class Largest
{
	public static void main(String arg[])
	{
		int a,b,c;
		a=15;
		b=6;
		c=21;
		System.out.println("a="+a+" b="+b+" c="+c);
		if((a>b)&&(a>c))
		{
			System.out.println(a+" is largest");
		}
		else if((b>a)&&(b>c))
		{
			System.out.println(b+" is largest");
		}
		else if((c>a)&&(c>b))
		{
			System.out.println(c+" is largest");
		}
	}
}