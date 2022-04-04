import java.util.*;
class Twoa{
  public static void main(String arg[]){
	int [][]a=new int [6][6];
	int [][]b=new int [6][6];
	int [][]sum=new int [6][6];
	int rows,columns,i,j;
	Scanner input=new Scanner(System.in);
		System.out.println("Enter No of rows");
		rows=input.nextInt();
		System.out.println("Enter No of columns");
		columns=input.nextInt();
		System.out.println("Enter the values of first matrix");
		for(i=0;i<rows;i++){
			for(j=0;j<columns;j++){
				a[i][j]=input.nextInt();
			}
		}
		System.out.println("Enter the values of second matrix");
		for(i=0;i<rows;i++){
			for(j=0;j<columns;j++){
				b[i][j]=input.nextInt();
			}
		}
		System.out.println("The first matrix is:");
		for(i=0;i<rows;i++){
			for(j=0;j<columns;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("The second matrix is:");
		for(i=0;i<rows;i++){
			for(j=0;j<columns;j++){
				System.out.print(b[i][j]+"\t");
			}
			System.out.print("\n");
		}
		for(i=0;i<rows;i++){
				for(j=0;j<columns;j++){
						sum[i][j]=a[i][j]+b[i][j];
				}
			
		}
		System.out.println("The resultant matrix is:");
		for(i=0;i<rows;i++){
			for(j=0;j<columns;j++){
				System.out.print(sum[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
		