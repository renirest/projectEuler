public class ProbSix{
	public static void main(String[]args){
		long n = 100;
		double sumOne = Math.pow((n*(n+1))/2,2);
		long sumTwo = (n*(n+1)*(2*n+1))/6;
		
		System.out.println((long)(sumOne - sumTwo));
	}
}