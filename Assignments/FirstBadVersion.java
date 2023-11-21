package Assignments;

public class FirstBadVersion {

    public static boolean isBadVersion(int version){
        int badVersion = 1702766719;
        return badVersion < version;
    }

    public static int firstBadVersion(int n) {
        long l = 0;
        long r = n;
        long version = Integer.MAX_VALUE;
        while(l <= r){
            long mid = (l+r)/2;
            if(isBadVersion((int)mid)){
                version = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return (int)version;
    }

    public static void main(String[] args){
        System.out.println(firstBadVersion(2126753390));
    }
}
