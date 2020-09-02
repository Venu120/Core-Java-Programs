package patterns;
import java.util.Scanner;

public class DiagonalStars {
  public static void leftDiagonal(int n) {
    for (int i = 1; i <= n; i++) {
      for(int j = 1; j<i; j++) {
        System.out.print("-");
      }
      System.out.print("*\n");
    }
  }

  public static void rightDiagonal(int n) {
    for (int i = 1; i <=n; i++){
      for(int j = n; j >i; j--) {
        System.out.print("-");
      }
      System.out.print("*\n");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows = ");
    int n = sc.nextInt();
    leftDiagonal(n);
    rightDiagonal(n);
  }
}