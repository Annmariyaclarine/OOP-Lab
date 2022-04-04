class Primealt
{
	public static void main(String arg[])
	{
		int i,j,f,count;
		
		System.out.println("Alternate Prime num between 1 to 100");
		count=0;
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
				
				count=count+1;
				if(count%2!=0)
				{
					System.out.println(i+" ");
				}	
			}
		}
	}
}