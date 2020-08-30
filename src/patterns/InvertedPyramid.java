package patterns;

import java.util.Scanner;

public class InvertedPyramid {
  public static void printPattern(int n) {
    for (int i = 1; i <= n; i++) { // number of rows
      for (int j = 1; j < i; j++) { // loop to print first part of the triangle with spaces
        System.out.print(" ");
      }
      for (int k = n; k >= i; k--) { // loop to print second part of the triangle with *
        System.out.print("*");
      }
      for (int l = n - 1; l >= i; l--) { // loop to print third part of the triangle with *
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
  }
}