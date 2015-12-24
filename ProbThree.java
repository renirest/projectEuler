public class ProbThree{
	public static void main(String args[]){
		System.out.println(largestPrimeFactor(600851475143L));
	}
	public static long largestPrimeFactor(long n){
		while(n%2==0){
			n/=2;
		}
		
		for(int i = 3;i<=Math.sqrt(n);i++){
			while(n%i==0){
				n/=i;
			}
		
		}
		return n;
	
	
	}

}