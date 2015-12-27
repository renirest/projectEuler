import java.math.BigInteger;
public class ProbTwentyfive{
	public static void main(String [] args){
		BigInteger start = new BigInteger ("1");
		BigInteger previous = new BigInteger ("0");
		int counter = 1;
		while(numDigits(start)<1000){
			BigInteger temp = start;
			start = start.add(previous);
			previous = temp;
			counter++;
		
		}
		System.out.println(counter);
	
	}
	public static int numDigits(BigInteger num){
		return num.toString().length();
	
	}


}