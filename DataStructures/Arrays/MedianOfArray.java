package DataStructures.Arrays;

public class MedianOfArray {
	
	static double findMedian(int[] nums) {
		double median = 0.0;
		int mid = nums.length/2;
		if(nums.length%2==0) {
			median = (double)(nums[mid-1]+nums[mid])/2;
		}else {
			median = nums[mid];
		}
		return median;
	}
	
	// 
	
	public static void main(String[] args) {
		System.out.println("Median = "+findMedian(new int[] {1,2,3,6,7,8,9}));
	}

}
