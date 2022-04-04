import java.util.*;
class MulCho{
	public static void main(String args[]){
		char [][] test={
			{'d','b','a','c','b'},
			{'a','b','c','a','a'},
			{'b','b','c','a','b'},
			{'d','d','a','c','b'},
			{'d','c','b','a','a'}
		};
		char key[]={'d','c','b','a','b'};
		int i,j;
		int correctans=0;
		for(i=0;i<test.length;i++){
			for(j=0;j<test[i].length;j++){
				if(test[i][j]==key[j]){
					correctans=correctans+1;
				}
			}
		System.out.println("Score of student"+(i+1)+" is "+correctans);
		correctans=0;
		}
	}
}