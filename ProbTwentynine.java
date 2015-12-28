import java.util.*;
import java.math.BigInteger;
class ProbTwentynine{
	public static void main(String []args){
		Set <BigInteger> distinct = new HashSet <BigInteger>();
		for(int i =2; i<=100; i++){
			for(int j = 2; j<=100; j++){
				BigInteger bi = (new BigInteger(i+"").pow(j));
				distinct.add(bi);
			
			}
		
		}
		System.out.println(distinct.size());
	
	
	}


}