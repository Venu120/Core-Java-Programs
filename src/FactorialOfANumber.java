public class FactorialOfANumber {
  public static int factorialLoop(int n){
    int factorial = 1;
    for(int i = 1; i<=n; i++) {
      factorial = factorial * i;
    }
    return factorial;
  }
  public static void main(String[] args){
    int n = 5;
    System.out.println("Factorial of " + n + " is = "+ factorialLoop(n));
  }
}