package DataStructures.HashTable;

import java.util.HashMap;
import java.util.Map;

public class TracePath {
    //Trace the path from the starting point of the journey

    // todo try with iterator instead of for loop
    static String tracePath(Map<String, String> journeyPath){
        String path = "";
        String start = "";
        for(Map.Entry e: journeyPath.entrySet()) {
            if (!journeyPath.containsValue(e.getKey())) {
                start = e.getKey().toString();
                break;
            }
        }
        path = start+" -> ";
        for(int i = 0; i<journeyPath.size(); i++){
            path += journeyPath.get(start) + " -> ";
            start = journeyPath.get(start);
        }
        return path;
    }


    public  static void main(String[] args){
        Map<String, String> journeyMap = new HashMap<>();
        journeyMap.put("New York","Chicago");
        journeyMap.put("Boston","Texas");
        journeyMap.put("Missouri","New York");
        journeyMap.put("Texas","Missouri");
        System.out.println(tracePath(journeyMap));

    }
}
