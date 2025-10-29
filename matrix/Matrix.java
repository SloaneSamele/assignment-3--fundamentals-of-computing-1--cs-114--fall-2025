public class Matrix {
  private int[][] matrix;

  public Matrix(int size){
    matrix = new int[size][size];

    System.out.println("You have made a matrix of " + size + " X " + size);

    for(int y = 0; y < size; ++y){
      for(int x = 0; x < size; ++x){
        matrix[x][y] = 0;
      }
    }
  }
}
