import java.util.Scanner;
public class PrintMultiplicationTable {

  public static void displaTableOf(int n) {
    System.out.println("Multiplication table of " + n);
    for(int i = 1; i<= 10; i++) {
      System.out.println(n + " x " + i + " = " + (n*i));
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number: ");
    int n = sc.nextInt();
    displaTableOf(n);
  }
}