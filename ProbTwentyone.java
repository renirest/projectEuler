public class ProbTwentyone{
	public static void main(String []args){
		int total = 0;
		for(int i = 2; i< 10000;i++){
			if(amicableNum(i))
				total+=i;
			
			
		}
		System.out.println(total);
	
	}
	public static boolean amicableNum(int num){
		int sum = 0;
		int tempNum = num;
		//num = a
		//sum = b
		
		for(int i = 1; i<(num);i++){
			if(num%i==0){
				sum+=i;
				tempNum/=i;
			
			}
		
		}
		//num
		int tempSum = sum;
		int secondSum = 0;
		for(int i = 1;i<(sum);i++){
			if(sum%i==0){
				secondSum +=i;
				tempSum/=i;
			}
		
		}

		
		return num == secondSum && sum != num;
	
	}
}