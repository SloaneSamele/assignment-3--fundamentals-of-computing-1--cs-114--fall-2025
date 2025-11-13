import java.util.NoSuchElementException;
import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int size = 0,
        upperAstrixLimit,
        lowerAstrixLimit;
    boolean isEven = false;

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
      ++size;
      isEven = true;
    }

    lowerAstrixLimit = size / 2;
    upperAstrixLimit = size / 2;

    for(int row = 0; row < size; ++row){
      for(int col = 0; row < size; ++col){
        if(isEven){
          if(row == 0 || row == size - 1){
            if(col >= lowerAstrixLimit && col <= upperAstrixLimit){
              System.out.print("*");

              break;
            }
            else{
              System.out.print("");
            }
          }

          if(col >= lowerAstrixLimit && col <= upperAstrixLimit){
            if(col == size / 2){
              continue;
            }
            System.out.print(" *");
            if(col == upperAstrixLimit){
              break;
            }
          }
          else{
            System.out.print("  ");
          }
        }
        else{
          if(col >= lowerAstrixLimit && col <= upperAstrixLimit){
            System.out.print("*");
            if(col == upperAstrixLimit){
              break;
            }
          }
          else{
            System.out.print(" ");
          }
        }
      }
      System.out.println();
      if(row < size / 2){
        ++upperAstrixLimit;
        --lowerAstrixLimit;
      }
      else{
        --upperAstrixLimit;
        ++lowerAstrixLimit;
      }
    }
  }
}
