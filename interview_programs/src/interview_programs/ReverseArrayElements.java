package interview_programs;

public class ReverseArrayElements {

	public static void main(String[] args) {
		int[] numbers={2,5,1,8,7};
		System.out.println("before reverse array");
		for(int i=0;i<numbers.length;i++){
			System.out.print(numbers[i]+" ");
		}
		for(int j=0;j<numbers.length/2;j++){
			int temp=numbers[j];
			numbers[j]=numbers[numbers.length-1-j];
			numbers[numbers.length-1-j]=temp;
		}
		System.out.println("after reverse array");
		for(int i=0;i<numbers.length;i++){
			System.out.print(numbers[i]+" ");
		}
	}

}
