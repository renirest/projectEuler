import java.math.BigInteger;
import java.io.*;


public class ProbThirteen{
	public static void main(String args[]){
		String fileName = "Numbers.txt";
		String line = "";
		BigInteger bi = new BigInteger("0");
		
		try{
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			
			while((line = br.readLine())!=null){
				bi = bi.add(new BigInteger(line));
			}
			
			br.close();
			System.out.println(bi.toString().substring(0,10));
			
		}
		catch(Exception e){
			System.out.println("Error");
		}
	
	
	}


}