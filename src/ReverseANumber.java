import java.util.Scanner;

public class ReverseANumber {
  public static int reverse(int n) {
    int reversed = 0;
    int tmp;
    while(n>0) {
      tmp = n%10;
      reversed = reversed * 10 + tmp;
      n = n/10;
    }
    return reversed;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number = ");
    int n = sc.nextInt();
    System.out.println(reverse(n));
  }
}