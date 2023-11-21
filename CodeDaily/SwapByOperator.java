package CodeDaily;

public class SwapByOperator {
	
	
	// (*, /)
	public static void main(String[] args) {
		int a = 8000;
		int b = 1;
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println(a+" "+b);
	}

}
