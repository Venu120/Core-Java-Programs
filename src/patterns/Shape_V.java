package patterns;

import java.util.Scanner;

/*
*-------*
-*-----*
--*---*
---*-*
----*
*/
public class Shape_V {
  public static void printPattern(int n) {
    for(int i = n; i >= 1; i--){
      for(int j = n; j>i; j--){
        System.out.print(" ");
      }
      for(int k = 1; k < (i*2); k++ ){
        if(k>1 && k < (i*2)-1) {
          System.out.print(" ");
        }
        else{
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows = ");
    int n = sc.nextInt();
    printPattern(n);
  }
}
