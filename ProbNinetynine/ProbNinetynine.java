import java.io.*;
class ProbNinetynine{
	public static void main(String[]args){
		
		int lineNumber = 0;
		try{
			BufferedReader br = new BufferedReader(new FileReader("p099_base_exp.txt"));
			String line = "";
			
			
			Double largestOne = 0.0;
			int counter = 0;
			lineNumber = 0;
			while((line=br.readLine())!=null){
				counter++;
			 	int commaIndex = line.indexOf(",");
				Double a = Double.parseDouble(line.substring(0,commaIndex));
				Double b = Double.parseDouble(line.substring(commaIndex+1));
				Double d = b*Math.log(a);
				if(d>largestOne){
					largestOne = d;
					lineNumber  =  counter;
					
				}
				
				
			}
		}
		catch(Exception e){
			System.out.println("Error"+ e);
		}
		
		System.out.println(lineNumber);	
		
	}
}