package ConditionalAndLooping;

public class LargestPrimeFactor {
	
	public static int largestPrimeFactor(int N) {
	   int factor=2;
	   while(N%2==0){
	       N=N/2;
	   }
	   for(int i=3;i<=N;i=i+2){
	       if(N%i==0){
	           factor=i;
	       }
	       while(N%i==0){
	           N=N/i;
	       }
	   }
	   System.out.println(factor);
	   return factor;
	}
	
	public static void main(String[] args) {
		largestPrimeFactor(5);
	}

}
