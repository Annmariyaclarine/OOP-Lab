class Armstrong
{
	public static void main(String arg[])
	{
		int num,s,r,rs,temp1,temp2;
		num=150;
		temp1=temp2=num;
		s=0;
		double p;
		System.out.println("Number="+num);
		while(num!=0)
		{
			s=s+1;
			num=num/10;
		}
		System.out.println("digits="+s);
		rs=0;
		
		while(temp2!=0)
		{
			r=temp2%10;
			p=Math.pow(r,s);
			int intp=(int) p;
			rs=rs+intp;
			temp2=temp2/10;
		}
		if(rs==temp1)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not armstrong");
		}
	}
}