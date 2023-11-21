package DataStructures.Search;

public class ArrangeCoins {

    public static int arrangeCoins(int n) {
        //
        long l = 0;
        long r = n;
        long row = 0;
        // modified binary search
        while( l <= r ){
//            long mid = (l+r)/2;
            long mid = l+(r-l)/2;
            if(mid*(mid+1)/2 <= n){
            	row = mid;
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return (int) row;
    }
    
    public static void main(String[] args) {
    	System.out.println(arrangeCoins(9));
    }
}
