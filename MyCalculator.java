class MyCalculator
{
	public static void main(String arg[])
	{
		int a=11;
		int b=2;
		int sum,diff,prod,quot,rem;
		float quot1;
		System.out.println("The first num="+a);
		System.out.println("The second num="+b);
		sum=a+b;
		diff=a-b;
		prod=a*b;
		quot=a/b;
		quot1=(float)a/(float)b;
		rem=a%b;
		System.out.println("The sum="+sum);
		System.out.println("The difference="+diff);
		System.out.println("The product="+prod);
		System.out.println("The Quoti="+quot);
		System.out.println("The Quotient ="+quot1);
		System.out.println("The Remaind="+rem);
	}
}