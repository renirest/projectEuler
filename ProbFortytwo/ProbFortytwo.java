import java.io.*;
import java.util.*;
class ProbFortytwo{
	public static void main(String []args){
		int total = 0;
		String fileName = "p042_words.txt";
		String text = "";
		try{
			text = new Scanner( new File(fileName) ).useDelimiter("\\A").next();
		}
		catch(Exception e){
			System.out.println("Error "+e);
		}
		text = text.replace("\"","");
		List<String> myList = new ArrayList<String>(Arrays.asList(text.split(",")));
		List<Integer> newList = new ArrayList<Integer>();
		
		for(int i = 0; i< myList.size();i++){
			newList.add(stringValue(myList.get(i)));
		}
		int triangleNumber = 0;
		int counter = 0;
		int largest = findLargest(newList);
		Hashtable <Integer, Boolean> ht = new Hashtable<Integer, Boolean>();
		
		while(triangleNumber<=largest){
			ht.put(triangleNumber, true);
			counter++;
			triangleNumber  = (int)triangleFunction(counter);
		}
		for(int i = 0; i< newList.size();i++){
			if(ht.containsKey(newList.get(i)))
				total++;
		}

		System.out.println(total);


	}
	public static int stringValue(String str){
		int sum = 0;
		Hashtable <Character, Integer> ht = new Hashtable<Character, Integer>();
		char start = 'A';
		for(int i = 0; i<26;i++){
			ht.put(start,i+1);
			start++;
		}
		for(int i = 0; i<str.length();i++)
			sum+= ht.get(str.charAt(i));
		return sum;
	}
	public static int findLargest(List<Integer> theList){
		int largest = 0;
		for(int i = 0; i< theList.size();i++){
			if(theList.get(i)>largest){
				largest = theList.get(i);
			}
			
		}
		return largest;
	}
	public static double triangleFunction(double num){
		return (num/2)*(num+1);
	}


}