package Assignments;

public class SearchInsertPosition {
	// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    //
    //You must write an algorithm with O(log n) runtime complexity.
    public static int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length-1,index = 0;
        if(target <= nums[0]) {
            index = 0;
        }else if(target > nums[nums.length-1]) {
            index = nums.length;
        }
        while(l <= r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                l = mid + 1;
                index = l;
            }else{
                r = mid - 1;
                index = mid;
            }
        }
        return index;
    }

	public static void main(String[] args) {
		System.out.println(searchInsert(new int[] {1,2,4,6,7},3));
	}
}
