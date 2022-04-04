import java.util.*;
class Product{
	int pcode;
	String pname;
	int price;
	Product(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter name of product");
		this.pname=input.nextLine();
		System.out.println("Enter code of product");
		this.pcode=input.nextInt();
		System.out.println("Enter price of product");
		this.price=input.nextInt();
	}

	void display(){
		System.out.println("product name: "+pname);
		System.out.println("product code: "+pcode);
		System.out.println("product price: "+price);
	}
		
		
}
class Onea{
	public static void main(String arg[]){
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		System.out.println("__Displaying the details of products__");
		p1.display();
		p2.display();
		p3.display();
		if((p1.price<=p2.price)&&(p1.price<=p3.price)){
			System.out.println(p1.pname+" with product code "+p1.pcode+" has the lowest price");
		}else if((p2.price<=p1.price)&&(p2.price<=p3.price)){
			System.out.println(p2.pname+" with product code "+p2.pcode+" has the lowest price");
		}else if((p3.price<=p1.price)&&(p3.price<=p2.price)){
			System.out.println(p3.pname+" with product code "+p3.pcode+" has the lowest price");
		}else{
			System.out.println("Enter the correct prices");
		}
	}
}