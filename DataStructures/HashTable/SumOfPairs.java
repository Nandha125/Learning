package DataStructures.HashTable;

import java.util.HashSet;
import java.util.Set;

public class SumOfPairs {

    // Time Complexity => O(n^2)
    public static int findPairs(int arr[],int n)
    {
        //code here.
        Set<Integer> sums = new HashSet<>();
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int sum = arr[i]+arr[j];
                if(sums.contains(sum)) return 1;
                sums.add(sum);
            }
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(findPairs(new int[]{3,4,7,1,2,9,8},7));
    }
}
