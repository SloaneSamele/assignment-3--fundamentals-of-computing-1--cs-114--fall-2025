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

  private void swap(int x1,int y1,int x2,int y2){
    int tempHolder = matrix[x1][y1];

    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = tempHolder;
  }
  public void printMatrix(){
    for(int y = 0; y < matrix.length; ++y) {
      for(int x = 0; x < matrix[y].length; ++x) {
        System.out.print(matrix[x][y] + " ");
      }
      System.out.println();
    }
  }
  public void flipMatrix(){
    int lastValue = matrix.length - 1;
    for(int y = 0; y < matrix.length / 2; ++y){
      for(int x = 0; x < matrix.length; ++x){
        if((x + y) != lastValue){
          swap(x, y, (lastValue - y), (lastValue - x));
        }
      }
    }
  }
}
