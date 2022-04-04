class A{
	int a;
	int b;
	int area(int a){
		this.a=a;
		return(a*a);
	}
	int area(int a,int b){
		this.a=a;
		this.b=b;
		return(a*b);
	}
}
class Abc{
	public static void main(String arg[]){
		A cal=new A();
		System.out.println("area of square"+cal.area(10));
		System.out.println("area of rectangle"+cal.area(5,3));
	}
}