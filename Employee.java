package s2java;

import java.util.*;

class Employeeinfo{
	int eNo;
	String eName;
	int eSalary;
	public void input()
	{
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter employee name");
		this.eName=inp.nextLine();
		System.out.println("Enter employee number");
		this.eNo=inp.nextInt();
		System.out.println("Enter employee salary");
		this.eSalary=inp.nextInt();
	}
	void display(){
		System.out.println("employee number: "+eNo);
		System.out.println("employee name: "+eName);
		System.out.println("employee salary: "+eSalary);
	}

}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=inp.nextInt();
		Employeeinfo e[]=new Employeeinfo[n];
		for(int i=0;i<n;i++)
		{
			e[i]=new Employeeinfo();
			e[i].input();
			System.out.print("\n");
		}
		System.out.println("__Display__");
		for(int i=0;i<n;i++)
		{
			e[i].display();
			System.out.print("\n");
		}
		System.out.println("Enter the employee number of employee to be searched");
		int empnum=inp.nextInt();
		int f=1;
		for(int i=0;i<n;i++)
		{
			if(e[i].eNo==empnum)
			{
				e[i].display();
				System.out.print("\n");
				f=0;
			}
			
		}
		if(f==1) {
			System.out.println("No employee of employee number "+empnum+" is found");
		}
	}

}
