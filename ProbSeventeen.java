public class ProbSeventeen{
	public static void main(String []args){
		//1-9
		int oneToNine = "onetwothreefourfivesixseveneightnine".length();
		//10-19
		int tenToNineteen = "teneleventwelvethirteenfourteenfifteensixteenseventeeneighteennineteen".length();
		//20-99
		int twentyToNinety = oneToNine*8+10*("twentythirtyfortyfiftysixtyseventyeightyninety".length());
		//100-999
		int hundredtoNine = oneToNine*100+(oneToNine+tenToNineteen+twentyToNinety)*9+"hundredand".length()*891+"hundred".length()*9;
		//1000
		int thousand = "onethousand".length();
		
		System.out.println(oneToNine+tenToNineteen+twentyToNinety+hundredtoNine+thousand);
	}

}