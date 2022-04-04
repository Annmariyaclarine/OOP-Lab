import java.util.*;
public class ComplexNumbers{
	double real;
	double img;
	ComplexNumbers(double r,double i){
		this.real=r;
		this.img=i;
	}
	ComplexNumbers(){}
	ComplexNumbers sum(ComplexNumbers c1,ComplexNumbers c2){
		ComplexNumbers temp=new ComplexNumbers();
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}
	public static void main(String args[]){
		double r1,r2,i1,i2;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the real part of first  num");
		r1=input.nextDouble();
		System.out.println("Enter the imaginary part of first  num");
		i1=input.nextDouble();
		System.out.println("Enter the real part of second  num");
		r2=input.nextDouble();
		System.out.println("Enter the imaginary part of second  num");
		i2=input.nextDouble();
		System.out.println("The first number is "+r1+" +i "+i1);
		System.out.println("The second number is "+r2+" +i "+i2);
		ComplexNumbers c1=new ComplexNumbers(r1,i1);
		ComplexNumbers c2=new ComplexNumbers(r2,i2);
		ComplexNumbers temp1=new ComplexNumbers();
		temp1=temp1.sum(c1,c2);
		System.out.println("Sum is "+temp1.real+"+ i "+temp1.img);
	}
}