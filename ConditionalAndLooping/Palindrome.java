package ConditionalAndLooping;

public class Palindrome {
	
	public static void palindromeNum(int n) {
		int r=0,sum=0,temp=0;
		temp=n;
		while(n>0) {
			r=n%10;//get reminder
			sum = (sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is Palindrome");
		}else {
			System.out.println(temp+" is not Palindrome");
		}
	}
	public static void palindromeStr(String s) {
		String rev_s="";
		for(int i=0;i<s.length();i++) {
			rev_s+=s.charAt(s.length()-1-i);
		}
		if(rev_s.equals(s)) {
			System.out.println(s+" is Palindrome");
		}else {
			System.out.println(s+" is not Palindrome");
		}
	}
	
	public static void main(String[] args) {
		palindromeNum(4545);
		palindromeStr("banana");
	}

}
