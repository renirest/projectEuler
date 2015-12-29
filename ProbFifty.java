import java.util.*;
class ProbFifty{
	public static void main(String []args){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		ArrayList<Long> sum = new ArrayList<Long>();
		primes.add(2);
		for(int i = 3; i<1000000;i+=2){
			if(isPrime(i))
				primes.add(i);
		}
		sum.add((long)primes.get(0));
		for(int i = 1; i< primes.size();i++){
			if(primes.get(i)+sum.get(i-1)<1000000)
				sum.add(primes.get(i)+sum.get(i-1));
			else
				break;
		}
		long newPrime = 0;
		int count = 0;
		for(int i = sum.size()-1; i>=0;i--){
			for(int j = 0; j<i;j++){
				long temp = sum.get(i)-sum.get(j);
				if(isPrime(temp)&&i-j>count){
					count = i-j;
					newPrime = temp;
				}
					
			}
		}
		System.out.println(newPrime);
	
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