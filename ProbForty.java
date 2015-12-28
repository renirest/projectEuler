import java.lang.StringBuilder;
class ProbForty{
	public static void main(String []args){
		StringBuilder champ = new StringBuilder();
		for(int i = 1; champ.length()<=1000000;i++){
			champ.append(i);
		}
		int [] nums  = {1,10,100,1000,10000,100000,1000000};
		int [] chars = new int [nums.length];
		for(int i = 0; i< nums.length;i++){
			chars[i] = champ.charAt(nums[i]-1);
		}
		int product = 1;
		for(int i = 0; i< chars.length;i++){
			product *=Character.getNumericValue(chars[i]);
		}
		System.out.println(product);
	}
}