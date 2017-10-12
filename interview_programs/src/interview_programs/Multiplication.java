package interview_programs;

import java.util.Scanner;

public class Multiplication {
	int n;
	void assign(int x){
		n=x;
	}
	void table(){
		for(int i=1;i<=10;i++){
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter which number table you want :");
		int x=s.nextInt();
		Multiplication m=new Multiplication();
		m.assign(x);
		m.table();
	}
}
