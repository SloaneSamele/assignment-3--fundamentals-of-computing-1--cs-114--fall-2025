// import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int size = 9,
        upperLimit,
        lowerLimit;
    int [][] diamond;

    // Scanner input = new Scanner(System.in);

    // System.out.println("Enter a number: ");
    // size = input.nextInt();
    // input.close();


    diamond = new int[size][size];


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
            System.out.print("x");
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
        //Top and bottom case
        if(row == 0 || row == diamond.length - 1){
          if(col == diamond.length - 1){
            System.out.print("*");
          }
          else{
            System.out.print("  ");
          }
        }
        //Middle case
        if(col >= lowerLimit && col <= upperLimit){
          if(col == diamond.length / 2){
          }
          else{
            if(col % 2 != 0){
              System.out.print(" *");
            }
          }
        }
      }

      if(row < diamond.length / 2){
        --lowerLimit;
        ++upperLimit;
      }
      else{
        ++lowerLimit;
        --upperLimit;
      }
      System.out.println();
      }
    }
  }
}
