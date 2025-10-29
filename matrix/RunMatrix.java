import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int size;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a the size of your matrix");
    size = input.nextInt();
    input.close();

    Matrix matrix = new Matrix(4);

    matrix.printMatrix();
    System.out.println();
    matrix.populateMatrix();
    matrix.printMatrix();
    System.out.println();
    matrix.flipMatrix();
    matrix.printMatrix();

  }
}
