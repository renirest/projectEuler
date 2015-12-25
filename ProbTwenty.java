import java.math.BigInteger;
public class ProbTwenty{
	public static void main(String[]args){
		String str = fact(new BigInteger("100")).toString();
		long sum = 0;
		for(int i = 0; i<str.length();i++){
			sum += Character.getNumericValue(str.charAt(i));
		}
		System.out.println(sum);
	}
	public static BigInteger fact(BigInteger num){
		if(num.equals(new BigInteger("0")))
			return new BigInteger("1");
		else if(num.equals(new BigInteger("1")))
			return new BigInteger("1");
		else
			return (num).multiply(fact(new BigInteger((num.subtract(new BigInteger ("1")))+"")));
	
	}

}