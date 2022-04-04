class Test{
	//static variable
	static int max=10;
	//non static variable
	int min=5;
}
public class Main{
	public static void main(String arg[]){
		Test obj=new Test();
		//accessing non static variable
		System.out.println("min+1= "+(obj.min+1));
		//accessing static variable
		System.out.println("max+1= "+(Test.max+1));
	}
}