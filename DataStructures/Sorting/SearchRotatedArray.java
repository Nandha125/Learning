package DataStructures.Sorting;

public class SearchRotatedArray {
	
	   public static int search(int[] nums, int target) {
	        int start = 0;
	        int end = nums.length-1;
	        while( start <= end){
	            int mid = (start+end)/2;
	            if(nums[mid]>=nums[start]){
	                if(nums[start] <= target && nums[mid] >= target){
	                    end = mid -1;
	                }else{
	                    start = mid + 1;
	                }
	            }else {
	                if(nums[mid] <= target && nums[end] >= target){
	                    start = mid + 1;
	                }else{
	                    end = mid -1;
	                }
	            }
	            if(nums[mid]==target){
	                return mid;
	            }   
	        }
	        return -1;
	    }
	   
	   public static void main(String[] args) {
//			   Input: nums = [4,5,6,7,0,1,2], target = 0
//			   Output: 4
//			   Example 2:
//
//			   Input: nums = [4,5,6,7,0,1,2], target = 3
//			   Output: -1
//			   Example 3:
//
//			   Input: nums = [1], target = 0
//			   Output: -1
		   
		   System.out.println(search(new int[] {4,5,6,7,0,1,2}, 0));
		   
	   }

}
