import java.util.Scanner;
public class SwapTwoNumbers {
  public static void swapWithThirdVariable(int a, int b) {
    //Logic goes here
    int temp = a;
    a = b;
    b = temp;
    System.out.println("a = "+a+", b = "+b);
  }
  public static void swapWithoutVariable(int a, int b) {
    //Logic goes here
    a = a+b;
    b = a-b;
    a = a-b;
    System.out.println("a = "+a+", b = "+b);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insert the two numbers = ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Before Swapping, a = " + a + ", b = " + b);
    System.out.println("Swapping with third variable = ");
    swapWithThirdVariable(a, b);
    System.out.println("Swapping without third variable = ");
    swapWithoutVariable(a, b);
  }

  
}