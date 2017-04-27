import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedIntArray = new int[]{199,2,5,8,3,9,2,20,30,25,22,24,21,1};
	
		// sort the array
		BubbleSortAscendingOrder(unsortedIntArray);

		for(int i = 0; i < unsortedIntArray.length; i++){	
			System.out.print(unsortedIntArray[i] + " ");
		}		
	}
	// Sorts any integer array in ascending order. 
	public static void BubbleSortAscendingOrder(int[] intArray){
		int current = 0;
		boolean changed = false;
		do {
			changed = false;
			for(int i = 0; i< intArray.length-1; i++){
				/* if current element is greater than the next 
				 * element. then we swap the two elements
				 * */
				if(intArray[i] > intArray[i+1]){
					current = intArray[i];
					intArray[i] = intArray[i+1];
					intArray[i+1] = current;
					changed = true; 
				}
			}			
		}while(changed);
	}

}
