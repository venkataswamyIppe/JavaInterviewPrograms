package interview_programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter a string:");
		String str=s.nextLine();
		StringBuffer sb1=new StringBuffer(str);
		StringBuffer sb2=new StringBuffer(sb1);
		sb1.reverse();
		System.out.println("given string :"+sb2);
		System.out.println("given reverse string :"+sb1);
		if(String.valueOf(sb1).compareTo(String.valueOf(sb2))==0){
			System.out.println("given string polindrome");
		}else{
			System.out.println("given string not polindrome");
		}
	}

}
