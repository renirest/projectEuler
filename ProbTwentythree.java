import java.util.*;

public class ProbTwentythree{
	public static void main(String []args){

		long total = 0;
		ArrayList <Integer> abundantNums = new ArrayList<Integer>();
		for(int i = 12; i<= 28123;i++)
			if(isAbundant(i)) abundantNums.add(i); 
		
		
		Hashtable <Integer, Boolean> ht = new Hashtable<Integer, Boolean>();
		for(int i = 1; i<= 28123;i++)
			ht.put(i, false);
		
		for(int i = 0; i< abundantNums.size();i++){
			for(int j = i; j< abundantNums.size();j++)
				if(abundantNums.get(i)+abundantNums.get(j)<=28123){
					ht.put(abundantNums.get(i)+abundantNums.get(j),true);
				}
				else
					break;
		}
		for(int i = 1; i< 28123;i++){
			if(!ht.get(i))
				total+=i;
		}
		

		System.out.println(total);
			
	}
	public static boolean isAbundant(int num){
		int sum = 0;
		for(int i = 1; i<= Math.sqrt(num); i++){
			if(num%i==0){
				sum+=i;
				
				if(i != num/i && num/i != num)
					sum+= num/i;
			}
		}
	
		return sum>num;
	}

}