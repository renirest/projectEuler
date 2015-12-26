import java.io.*;
import java.util.*;
import java.util.Hashtable;

public class ProbTwentytwo{
	public static void main(String []args){
		String fileName = "p022_names.txt";
		String text = "";
		try{
			text = new Scanner( new File(fileName) ).useDelimiter("\\A").next();
		}
		catch(Exception e){
			System.out.println("Error "+e);
		}
		text = text.replace("\"","");
		List<String> myList = new ArrayList<String>(Arrays.asList(text.split(",")));
		qs(myList,0,myList.size()-1);
		int totalSum = 0;
		for(int i = 0; i<myList.size();i++){
			totalSum += stringValue(myList.get(i))*(i+1);
		}
		System.out.println(totalSum);


	}
	public static void qs(List<String> theList, int low, int high){
		
		String pivot = theList.get((low+high)/2);
		int i = low;
		int j = high;
		while(i<=j){
			
			while((theList.get(i).compareTo(pivot))<0){
				i++;

			}
			while(theList.get(j).compareTo(pivot)>0){
				j--;
			}
			if(i<=j){
				String temp = theList.get(i);
				theList.set(i,theList.get(j));
				theList.set(j,temp);
				i++;
				j--;
			}
		}
		if(low<=j)
			qs(theList,low,j);
		if(high>i)
			qs(theList,i,high);
	}
		
		
		public static int stringValue(String str){
			Hashtable<Character, Integer> charValue = new Hashtable<Character, Integer>();
			Character initChar = 'A';
			for(int i = 1; i<= 26; i++){
				charValue.put(initChar,i);
				initChar++;
			}
			int sum = 0;
			for(int i = 0; i<str.length();i++){
				sum+=charValue.get(str.charAt(i));
			}
			return sum;
			
		}


}
