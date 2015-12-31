class ProbSeventysix{
	public static void main(String []args){
		System.out.println(countSum(100));
	
	}
	public static int countSum(int num){
		return countSum(num, num-1) ;
	}
	public static int countSum(int num, int num2){
		if(num==0)
			return 1;
		else if(num <0)
			return 0;
		else if(num2==0)
			return 0;
		else
			return countSum(num,num2-1)+countSum(num-num2,num2);
	}
	
}