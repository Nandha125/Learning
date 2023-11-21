package DataStructures.HashTable;

import java.util.HashMap;
import java.util.Map;

public class SymmetricPairs {

    static String findSymmetricPair(int[][] arr){
        String ans = "";
        Map<Integer, Integer> m1 = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(!(m1.containsKey(arr[i][0]) && m1.get(arr[i][0])==arr[i][1])) { // Duplicates check
                if (m1.containsKey(arr[i][1]) && m1.get(arr[i][1]) == arr[i][0]) {
                    ans += "{" + arr[i][0] + "," + arr[i][1] + "} "; // added to answer string
                } else {
                    m1.put(arr[i][0], arr[i][1]);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[][] arr = new int[][]{{1,2},{3,4},{5,9},{4,3},{9,5}};
        System.out.println(findSymmetricPair(arr));
    }

}
