import java.math.BigInteger;
public class ProbFive{
	public static void main(String args[]){
		System.out.println(rangeLCM(20));

	}
	public static long gcd(long num1, long num2){
		BigInteger one = new BigInteger(""+num1);
		BigInteger two = new BigInteger(""+num2);
		
		return (one.gcd(two)).longValue();
	
	}
	public static long lcm(long num1, long num2){
		return (num1*num2)/gcd(num1,num2);
	
	}
	public static long rangeLCM(long range){
	
	long totalLCM = 1;
	for(int i =1; i<=range; i++ ){
		totalLCM = lcm(i,totalLCM);
	
	}
	return totalLCM;
	
	}


}