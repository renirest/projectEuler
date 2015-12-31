import java.math.*;
import java.lang.StringBuilder;
class ProbFiftyfive{
	public static void main(String []args){
		int count = 0;
		for(int i = 1; i< 10000; i++){
			if(isLychrel(new BigInteger(i+"")))
				count++;
		}
		System.out.println(count);
	
	}
	public static boolean isLychrel(BigInteger bi){
		for(int i = 0; i<50;i++){
			bi = bi.add(reverseInt(bi));
			if(isPalin(bi))
				return false;
		}
		return true;
		
		
	}
	public static boolean isPalin(BigInteger str){
		StringBuilder sb = new StringBuilder(str.toString());
		if(sb.length()<=1)
			return true;
		
		else if(sb.length()%2==0){
			if(sb.substring(0,sb.length()/2).equals(sb.reverse().substring(0,sb.length()/2)))
				return true;
		}
		else{
			if(sb.substring(0,sb.length()/2).equals(sb.reverse().substring(0,sb.length()/2)))
				return true;
		}
		return false;
	}
	public static BigInteger reverseInt(BigInteger str){
		StringBuilder sb = new StringBuilder(str.toString());
		return new BigInteger(sb.reverse()+"");
	}

}