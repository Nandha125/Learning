
public class RemoveDuplicates {
	
    public static int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++) {
        	boolean unique=true;
        	for(int j=i+1;j<nums.length;j++) {
        		if(nums[i]==nums[j]) {
        			unique=false;
        			break;
        		}
        	}
        	if(unique) {
        		nums[count]=nums[i];
        		count++;
        	}
        }
        return count;
    }
	
    public static void main(String[] args) {
    	removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4});
    }

}
