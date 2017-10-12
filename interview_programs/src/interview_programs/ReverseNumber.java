package interview_programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num,rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		num=sc.nextInt();
		while(num>0){
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		System.out.println("reverse of the given number :"+sum);

	}

}
