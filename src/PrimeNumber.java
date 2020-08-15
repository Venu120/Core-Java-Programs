import java.util.Scanner;
public class PrimeNumber {
  public void isPrime(int n) {
    if (n <= 1) {
      System.out.println(n + " is neither Prime nor Composite.");
      System.exit(0);
    }
    int flag = 0;
    for(int i = 2; i<=n-1; i++) {
      if(n%i == 0) {
        flag = 1;
      }
    }
    if(flag == 0) {
      System.out.println(n + " is a PRIME NUMBER.");
    }
    else {
      System.out.println(n + " is NOT a Prime Number.");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number = ");
    int n = sc.nextInt();
    PrimeNumber primeNumber = new PrimeNumber();
    primeNumber.isPrime(n);
    sc.close();
  }
}