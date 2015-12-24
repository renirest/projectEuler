public class ProbSeven{
	public static void main(String args[]){
		System.out.println(findPrime(10001));
	
	}
	public static int findPrime(int pos){
		int count = 0;
		int counter = 1;
		while(count < pos){
			counter++;
			if(isPrime(counter))
				count++;
		}
		return counter;
	}
	public static boolean isPrime(int num){
		if(num==2)
			return true;
		else if(num%2==0)
			return false;
		else{
			for(int i = 3; i<(Math.sqrt(num));i++){
				if(num%i==0)
					return false;
			
			}
			return true;
		
		
		}
	
	
	}

}