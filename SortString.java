package s2java;
import java.util.Scanner;
import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch,n,i,j;
		Scanner inp=new Scanner(System.in);
		System.out.println("enter the size of array");
		n=inp.nextInt();
		System.out.println("enter values");
		String[] arr=new String[n];
		for(i=0;i<n;i++) {
			arr[i]=inp.next();
		}
		System.out.println("1.Using Array Sort function 2.Using Comparision 3.Exit");
		
		while(true) {
			System.out.println("Enter the choice");
			ch=inp.nextInt();
			switch(ch) {
				case 1:System.out.println("Sorted string after Array sort function");
						Arrays.sort(arr);
						System.out.print(Arrays.toString(arr));
					break;
				case 2:System.out.println("Sorted string after Comparision");
				String	temp=new String();
					for(i=0;i<n;i++) {
						for(j=i+1;j<n;j++) {
							if(arr[i].compareTo(arr[j])>0) {
							temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
							}
						}
					}
					for(i=0;i<n;i++) {
							System.out.print(arr[i]+",");
						}
					System.out.println(" ");
					break;
				case 3:System.out.println("Exit");
					System.exit(0);
				default:System.out.println("Enter the correct choice");
			}
		}

	}
}
