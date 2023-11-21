package DataStructures.Search;

public class Binary {
	
	/*
	 * 'target' number to be search
	 * 'arr' integer sorted array (ascending order / non-decreasing order) 
	 * 'n' array length
	*/
	public static int binarySearch(int target, int[] arr, int n) {
		int l = 0;
		int r = n-1;
		while(l <= r) { 
			int mid = (l+r)/2; 
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] < target) { 
				l = mid+1;
			}else if(arr[mid] > target) { 
				r = mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(binarySearch(3,new int[] {1,2,3,4,5,6,7,8},8));
	}

}
