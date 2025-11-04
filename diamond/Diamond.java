// import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int size = 4,
        upperLimit,
        lowerLimit;
    int [][] diamond;
    // Scanner input = new Scanner(System.in);

    // System.out.println("Enter a number: ");
    // size = input.nextInt();
    // input.close();
    if(size % 2 == 0){
      diamond = new int[size + 1][size + 1];
    }
    else{
      diamond = new int[size][size];
    }
    lowerLimit = diamond.length / 2;
    upperLimit = diamond.length / 2;

    for(int row = 0; row < diamond.length; ++row) {
      for(int col = 0; col < diamond[row].length; ++col) {
        if(col <= upperLimit && col >= lowerLimit){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      if(row < diamond.length / 2){
        ++upperLimit;
        --lowerLimit;
      }
      else{
        --upperLimit;
        ++lowerLimit;
      }
      System.out.println();
    }









    for(int row = 0; row < diamond.length; ++row) {
      for(int col = 0; col < diamond[row].length; ++col) {
        if(row != 0 || row != diamond.length - 1){
          if(col <= upperLimit && col >= lowerLimit){
            System.out.print("*");
          }
          else{
          System.out.print(" ");
        }
        }
      }
      if(row < diamond.length / 2){
        ++upperLimit;
        --lowerLimit;
      }
      else{
        --upperLimit;
        ++lowerLimit;
      }
      System.out.println();
    }
  }
}
