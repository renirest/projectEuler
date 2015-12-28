import java.util.*;
class ProbThirtyfive{
	public static void main(String []args){
		int count = 1;
		for(int i = 3; i<1000000;i+=2){
			if(isPrime(i)){
				ArrayList<Integer> rotation = rotate(i);
				for(int j = 0; j<rotation.size();j++){
					if(!isPrime(rotation.get(j)))
						break;
					if(isPrime(rotation.get(j))&&j==rotation.size()-1)
						count++;
				}
				
			}
		}
		System.out.println(count);
		
	}
	public static boolean isPrime(long num){
		if(num==2)
		return true;
		else if(num%2==0)
		return false;
		else{
			for(long i = 3; i<=(Math.sqrt(num));i++){
				if(num%i==0)
				return false;
			}
			return true;
		}
	}
	public static ArrayList<Integer> rotate(int num){
		String nums = ""+num;
		String rotate = nums.substring(1)+nums.charAt(0);
		ArrayList<Integer> abc = new ArrayList<Integer>();
		abc.add(num);
		while(!rotate.equals(nums)){
			abc.add(Integer.parseInt(rotate));
			rotate = rotate.substring(1)+ rotate.charAt(0);
		}
		return abc;
	
	}
}