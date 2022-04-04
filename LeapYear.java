class LeapYear
{
	public static void main(String arg[])
	{
		int year;
		year=2004;
		System.out.println("Year: "+year);
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("Leap year");
				}
				else
				{
					System.out.println("Not Leap year");
				}	
			}
			else
			{
				System.out.println("Leap year");
			}
		}
		else
		{
			System.out.println("Not leap year");
		}
	}
}
	