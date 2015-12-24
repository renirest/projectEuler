public class ProbTwo{
	public static void main(String args[]){
		System.out.println(sumEvenFib(4000000));
		
	}
	public static int sumEvenFib (int lessThan){
		int currentNum = 2;
		int previousNum = 1;
		
		
		int sum = 2;
		while(sum <= lessThan){
			int temp = currentNum;
			currentNum = currentNum + previousNum;
			previousNum = temp;
			if(currentNum%2==0)
				sum += currentNum;
			
			
		}
		return sum;
		
	
	}


}