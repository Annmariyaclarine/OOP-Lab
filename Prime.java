class Prime
{
	public static void main(String arg[])
	{
		int num,i,f;
		num=14;
		f=0;
		System.out.println("Num:"+num);
		if(num>0)
		{
			if(num==2)
			{
				f=0;
			}
			else
			{
				for(i=2;i<num;i++)
				{
					if(num%i==0)
					{
						f=1;
						break;
					}
				}
			}
			if(f==1)
			{
				System.out.println("not prime");
			}
			else if(f==0)
			{
				System.out.println("prime");
			}
		}
	}
}