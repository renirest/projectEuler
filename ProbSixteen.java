import java.math.BigInteger;

public class ProbSixteen{
	public static void main(String[]args){
	
		BigInteger bi = new BigInteger("2").pow(1000);
		String str = bi.toString();
		int sum = 0;
		for(int i = 0; i<str.length();i++){
			sum += Character.getNumericValue(str.charAt(i));
		
		}
		System.out.println(sum);
	
	
	}

}