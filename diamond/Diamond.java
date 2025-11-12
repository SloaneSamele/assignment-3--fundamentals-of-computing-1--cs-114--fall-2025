import java.util.NoSuchElementException;
import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int size = 8,
        upperAstrixLimit,
        lowerAstrixLimit;
    int [][] diamond;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: ");
    try {
      size = input.nextInt();
    }
    catch(NoSuchElementException e) {
      System.out.println("Invaild number");
    }
    input.close();

    if(size % 2 == 0) {
      diamond = new int[size + 1][size + 1];
    }
    else {
      diamond = new int[size][size];
    }

    lowerAstrixLimit = size / 2;
    upperAstrixLimit = size / 2;

    if(size % 2 != 0) {
      for(int row = 0; row < diamond.length; ++row) {
        for(int col = 0; col < diamond[row].length; ++col) {
          if(col <= upperAstrixLimit && col >= lowerAstrixLimit) {
            System.out.print("*");

            if(col == upperAstrixLimit) {

              break;

            }
          }
          else {
            System.out.print(" ");
          }
        }

        if(row < diamond.length / 2) {
          ++upperAstrixLimit;
          --lowerAstrixLimit;
        }
        else {
          --upperAstrixLimit;
          ++lowerAstrixLimit;
        }

        System.out.println();
      }
  }
  else {
    for(int row = 0; row < diamond.length; ++row) {
      for(int col = 0; col < diamond[row].length; ++col) {
        if(row == 0 || row == diamond.length - 1) {
          if(col >= lowerAstrixLimit && col <= upperAstrixLimit) {
            System.out.print("*");

            break;

          }
          else {
            System.out.print("  ");
          }
        }
        else {
          if(col == diamond.length / 2){

            continue;
          }
          if(col >= lowerAstrixLimit && col <= upperAstrixLimit) {
            System.out.print(" *");
            if(col == upperAstrixLimit) {

              break;

            }
          }
          else {
            System.out.print("  ");
          }
        }
      }

      if(row < diamond.length / 2) {
        ++upperAstrixLimit;
        --lowerAstrixLimit;
      }
      else {
        --upperAstrixLimit;
        ++lowerAstrixLimit;
      }

      System.out.println();
    }
  }
 }
}
