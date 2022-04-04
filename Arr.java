import java.util.*;
class Arr{
	public static void main(String arg[]){
		int [] a=new int[10];
		
		Scanner inp=new Scanner(System.in);
		System.out.println("no of elements in array");
		int n=inp.nextInt();
		for(int i=0;i<n;i++){
			a[i]=inp.nextInt();
			}
		System.out.println("elements in array is");
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
			}
	}
}