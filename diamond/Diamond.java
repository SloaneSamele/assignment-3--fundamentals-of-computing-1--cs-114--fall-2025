import java.util.NoSuchElementException;
import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int size = 8,
        upperLimit,
        lowerLimit;
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

    lowerLimit = size / 2;
    upperLimit = size / 2;

    if(size % 2 != 0) {
      for(int row = 0; row < diamond.length; ++row) {
        for(int col = 0; col < diamond[row].length; ++col) {
          if(col <= upperLimit && col >= lowerLimit) {
            System.out.print("*");

            if(col == upperLimit) {

              break;

            }
          }
          else {
            System.out.print(" ");
          }
        }
        if(row < diamond.length / 2) {
          ++upperLimit;
          --lowerLimit;
        }
        else {
          --upperLimit;
          ++lowerLimit;
        }
        System.out.println();
      }
  }
  else {
    for(int row = 0; row < diamond.length; ++row) {
      for(int col = 0; col < diamond[row].length; ++col) {
        if(row == 0 || row == diamond.length - 1) {
          if(col >= lowerLimit && col <= upperLimit) {
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
          if(col >= lowerLimit && col <= upperLimit) {
            System.out.print(" *");
            if(col == upperLimit) {

              break;

            }
          }
          else {
            System.out.print("  ");
          }
        }
      }

      if(row < diamond.length / 2) {
        ++upperLimit;
        --lowerLimit;
      }
      else {
        --upperLimit;
        ++lowerLimit;
      }
      System.out.println();
    }
  }
 }
}
