package DataStructures.Search;

public class RotatedArray {
	
	/*
	 * 'target' number to be search
	 * 'arr' integer sorted (ascending order / non-decreasing order) & rotated array 
	 * 'n' array length
	*/
	static int rotatedArraySearch(int target, int[] arr, int n) {
		int i = 0;
		int j = n-1;
		while( i <= j) {
			int mid = (i+j)/2;
			if(arr[mid] == target) {
				return mid;
			}
			if(arr[i]<=arr[mid]) {
				if(arr[mid] >= target && arr[mid] <= target) {
					j = mid - 1;
				}else {
					i = mid + 1;
				}
			}else{
				if(arr[mid] <= target && arr[mid] >= target) {
					j = mid - 1;
				}else {
					i = mid + 1;
				}
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		System.out.println(rotatedArraySearch(8,new int[] {5,6,7,8,1,2,3,4},8));
	}

}
