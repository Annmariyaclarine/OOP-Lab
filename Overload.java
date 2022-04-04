class Abc{
	int x;
	int y;
	Abc(){
		x=5;
		y=10;

	}
	Abc(int x,int y){
		this.x=x;
		this.y=y;
	}
	void display(){
		System.out.println("x="+x+" y="+y);
	}
}
class Overload{
	public static void main(String arg[]){
		Abc a1=new Abc();
		Abc a2=new Abc(2,3);
		a1.display();
		a2.display();
	}
}