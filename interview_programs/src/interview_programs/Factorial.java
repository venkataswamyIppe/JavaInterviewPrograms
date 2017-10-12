package interview_programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter which number factorial do you want :");
		int x=sc.nextInt();
		int result=factorial(x);
		System.out.println("factorial value :"+result);
	}
	static int factorial(int number){
		int result=1;
		while(number>0){
			result=result*number;
			number=number-1;
		}
		return result;
	}

}
