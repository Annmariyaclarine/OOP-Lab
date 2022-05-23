package s2java;

public class exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int [] a=new int[-5];
		}
		catch(NegativeArraySizeException e) {
			System.out.println("exception "+e);
		}
	}

}
