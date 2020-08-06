import java.util.*;

class CalculatorAPI {
  public int add(int a, int b) {
    int result = a + b;
    return result;
  }

  public int subtract(int a, int b) {
    int result = a - b;
    return result;
  }

  public int multiply(int a, int b) {
    int result = a * b;
    return result;
  }

  public int divide(int a, int b) {
    int result = a / b;
    return result;
  }
}

public class CalculatorUsingSwitchCase {
  
  public static void addition() {
    Scanner sc = new Scanner(System.in);
    System.out.println("First Number: ");
    int a = sc.nextInt();
    System.out.println("Second Number: ");
    int b = sc.nextInt();
    CalculatorAPI calculatorAPI = new CalculatorAPI();
    int result = calculatorAPI.add(a, b);
    System.out.println("The Result is " + result);
  }

  public static void subtraction() {
    Scanner sc = new Scanner(System.in);
    System.out.println("First Number: ");
    int a = sc.nextInt();
    System.out.println("Second Number: ");
    int b = sc.nextInt();
    CalculatorAPI calculatorAPI = new CalculatorAPI();
    int result = calculatorAPI.subtract(a, b);
    System.out.println("The Result is " + result);
  }

  public static void multiplication() {
    Scanner sc = new Scanner(System.in);
    System.out.println("First Number: ");
    int a = sc.nextInt();
    System.out.println("Second Number: ");
    int b = sc.nextInt();
    CalculatorAPI calculatorAPI = new CalculatorAPI();
    int result = calculatorAPI.multiply(a, b);
    System.out.println("The Result is " + result);
  }

  public static void division() {
    Scanner sc = new Scanner(System.in);
    System.out.println("First Number: ");
    int a = sc.nextInt();
    System.out.println("Second Number: ");
    int b = sc.nextInt();
    CalculatorAPI calculatorAPI = new CalculatorAPI();
    int result = calculatorAPI.divide(a, b);
    System.out.println("The Result is " + result);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("********** M E N U **********");
      System.out.println("1. Add");
      System.out.println("2. Subtract");
      System.out.println("3. Multiply");
      System.out.println("4. Divide");
      System.out.println("5. Exit");


      System.out.println("Enter your choice: ");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          addition();
          break;
        case 2:
          subtraction();
          break;
        case 3:
          multiplication();
          break;
        case 4:
          division();
          break;
        case 5:
          System.exit(0);
      }
    }
  }
}