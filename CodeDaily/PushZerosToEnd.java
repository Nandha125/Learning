package CodeDaily;

public class PushZerosToEnd {
	
	/*
	 * https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
	*/
	static void pushZerosToEnd(int[] arr, int n) {
        // code here
		int p = 0;
		int index = 0;
		while(p<n) {
			if(arr[p]==0) {
				p++;
			}else{
				int temp = arr[index];
				arr[index] = arr[p]; 
				arr[p] = temp;
				p++;
				index++;
			}
		}
    }

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 0, 4, 3, 0, 5, 0};
		pushZerosToEnd(arr, 8);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
	}
}
