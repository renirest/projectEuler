import java.io.*;
import java.util.*;
public class ProbSixtyseven{
	public static void main(String []args){
		String fileName = "p067_triangle.txt";
		String text = "";
		String line = "";
		int counter = 0;
		try{
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			
			while((line = br.readLine())!=null){
				text+=line+" ";
				counter++;
			}
			br.close();
		}
		catch(Exception e){
			System.out.println("Error");
		}
		int [][] triangle = new int [counter][counter];
		int theCount = 0;
		for(int i = 0; i<counter; i++){
			for(int j = 0; j<counter; j++){
				triangle[i][j] = 0;
			}
		}
		for(int i = 0; i< counter; i++){
			for(int j = 0; j<i+1;j++){
				String nl = text.substring(theCount,theCount+2);
				
				triangle[i][j] = Integer.parseInt(nl);
				theCount +=3;
			}
		}
		for(int i = counter-2; i>=0; i--){
			for(int j = 0; j<i+1; j++){
				
				triangle[i][j] = triangle[i][j] + Math.max(triangle[i+1][j],triangle[i+1][j+1]);
				
			}
		}
		System.out.println(triangle[0][0]);
	}


}