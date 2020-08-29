package patterns;

import java.util.Scanner;

public class pyramidPattern2 {
  public static void printPattern(int n) {
    for(int i = 1; i<=n; i++) {
      for(int j=n; j>=i; j--) {
        System.out.print(" ");
      }
      for(int k = 1; k<=i;k++) {
        System.out.print("*");
      }
      for(int l = 2; l<=i; l++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows = ");
    int n = sc.nextInt();
    printPattern(n);
  }
}