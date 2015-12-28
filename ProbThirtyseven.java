import java.util.*;
class ProbThirtyseven{
	public static void main(String []args){
		int sum = 0;
		int counter = 0;
		int start = 9;
		while(counter != 11){
			if(isPrime(start)){
				ArrayList<Integer> theList = leftRight(start);
				for(int i = 0; i< theList.size();i++){
					if(!isPrime(theList.get(i)))
					break;
					if(isPrime(theList.get(i))&&i==theList.size()-1){
						counter++;
						sum+=start;
					}
				}
			}
			start+=2;
		}
		System.out.println(sum);
	}
	public static boolean isPrime(long num){
		if(num == 2)
		return true;
		else if(num==1)
		return false;
		else if(num%2 ==0)
			return false;
		else{
			for(long i = 3; i<=(Math.sqrt(num));i++){
				if(num%i==0)
				return false;
			}
			return true;
		}
	}
	public static ArrayList<Integer> leftRight (int num){
		ArrayList<Integer> aList = new ArrayList<Integer>();
		String convert = num+"";
		for(int i = 1; i< convert.length();i++){
			aList.add(Integer.parseInt(convert.substring(0,convert.length()-i)));
			aList.add(Integer.parseInt(convert.substring(i)));
		}
		return aList;
	}
	

}