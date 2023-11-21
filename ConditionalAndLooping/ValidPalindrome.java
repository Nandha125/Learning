package ConditionalAndLooping;

public class ValidPalindrome {
	
	public static boolean isValidPalindrome(String s) {
		s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		int i=0,j=s.length()-1;
		while(i<s.length()-1) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;j--;
		}
		return true;
	}
	
    public static void main(String[] args) {
    	isValidPalindrome("A man, a plan, a canal: Panama");
    }

}
