public class ProbTwentyeight {

  public static void main(String[] args) {
    int [][] spiral = getSpiralArray(1001);

    System.out.println(getDiag(spiral));
  }

  public static int[][] getSpiralArray(int dimension) {
    int[][] spiralArray = new int[dimension][dimension];

    int numConcentricSquares = (int) Math.ceil((dimension) / 2.0);
    int j;
    int sideLen = dimension;
    int currNum = dimension*dimension;
    for (int i = 0; i < numConcentricSquares; i++) {
      // do top side
      for (j = sideLen-1; j >= 0; j--) {
        spiralArray[i][i + j] = currNum;
        currNum --;
      }
      // do left side
      for (j = 1; j < sideLen ; j++) {
        spiralArray[i + j][i] = currNum;
        currNum --;
      }

      // do bottom side
      for (j = 1; j <= sideLen - 2; j++) {
        spiralArray[dimension - 1 - i][i + j] = currNum;
        currNum --;
      }

      // do right side
      for (j = sideLen-1; j >= 1; j--) {
        spiralArray[i + j][dimension - 1 - i] = currNum;
        currNum --;
      }



      sideLen -= 2;
    }

    return spiralArray;
  }

  public static void print2dArray(int[][] array) {
    for (int[] row : array) {
      for (int elem : row) {
        System.out.printf("%4d", elem);
      }
      System.out.println();
    }
  }
  public static int getleftDiag(int [][] array){
    int sum = 0;
    int goDown = array[0].length - 1;
    for(int i = 0; i< array.length;i++){
      sum+=array[i][goDown];
      goDown--;
    }
    return sum;
  }
  public static int getRightDiag(int [][] array){
    int sum = 0;
    for(int i = 0; i< array.length; i++){
      sum+=array[i][i];
    }
    return sum;
  }
  public static int getDiag(int [][]array){
    return getleftDiag(array)+getRightDiag(array)-1;
  }
}
