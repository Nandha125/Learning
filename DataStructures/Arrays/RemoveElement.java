package DataStructures.Arrays;

public class RemoveElement {
	
    public static int removeElement(int[] nums, int val) {
		int left=0,right=nums.length-1,k=0;
		while(left<right) {
			if(nums[left]!=val) {
				left++;
			}else {
				int temp = nums[left];
				nums[left]=nums[right];
				nums[right]=temp;
			}
			if(nums[right]==val) {
				right--;
			}
		}
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+", ");
			if(nums[i]!=val) {
				k++;
			}
		}
		return k;        
    }

    public static void main(String[] args) {
    	removeElement(new int[] {1,5,2,6,7,2,6,4,8,2,2,1},2);
    }
}
