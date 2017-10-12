package interview_programs;

import java.util.Arrays;
import java.util.List;

public class ArrayOfStringToList {

	public static void main(String[] args) {
		String[]animails={"cat","fox","dog"};
		List<String>animailList= Arrays.asList(animails);
		for(String list:animailList){
			System.out.println(list);
		}
	}

}
