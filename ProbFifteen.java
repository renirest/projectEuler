import java.math.BigInteger;
public class ProbFifteen{
	public static void main(String []args){
		int gridSize = 20;
		
		
		System.out.println(fact(gridSize*2).divide(fact(gridSize).pow(2)));
		
		
	}
	public static BigInteger fact(int num){
		if(num == 0)
			return new BigInteger("1");
		else if(num == 1)
			return new BigInteger("1");
		else
			return fact(num-1).multiply(new BigInteger(""+num));
	}
}