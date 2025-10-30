import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int size;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a the size of your matrix");
    size = input.nextInt();
    input.close();

    Matrix matrix = new Matrix(size);

    System.out.println("\nPrinting matrix with defalut values:");
    matrix.printMatrix();

    System.out.println("\nPopulating matrix with values....matrix populated:\n");
    matrix.populateMatrix();

    System.out.println("Printing matrix:");
    matrix.printMatrix();

    System.out.println("\nFlipping matrix....matrix flipped:\n");
    matrix.flipMatrix();

    System.out.println("Printing flipped matrix:");
    matrix.printMatrix();
  }
}
