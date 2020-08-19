import java.util.Scanner;
public class FibonacciSeries {
  public void fibonacciSeries(int n) {
    if(n == 0) {
      System.out.println("Error");
      System.exit(0);
    }
    if(n == 1) {
      System.out.println("0");
      System.exit(0);
    }
    if(n == 2) {
      System.out.println("1");
      System.exit(0);
    }
    int a = 0, b = 1, c = 0;
    System.out.print(a + " " + b);
    for (int i = 0; i < n-2; i++) {
      c = a + b;
      System.out.print(" " + c);
      a = b;
      b = c;
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the nth terms = ");
    int n = sc.nextInt();
    FibonacciSeries fibonacciSeries = new FibonacciSeries();
    fibonacciSeries.fibonacciSeries(n);
  }
}