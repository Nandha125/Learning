package ConditionalAndLooping;

public class LongestPalindromSubString {
	
    public String longestPalindrome(String s) {
//        StringBuilder revstr=new StringBuilder();
//        StringBuilder resultstr=new StringBuilder();
//        for(int i=s.length()-1;i>0;i--){
//            revstr.append(s.charAt(i));
//        }
//        for(int j=0;j<s.length()-1;j++){
//            if(revstr.toString().charAt(j)==s.charAt(j)){
//                resultstr.append(s.charAt(j));
//            }
//        }
//        System.out.println("======>>"+resultstr.toString());
//        return resultstr.toString();
    	
    	//boabaodytt
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int[] ans = new int[]{0, 0};
        
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                ans[0] = i;
                ans[1] = i + 1;
            }
        }
        
        for (int diff = 2; diff < n; diff++) {
            for (int i = 0; i < n - diff; i++) {
                int j = i + diff;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        
        int i = ans[0];
        int j = ans[1];
        System.out.println("=====> "+s.substring(i, j + 1));
        return s.substring(i, j + 1);
    	
    }
	
	public static void main(String[] args) {
		LongestPalindromSubString obj = new LongestPalindromSubString();
		obj.longestPalindrome("boabaodytt");
	}

}
