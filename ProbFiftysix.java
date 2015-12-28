import java.math.*;
class ProbFiftysix{
	public static void main(String []args){
		BigInteger a = new BigInteger("0");
		int highValue = 0;
		for(int i = 2; i< 100; i++){
			a = new BigInteger(""+i);
			for(int j = 2;j<100;j++ ){
				if(stringValue(a.pow(j))>highValue)
					highValue = stringValue(a.pow(j));
			
			}
		
		}
		System.out.println(highValue);
	
	
	}
	public static int stringValue(BigInteger big){
		String str = big.toString();
		int sum = 0;
		for(int i = 0; i< str.length();i++){
			sum+=Character.getNumericValue(str.charAt(i));
		
		
		}
		return sum;
	
	
	}


}