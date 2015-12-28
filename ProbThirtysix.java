import java.lang.StringBuilder;
class ProbThirtysix{
	public static void main(String []args){
		long sum = 0;
		for(int i = 1; i<1000000;i++){
			if(isPalin(i+"")&&isPalin(Integer.toBinaryString(i)))
				sum+=i;
			
			
		}
		System.out.println(sum);
	
	}
	public static boolean isPalin(String theNum){
		if(theNum.length()%2==0){
			StringBuilder front = new StringBuilder (theNum.substring(0,theNum.length()/2));
			StringBuilder back = new StringBuilder(theNum.substring(theNum.length()/2));
			back = back.reverse();

			return (front.toString()).equals(back.toString());
		}
		else{
			StringBuilder front = new StringBuilder (theNum.substring(0,theNum.length()/2));
			StringBuilder back = new StringBuilder(theNum.substring(theNum.length()/2+1));
			back = back.reverse();
			return (front.toString()).equals(back.toString());
		}
	
	}
	


}