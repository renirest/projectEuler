class ProbThirtynine{
	public static void main(String []args){
		int maxLength = 0;
		int maxP = 0;
		
		
		for(int a =  3; a<=1000; a++){
			int count = 0;

			for(int b = 1; b<=a/3;b++){
				for (int c = b+1; c<=a/2; c++){
					int d = a - b - c;
					if(b+c+d != a)
						break;
					else{
						if(isRightTriangle(b,c,d))
							count++;
					}
				}
				
			}
			if(count > maxLength){
				maxLength = count;
				maxP = a;
			}
		}
		System.out.println(maxP);
	
	
	}
	public static boolean isRightTriangle(int a, int b, int c){
		return Math.pow(a,2)+Math.pow(b,2) == Math.pow(c,2);
	
	}


}