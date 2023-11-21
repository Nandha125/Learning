package Assignments;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {

    static int[][] merge(int[][] intervals){
        List<Integer> indexes = new ArrayList<>();
        for(int i = 0; i<intervals.length; i++){
            int start = intervals[i][0]; //1
            int end = intervals[i][1]; //4
            for(int j = i+1; j < intervals.length; j++){
                if(intervals[j][0] >= 0 && intervals[j][1] >=0 && end >= intervals[j][0]){ // 0 1
                    if(start >= intervals[j][0]){
                        start = intervals[j][0];
                    }
                    if(end <= intervals[j][1]){
                        end = intervals[j][1];
                    }
                    intervals[j][0] = -1;
                    intervals[j][1] = -1;
                    indexes.add(j);
                }
            }
            intervals[i][0] = start;
            intervals[i][1] = end;
            System.out.println(start+" "+end);
        }
        int[][] ans = new int[intervals.length-indexes.size()][2];
        int j = 0;
        for(int i = 0; i<intervals.length; i++){
            if(!indexes.contains(i)){
                ans[j][0] = intervals[i][0];
                ans[j][1] = intervals[i][1];
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        merge(new int[][]{{1,4},{0,1}});
    }
}
