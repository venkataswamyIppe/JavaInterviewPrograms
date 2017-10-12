package interview_programs;

import java.util.Scanner;

public class PrimeNumber {

	int n;
	void assign(int x){
		n=x;
	}
	String checkPrimeNumber(){
		int i;
		for(i=2;i<n;i++){
			if(n%i==0){
				break;
			}
		}
		if(n==i){
			return n+" is a prime number";
		}else{
			return n+" is not a prime number";
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number :");
		int x=sc.nextInt();
		PrimeNumber pn=new PrimeNumber();
		pn.assign(x);
		String result=pn.checkPrimeNumber();
		System.out.println(result);
	}

}
