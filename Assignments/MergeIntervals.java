package Assignments;


import java.util.*;
class Pair{

    int a;
    int b;
    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }
}

public class MergeIntervals {

    int[][] merge(int[][] intervals){
        Arrays.sort(intervals, (a, b)-> Integer.compare(a[0], b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<Pair> list= new ArrayList<Pair>();
        for(int i = 1; i<intervals.length; i++){
            if(intervals[i][0] <= end){
                end = Math.max(end, intervals[i][1]);
            }else{
                list.add(new Pair(start, end));
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        list.add(new Pair(start, end));
        int [][] ans = new int[list.size()][2];
        for(int i = 0; i<list.size(); i++){
            Pair p = list.get(i);
            ans[i][0] = p.a;
            ans[i][1] = p.b;
        }
        return ans;
    }

    public static void main(String[] args){
        MergeIntervals mi = new MergeIntervals();
        int[][] ans = mi.merge(new int[][]{{1,4},{0,4}});
        for(int[] arr: ans){
            System.out.println("["+arr[0]+","+arr[1]+"]");
        }
    }
}
