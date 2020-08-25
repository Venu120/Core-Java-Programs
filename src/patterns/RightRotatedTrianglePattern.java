package patterns;

import java.util.Scanner;

public class RightRotatedTrianglePattern {
  public static void printPattern(int n) {

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 1; i <= n; i++) {
      for (int j = n - 1; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows = ");
    int n = sc.nextInt();
    printPattern(n);
    /*
     for n = 4
     
     *
     **
     ***
     ****
     ***
     **
     *
 
    */
  }
}