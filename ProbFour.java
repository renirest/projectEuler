import java.lang.StringBuilder;
public class ProbFour{
	public static void main(String []args){
		System.out.println(isPalin("32123"));
	}
	public static boolean isPalin(String str){
		if(str.length()%2==0){
			StringBuilder sb = new StringBuilder(str);
			if(sb.substring(0,sb.length()/2).equals(sb.reverse().substring(0,sb.length()/2)))
				return true;
		}
		else{
			StringBuilder sb = new StringBuilder(str);
			if(sb.substring(0,sb.length()/2).equals(sb.reverse().substring(0,sb.length()/2)))
				return true;
		}
		return false;
	}
	public static int longestThreePalin(){
		int bigPalin = 0;
		for(int i = 100; i<=999;i++){
			for(int j=100;j<=999;j++){
				
				int bigNum = i*j;
				if(isPalin(bigNum+"")){
					
					if(bigPalin < bigNum)
						bigPalin = bigNum;
				}
			}
		}
		return bigPalin;
	}

}