package patterns;

import java.util.Scanner;

public class Pyramid {
  public static void printPattern(int n) {
    for (int i = 1; i <= n; i++) {
      for(int k = n; k>=i; k--) {
        System.out.print(" ");
      }
      for (int j = 1; j<=i; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }
  }
  public static void printPatternWithSecondMethod(int n) {
    for(int i = 1; i <= n; i++) {
      for(int j = n; j>=1; j--) {
        if(j>i) {
          System.out.print(" ");
        }
        else{
          System.out.print(" *");
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
    printPatternWithSecondMethod(n);
  }
}