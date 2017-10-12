package interview_programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num, rem, temp, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		num = sc.nextInt();
		temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("given number is palindrome");
		} else {
			System.out.println("given number is not a palindrome");
		}
	}

}
