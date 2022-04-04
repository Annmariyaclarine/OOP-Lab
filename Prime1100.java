class Prime1100
{
	public static void main(String arg[])
	{
		int i,j,f;
		
		System.out.println("Prime num between 1 to 100");
		for(i=1;i<101;i++)
		{
			f=0;
			for(j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					f=f+1;
				}
			}
			if(f==2)
			{
				System.out.println(i+" ");
			}
		}
	}
}