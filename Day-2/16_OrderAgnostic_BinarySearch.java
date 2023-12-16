import java.util.Arrays;
import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
/*     int[] descArr = {8990,232,45,12,7,2,-5};
	   int target = 7;  // located in 4th index        */

	   int[] ascArr = {-1,4,5,7,18,65,98};
	   int target = 65;
	
	   int targetIndex = orderAgnosticBinarySearch(ascArr, target);

	   System.out.println(target + " located at " + targetIndex +"th index");
	}
	
	// return the index
	// return -1 , if not found
	static  int orderAgnosticBinarySearch(int[] arr, int target){
		
		int start = 0;
		int end = arr.length-1;
		 // find whether the array is sorted in ascending or descending
		boolean isAsc = arr[start] < arr[end];

		while(start <= end) 
		{
			// calculate  middle index number
			int mid = (start + end ) / 2; 

			if (arr[mid] == target)
			{
				// the target found, so return index
				return mid;
			}
		
			if (isAsc)
			{
				if (target > arr[mid])
					start = mid +1;
				else
					end = mid -1;
			}else{
				
				if (target > arr[mid])
					// make the end mid -1
					end = mid -1;				
				else if (target < arr[mid])
					// make the start mid +1 
					start = mid + 1;
			}
		}
		// target not found
		return -1; 
	}
}

// find the middle element
// int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
// use this instead 
// int mid = start + (end - start) / 2;