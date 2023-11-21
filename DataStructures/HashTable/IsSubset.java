package DataStructures.HashTable;

import java.util.HashMap;
import java.util.Map;

public class IsSubset {

    public String isSubset( long a1[], long a2[], long n, long m) {

        Map<Long, Integer> arrMap = new HashMap<>();
        for(int i=0; i<n; i++){
            if(arrMap.containsKey(a1[i])){
                arrMap.put(a1[i],arrMap.get(a1[i])+1);
            }else{
                arrMap.put(a1[i],1);
            }
        }
        for(int j=0; j<m; j++){
            int v = 0;
            if(!arrMap.containsKey(a2[j]))
                return "No";
            else
                if(arrMap.get(a2[j]) == 1) arrMap.remove(a2[j]);
                else arrMap.put(a2[j], arrMap.get(a2[j])-1);
        }
        return "Yes";
    }
}
