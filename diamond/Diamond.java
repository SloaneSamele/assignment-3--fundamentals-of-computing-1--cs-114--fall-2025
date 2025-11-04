//import java.util.Scanner;
// import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int size = 3, count = 1;
    int size = 4,
        upperLimit,
        lowerLimit;
    int [][] diamond;
    // Scanner input = new Scanner(System.in);

    // System.out.println("Enter a number: ");
    // size = input.nextInt();
    // input.close();

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
}
