public class ProbTen{
	public static void main(String args[]){
		System.out.println(findPrime(2000000));
	
	}
	public static long findPrime(long under){
		long sum = 2;
		long counter = 1;
		while(counter<under){
			counter+=2;
			if(isPrime(counter))
				sum+=counter;
		}
		return sum;
	}
	
	public static boolean isPrime(long num){
		if(num==2)
			return true;
		else if(num%2==0)
			return false;
		else{
			for(long i = 3; i<=(Math.sqrt(num));i++){
				if(num%i==0)
					return false;
			
			}
			return true;
		
		
		}
	
	
	}


}