import java.util.*;
public class FactorialOfANumber {
  public static int factorialLoop(int n){
    int factorial = 1;
    for(int i = 1; i<=n; i++) {
      factorial = factorial * i;
    }
    return factorial;
  }
  public static int factorialRecursive(int n){
    if(n>1){
      return n*factorialRecursive(n-1);
    }
    else{
      return 1;
    }
  }
  public static void main(String[] args){
    //int n = 5;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number = ");
    int n = sc.nextInt();
    System.out.println("(Loop) Factorial of " + n + " is = "+ factorialLoop(n));
    System.out.println("(Recursive) Factorial of " + n + " is = "+ factorialRecursive(n));
  }
}