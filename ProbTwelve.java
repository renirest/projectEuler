public class ProbTwelve{
	public static void main(String args[]){
		long start = 0; 
		long divisor = countDivisors(start);
		long counter = 1;
		while(divisor<=500){
			start += counter;
			counter ++;
			divisor = countDivisors(start);

		}
		System.out.println(start);
	}
	
	public static long countDivisors(long num){
		long counter = 0;
		for(long i = 1; i<=Math.sqrt(num);i++){
			if(num%i==0){
				if(i*i< num)
					counter +=2;
				else
					counter ++;
			}
		}
		return counter;
	
	
	}

}