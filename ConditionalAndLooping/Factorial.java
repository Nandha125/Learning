package ConditionalAndLooping;

public class Factorial {
	
	public static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact *=i;
		}
		return fact;
	}
	
	public static int factorialbyrecursion(int num) {
		if(num>=1) {
			return num*factorialbyrecursion(num-1);
		}else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(factorial(10));
		System.out.println(factorialbyrecursion(5));
	}

}
