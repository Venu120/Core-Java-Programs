package patterns;

import java.util.Scanner;

public class ReversedRightRotatedTriangle {
 public static void printPattern(int n){
  for(int i = 1; i<=n; i++){
    for(int k = 1; k<i; k++) {
      System.out.print(" ");
    }
    for(int j = n; j>=i; j--) {
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