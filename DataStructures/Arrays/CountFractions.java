package DataStructures.Arrays;

public class CountFractions {
	
	public static int countFractions(int n, int[] numerator, int[] denominator) {
		int result=0;
		float r1=0,r2=0;
		for(int i=0;i<n;i++) {
			r1 = (float)numerator[i]/denominator[i];
			for(int j=i+1;j<n;j++) {
				r2 = (float)numerator[j]/denominator[j];
				if(r1+r2==1) {
					result++;
				}
			}
		}
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		int[] numerator = {1,2,2,8};
		int[] denominator = {2,4,6,12};
		countFractions(4,numerator,denominator);
	}

}
