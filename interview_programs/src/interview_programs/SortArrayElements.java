package interview_programs;

public class SortArrayElements {

	public static void main(String[] args) {
		int arr[]={13,2,6,1,10};
		int asc[]=SortArrayElements.toAscendingOrder(arr);
		System.out.println("ascending order of array");
		for(int i=0;i<asc.length;i++){
			System.out.print(asc[i]+" ");
		}

	}

	private static int[] toAscendingOrder(int[] array) {
		int swap;
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){
					swap=array[j];
					array[j]=array[j+1];
					array[j+1]=swap;
				}
			}
		}
		return array;
	}

}
