package DataStructures.HashTable;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> n1 = new HashSet<>();
        Set<Integer> ansSet = new HashSet<>();
        for (int k : nums1) n1.add(k);
        for (int k : nums2) {
            if (n1.contains(k)) {
                ansSet.add(k);
            }
        }
        int[] ans = new int[ansSet.size()];
        int i =0;
        for(Integer num: ansSet){
            ans[i] = num;
            i++;
        }
        return ans;
    }


    public static void main(String[] args){
        int [] nums1 = new int[]{1,2,2,1};
        int [] nums2 = new int[]{2,2};
        int [] ans = intersection(nums1,nums2);
        for (int an : ans) System.out.print(an + ", ");
    }
}
