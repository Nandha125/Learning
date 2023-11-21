package ConditionalAndLooping;

public class ArmstrongNum {
	
	public static void isArmstrongNum(long n) {
		long temp=0,r=0,sum=0;
		temp=n;
		while(n>0) {
			r=n%10;
			sum += r*r*r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is an Armstrong Number");
		}else {
			System.out.println(temp+" is not an Armstrong Number");
		}
	}
	
	public static void main(String[] args) {
		
		isArmstrongNum(372);
	}

}
