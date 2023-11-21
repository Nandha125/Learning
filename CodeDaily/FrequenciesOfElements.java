package CodeDaily;

import java.util.Arrays;

public class FrequenciesOfElements {
	
	/*
	 * Given an array arr[] of N positive integers which can contain integers from 1
	 * to P where elements can be repeated or can be absent from the array. Your
	 * task is to count the frequency of all numbers from 1 to N. Make in-place
	 * changes in arr[], such that arr[i] = frequency(i). Assume 1-based indexing.
	 * Note: The elements greater than N in the array can be ignored for counting
	 * and do modify the array in-place.
	 * 
	 * https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1
	 */
	
    public static void frequencyCount1(int arr[], int N, int P)
    {
        // code here
    	int[] ans = new int[N];
    	int i = 1;
    	while(i <= N) {
    		int count = 0;
    		for(int j = 0; j < N; j++) {
    			if(i == arr[j]) count++;
    		}
    		ans[i-1] = count;
    		i++;
    	}	
    	for(int k=0; k<N; k++) {
			arr[k] = ans[k];
		}
    }
    
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
		/*
		2 3 2 3 5
		0 2 2 0 1

		*/
    	int index = 0;
    	int temp = 1;
    	int count = 0;
    	while(temp <= N) {
    		if(arr[index] == temp) {
    			count++;
    		}
    		index++;
    		if(index == N) {
    			System.out.println(count);
//    			arr[temp-1] = count*P+arr[temp-1];
    			index = 0;
    			temp++;
    			count = 0;
    		}
    		
    	}
    	
    }
	
	public static void main(String[] args) {
		
		int N = 5;
		int[] arr = new int[] {2,3,2,3,5};
		int P = 5;	
		frequencyCount(arr, N, P);
		for(int i=0; i<N; i++) {
			System.out.print(arr[i]+", ");
		}
	}
	
	
}
