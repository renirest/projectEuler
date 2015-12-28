import java.math.BigInteger;

public class ProbFortyeight{
	public static void main(String []args){
	BigInteger sum = new BigInteger("0");
	for(int i = 1; i< 1001;i++){
		sum = sum.add((new BigInteger(i+"")).pow(i));
	
	}
	System.out.println(sum.toString().substring(sum.toString().length()-10));
	}
}
