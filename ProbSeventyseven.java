class ProbSeventyseven{
	public static void main(String []args){
		int counter  = 2;
		while(countPrime(counter)<5000){
			counter++;
		}
		System.out.println(counter);

	}
	public static int countPrime(int num){
		return countPrime(num, num-1) ;
	}
	public static int countPrime(int num, int num2){
		if(num==0)
			return 1;
		else if(num <0)
			return 0;
		else if(num2==0)
			return 0;
		else if(!isPrime(num2))
			return countPrime(num,num2-1);
		else
			return countPrime(num,num2-1)+countPrime(num-num2,num2);
	}
  public static boolean isPrime(long num){
		if(num==2)
			return true;
		else if(num==1|| num%2==0)
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
