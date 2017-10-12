package interview_programs;

import java.util.Scanner;

public class PerfectNumber {

	int n;
	void assign(int x){
		n=x;
	}
	String checkPerfectNumber(){
		int i,temp=0;
		for(i=1;i<=n/2;i++){
			if(n%i==0){
				temp=temp+i;
			}
		}
		if(temp==n){
			return n+" is a perfect number";
		}else{
			return n+" is not a perfect number";
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number :");
		int x=sc.nextInt();
		PerfectNumber pn=new PerfectNumber();
		pn.assign(x);
		String result=pn.checkPerfectNumber();
		System.out.println(result);
	}

}
