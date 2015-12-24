public class ProbNine{
	public static void main(String args[]){
		System.out.println(pyTripleProduct(1000));
	
	}
	public static int pyTripleProduct(int equal){
		for(int a = 1; a<=equal; a++){
			for(int b = 1; b<=equal;b++){
				int c = 1000-a-b;
				
				if(Math.pow(c,2)== (Math.pow(a,2)+Math.pow(b,2))){
					
					return a*b*c;
				}
				
			}
			
			
		}
		
		
		return 0;
	}

}