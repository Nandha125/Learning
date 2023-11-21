package ConditionalAndLooping;

public class PrimeNumber {
	//Given number is prime or not
	public static boolean isPrime(int n) {
		boolean flag=true;
		if(n>1) {
			int i,m=0; 
			m=n/2;//mid value
			for(i=2;i<m;i++) {//looping based on mid value
				if(n%i==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(n+" is a Prime Number");
				return flag;
			}
		}
		System.out.println(n+" is not a Prime Number");
		return !flag;
	}
	//Print the Prime Numbers within r
	public static int primeNumbers(int r) {
		int count=0;
		if(r>1) {
			System.out.print("Prime Numbers: ");
			for(int n=3;n<=r;n++) {
				int j,m=0,flag=0;
				m=n/2;
				for(j=2;j<m;j++) {
					if(n%j==0) {
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.print(n+",");
					count++;
				}
			}
			System.out.println("");
			System.out.println("Total Prime Numbers: "+count);
		}
		return count;
	}
	
	public static void main(String[] args) {
		isPrime(7);
		primeNumbers(100);
	}

}
