// import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int size = 6,
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

    diamond = new int[size][size];

    lowerLimit = size / 2;
    upperLimit = size / 2;

    // for(int r = 0; r < diamond.length; ++r) {
    //   for(int c = 0; c < diamond[r].length; ++c) {
    //     if(c <= upperLimit && c >= lowerLimit){
    //       System.out.print("*");
    //     }
    //     else{
    //       System.out.print(" ");
    //     }
    //   }
    //   if(r < diamond.length / 2){
    //     ++upperLimit;
    //     --lowerLimit;
    //   }
    //   else{
    //     --upperLimit;
    //     ++lowerLimit;
    //   }
    //   System.out.println();
    // }

    for(int r = 0; r < diamond.length; ++r){
      for(int c = 0; c < diamond[r].length; ++c){
        if(c == size / 2 && (r > 0  && r < diamond.length - 1)){
          System.out.print(" ");
        }
        else{
          if(c >= lowerLimit && c <= upperLimit){
            System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
      }
      if(r < diamond.length / 2 ){
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
