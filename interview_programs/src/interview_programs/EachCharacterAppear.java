package interview_programs;

import java.util.Scanner;

public class EachCharacterAppear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any string :");
		String str=sc.nextLine();
		//strings convert into characters
		char[]ch=str.toCharArray();
		int i,j,count=0;
		for(i=0;i<ch.length;i++){
			count=0;
			for(j=0;j<ch.length;j++){
				if(j<i && ch[i]==ch[j]){
					break;
				}
				if(ch[j]==ch[i]){
					++count;
				}
				if(j==ch.length-1){
					System.out.println("the character "+ch[i]+" is present "+count+" times");
				}
			}//end of j loop
		}//end of i loop

	}

}
