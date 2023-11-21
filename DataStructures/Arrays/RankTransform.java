package DataStructures.Arrays;

import java.util.Arrays;

class Element{
    int value ;
    int index;
    Element(int value, int index){
        this.value = value;
        this.index = index;
    }
}
class RankTransform {

    public static int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        Element[] elements = new Element[n];
        for(int i=0; i<n; i++){
            elements[i] = new Element(arr[i],i);
        }

        Arrays.sort(elements, (a,b)->Integer.compare(a.value,b.value));

        //custom sort
        
        int[] ans = new int[n];
        int rank = 0;
        for(int i=0; i<n; i++){
            if((i-1)>=0 && elements[i-1].value == elements[i].value){
                ans[elements[i].index] = ans[elements[i-1].index];
            }else{
                rank++;
                ans[elements[i].index] = rank;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
    	arrayRankTransform(new int[] {37,12,28,9,100,56,80,5,12});
    }
    
}
