class ProbFortyfive{
	public static void main(String []args){
		int n = 144;
		long hexagon = calcHexagon(n);
		while(!isPentagon(hexagon)||!isTriangle(hexagon)){
			n++;
			hexagon = calcHexagon(n);
		}

		System.out.println(hexagon);
		
	}
	public static boolean isTriangle(long num){
		double calc = (Math.sqrt(8*num+1));
		if(isWhole(calc))
			return true;
		return false;
	}
	public static boolean isPentagon(long num){
		double calc = (Math.sqrt(24*num+1));
		if(isWhole(calc)&&calc%6==5)
			return true;
		return false;
	}
	public static boolean isWhole(double d){
		return ((d == Math.floor(d)) && !Double.isInfinite(d));
	}
	public static long calcHexagon(int n){
		return n*(2*n-1);
	}

}