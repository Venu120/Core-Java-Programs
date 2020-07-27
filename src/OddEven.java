import java.util.*;

public class OddEven {
  public static int oddEven(int num) {
    if(num%2==0){
      return 0;
    }
    else {
      return 1;
    }
  }
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    int flag = oddEven(num);
    if(flag == 1) {
      System.out.println("It is odd");
    }
    else {
      System.out.println("It is even");
    }
    sc.close();
  }
}