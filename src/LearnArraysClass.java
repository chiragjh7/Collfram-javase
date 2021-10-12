import java.util.Arrays;

public class LearnArraysClass {
	public static void main(String[] args) {
		
//	int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//	int index = Arrays.binarySearch(nums, 4);
//	System.out.println("The index of element 4 in the array is " + index);
	
	 int arr[] = {10,2, 4, 3, 5};	
		
	 Arrays.sort(arr);
	
	 Arrays.fill(arr, 12);
	 
	 for(int i : arr)
		 System.out.println(i + " ");
		
		
		
		
	}
}
