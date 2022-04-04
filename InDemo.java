import java.util.Scanner;
class InDemo{
	public static void main(String arg[])
	{
		int a,b;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter num 1");
		a=input.nextInt();
		System.out.println("Enter num 2");
		b=input.nextInt();
		System.out.println("Sum="+(a+b));
	}
}