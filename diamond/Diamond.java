// import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int size = 8,
        upperLimit,
        lowerLimit;
    int [][] diamond;

    // Scanner input = new Scanner(System.in);

    // System.out.println("Enter a number: ");
    // size = input.nextInt();
    // input.close();

    if(size % 2 == 0){
      diamond = new int[size + 1][size * 2 + 1];
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
        if(col == size / 2 && (row > 0  && row < diamond.length - 1)){
        }
        else{
          if(col >= lowerLimit && col <= upperLimit){
            if(col % 2 == 0){
              System.out.print("*");
            }
            else{
              System.out.print(" ");
            }
          }
          else{
            System.out.print(" ");
          }
        }
      }
      System.out.print("lower limit: " + lowerLimit + " Upper Limit: " + upperLimit);
      if(row < diamond.length / 2 ){
        upperLimit += 2;
        --lowerLimit;
      }
      else{
        upperLimit -= 2;
        --lowerLimit;
      }
      System.out.println();
      }
    }
  }
}
