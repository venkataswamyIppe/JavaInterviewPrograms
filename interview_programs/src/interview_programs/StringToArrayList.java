package interview_programs;

import java.util.Arrays;
import java.util.List;

public class StringToArrayList {

	public static void main(String[] args) {
		String num="1,2,3,4,5";
		String values[]=num.split(",");
		List<String>list=Arrays.asList(values);
		for(String str:list){
			System.out.println(str);
		}
		
	}

}
