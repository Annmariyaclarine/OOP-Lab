package s2java;
import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		String s,t;
		Scanner inp=new Scanner(System.in);
		System.out.println("__string manipulations__");
		System.out.println("1.create string using new  2.getting string length  3.string concatenation  4.character extraction");
		System.out.println("5.string comparision 6.searching sub strings 7.modyifing a string 8.Exit ");
		while(true) {
			System.out.println("Enter the choice");
			ch=inp.nextInt();
			switch(ch) {
				case 1:System.out.println("Create string");
				System.out.println("enter string");
				String str=new String();
				str=inp.next();
				System.out.println("string is : "+str);
						
					break;
				case 2:System.out.println("String length");
					System.out.println("enter the string");
					s=inp.next();
					int Length=s.length();
					System.out.println("Length= "+Length);
					break;
				case 3:System.out.println("Concatenation");
					System.out.println("enter first the string");
					s=inp.next();
					System.out.println("enter second the string");
					t=inp.next();
					String c=s.concat(t);
					System.out.println("new string :"+c);
					break;
				case 4:System.out.println("Character extraction");
					System.out.println("enter the string");
					s=inp.next();
					System.out.println("enter the position from character is to be extracted");
					int a=inp.nextInt();
					a=a-1;
					char cha=s.charAt(a);
					a=a+1;
					System.out.println("character at position "+a+" "+cha);
					break;
				case 5:System.out.println("Compare 2 strings");
					System.out.println("enter first the string");
					s=inp.next();
					System.out.println("enter second the string");
					t=inp.next();
					boolean result=s.equals(t);
					System.out.println("The result is "+result);
				
					break;
				case 6:System.out.println("Searching substrings");
					String s1=new String();
					System.out.println("enter first the string");
					s1=inp.next();
					System.out.println("enter sub string to be searched");
					String a1=new String();
					a1=inp.next();
					int lastindex=s1.lastIndexOf(a1);
					int firstindex=s1.indexOf(a1,2);
					System.out.println("Last index "+lastindex +" and  First index"+firstindex);
					break;
				case 7:System.out.println("Modifying a string");
				   String s2=new String();
				   System.out.println("Enter string  ");
				   s2=inp.next();
				   System.out.println("Enter the part of string to be replaced");
				   String s4=new String();
				   s4=inp.next();
				   System.out.println("Enter string for replacing ");
				   String s5=new String();
				   s5=inp.next();
				   String replace_string=s2.replace(s4,s5);
				   System.out.println("The string after replace : "+replace_string);
					break;
					
				case 8:System.out.println("Exit");
					System.exit(0);
				default:System.out.println("Enter the correct choice");
			}
		}

	}
}
