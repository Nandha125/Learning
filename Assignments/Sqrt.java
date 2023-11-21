package Assignments;

public class Sqrt {
    //Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
    //
    //You must not use any built-in exponent function or operator.
    //
    //For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

    public static int mySqrt(int x) {// Time Exceed
        int l = 0;
        int r = x;
        if(x == 0) return 0;
        int sqrt = 1;
        while(l <= r){
            int mid = (l+r)/2;
            if(mid*mid == x){
                return (int)mid;
            }else if(mid*mid < x){
                sqrt = (int)mid;
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return sqrt;
    }

    public static void main(String[] args){
        System.out.println(mySqrt(8));
    }

}
