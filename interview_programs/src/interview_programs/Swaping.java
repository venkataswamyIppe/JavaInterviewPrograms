package interview_programs;

import java.util.Scanner;

public class Swaping {
	int a;
	int b;

	void assign(int x, int y) {
		a = x;
		b = y;
	}

	void swap() {
		a=a+b;
		b=a-b;
		a = a-b;
	}

	void display() {
		System.out.println("a value:" + a);
		System.out.println("b value:" + b);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a value :");
		int x = s.nextInt();
		System.out.print("Enter b value :");
		int y = s.nextInt();
		Swaping sp = new Swaping();
		sp.assign(x, y);
		sp.swap();
		sp.display();
	}

}
