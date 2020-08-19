import java.util.*;
public class FibonacciUsingRecursion {
  static int a = 0, b = 1, c = 0;
  public void fibonacciSeries(int n) {
    if(n>=1) {
      c = a + b;
      System.out.print(" " + c);
      a = b;
      b = c;
      fibonacciSeries(n - 1);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the nth term = ");
    int n = sc.nextInt();
    FibonacciUsingRecursion fibonacciUsingRecursion = new FibonacciUsingRecursion();
    System.out.print(a + " " + b);
    fibonacciUsingRecursion.fibonacciSeries(n);
  }
}