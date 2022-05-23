package s2java;

public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
a=10;
b=6;
c=6;
int d;
try {
	d=a/(b-c);
}
catch(ArithmeticException e) {
	System.out.println("exception "+e);
	c=c-1;
	
}
System.out.println("value of c="+c);
	}

}
