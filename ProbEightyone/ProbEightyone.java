import java.io.*;
class ProbEightyone{
  public static void main(String []args){
    int [][] matrix = new int [80][80];
    String fileName = "p083_matrix.txt";
    String text = "";
    String line = "";
    int counter = 0;
    try{
      FileReader fr = new FileReader(fileName);
      BufferedReader br = new BufferedReader(fr);

      while((line = br.readLine())!=null){
        String theSplit[] = line.split(",");
        for(int i = 0; i< matrix.length;i++){
          matrix[counter][i] = Integer.parseInt(theSplit[i]);
        }
        counter++;

      }
      br.close();
    }
    catch(Exception e){
      System.out.println("Error");
    }

    for (int i = matrix.length - 2; i >= 0; i--) {
      matrix[matrix.length - 1][ i] += matrix[matrix.length - 1][ i+1];
      matrix[i][matrix.length - 1] += matrix[i+1][ matrix.length - 1];
    }


    for (int i = matrix.length - 2; i >= 0; i--) {
      for (int j = matrix.length - 2; j >= 0; j--)
      matrix[i][j] += Math.min(matrix[i + 1][j], matrix[i][j + 1]);

    }
    System.out.println(matrix[0][0]);

  }


}
