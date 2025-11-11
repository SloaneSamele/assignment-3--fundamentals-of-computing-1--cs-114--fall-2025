import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int size = 8,
        upperLimit,
        lowerLimit;
    int [][] diamond;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: ");
    size = input.nextInt();
    input.close();
    if(size % 2 == 0){
      diamond = new int[size + 1][size + 1];
    }
    else{
      diamond = new int[size][size];
    }

    lowerLimit = size / 2;
    upperLimit = size / 2;

    System.out.println("heigth: " + diamond.length + " width: " + diamond[0].length);

    if(size % 2 != 0){
      System.out.println("odd case");

      for(int row = 0; row < diamond.length; ++row) {
        for(int col = 0; col < diamond[row].length; ++col) {
          if(col <= upperLimit && col >= lowerLimit){
            System.out.print("*");

            if(col == upperLimit){

              break;

            }
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
  }
  else{
    System.out.println("even case");

    for(int row = 0; row < diamond.length; ++row){
      for(int col = 0; col < diamond[row].length; ++col){
        //Top and Bottom Case
        if(row == 0 || row == diamond.length - 1){
          if(col >= lowerLimit && col <= upperLimit){
            System.out.print("*");

            break;

          }
          else{
            System.out.print("  ");
          }
        }
        //Middle Cases
        else{
          if(col == diamond.length / 2){
            continue;

          }

          if(col >= lowerLimit && col <= upperLimit){
            System.out.print(" *");
            if(col == upperLimit){

              break;
            }
          }
          else{
            System.out.print("  ");
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
}
