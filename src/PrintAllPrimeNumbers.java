import java.util.Scanner;
public class PrintAllPrimeNumbers {
  public void allPrimes(int n) {
    if(n<=1) {
      System.out.println(n + " is neither PRIME nor Composite.");
      System.exit(0);
    }
    int flag = 0;
    for (int i = 2; i <= n; i++) {
      flag = 0;
      for (int j = 2; j<i; j++) {
        if(i%j == 0) {
          flag = 1;
        }
      }
      if(flag == 0) {
        System.out.println(i + " is a PRIME NUMBER.");
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the range number = ");
    int n = sc.nextInt();
    PrintAllPrimeNumbers printAllPrimeNumbers = new PrintAllPrimeNumbers();
    printAllPrimeNumbers.allPrimes(n);
  }
}