public class ProbFourteen{
	public static void main(String []args){
		long length = 1;
		long largestNumber = 1;
		long copySequence;
		for(int i = 2; i<= 999999; i++){
			long tempLength = 1;
			copySequence = i;
			while(copySequence != 1){
				if(copySequence%2==0){
					copySequence /=2;
					tempLength++;
				}
				else{
					copySequence = 3*copySequence + 1;
					tempLength++;
				}
			}
			if(length < tempLength){
				length = tempLength;
				largestNumber = i;
			}
		}
		System.out.println(largestNumber);
	}


}