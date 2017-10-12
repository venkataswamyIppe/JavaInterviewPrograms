package interview_programs;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int num, rem, temp,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		num = sc.nextInt();
		temp=num;
		while (num > 0) {
			rem = num % 10;
			sum = sum  + (rem*rem*rem);
			num = num / 10;
		}
		if(temp==sum){
			System.out.println("given number is armstrong number");
		}else{
			System.out.println("given number is not armstrong number");
		}

	}

}
