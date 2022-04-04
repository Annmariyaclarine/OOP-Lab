class Second{
	int a;
	int b;
	void set(int a1,int b1){
		a=a1;
		b=b1;
	}
	void get(){
		System.out.println("a="+a+" b="+b);
	}
}
class FirstClass{
	public static void main(String arg[]){
		Second sd=new Second();
		sd.set(5,10);
		sd.get();
	}
}