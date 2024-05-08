package strings;

import java.util.Arrays;
import java.util.List;

public class SwapAdjacentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inputArray = {1,2,3,4,5,6,7,8};//		Output :- {2,1,4,3,6,5,8,7}
		
		 System.out.println("Input Array: " + Arrays.toString(inputArray));
		
		 //int[] outputArray = swapAdjacentElements(inputArray);
		 int[] outputArray1 = swapAdjacentElement1(inputArray);
		 
		
		 
		
	     System.out.println("Output Array: " + Arrays.toString(outputArray1));
	 
	}
	
	 private static int[] swapAdjacentElement1(int[] arr) {
		// TODO Auto-generated method stub
		 
		 for(int i=0;i<arr.length; i+=2) {
			 int tmp = arr[i];
			 arr[i] = arr[i+1];
			 arr[i+1] = tmp;
			 
			 
		 }
		return arr;
	}

	public static int[] swapAdjacentElements(int[] array) {
	        // Check if the array has an even length
	        if (array.length % 2 != 0) {
	            System.out.println("Array length should be even for this operation.");
	            return array;
	        }

	        // Iterate through the array and swap adjacent elements
	        for (int i = 0; i < array.length; i += 2) {
	            int temp = array[i];
	            array[i] = array[i + 1];
	            array[i + 1] = temp;
	        }

	        return array;
	    }

}
