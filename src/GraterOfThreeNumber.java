import java.util.*;
class GraterOFThreeNumber {
  public static int greaterTwo(int a, int b) {
    if(a>b) {
      return a;
    }
    else {
      return b;
    }
  }
  public static int greaterThree(int a,int b, int c) {
    if (a>b) {
      if(a>c) {
        return a;
      }
      else {
        return c;
      }
    }
    else if(b>c) {
      return b;
    }
    else {
      return c;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Value:");
    int a = sc.nextInt();
    System.out.println("Enter a Value:");
    int b = sc.nextInt();
    System.out.println("Enter a Value:");
    int c = sc.nextInt();
    System.out.println("The grater of two numbers is = " + greaterTwo(a,b));
    System.out.println("Gratest of the three numbers is = " + greaterThree(a,b,c));    
  }
}