import java.util.*;
public class ArmstrongNumber {
  public static int lengthOf(int n) {
    int length = 0;
    while(n>0){
      n = n/10;
      length += 1;
    }
    return length;
  }

  public boolean armstrongNumberCheck(int n){
    int length = lengthOf(n);
    boolean flag = false;
    int originalNumber = n, armstrongNumber = 0, remainder = 0;
    while(n>0){
      remainder = n % 10;
      armstrongNumber = armstrongNumber + (int) Math.pow(remainder,length);
      n = n / 10;
    }
    if(armstrongNumber == originalNumber) {
      flag = true;
    }
    else{
      flag = false;
    }
    return flag;
  }
  
  public static void main(String[] args){
    System.out.println("Enter the number = ");
    Scanner sc =  new Scanner(System.in);
    int n = sc.nextInt();
    ArmstrongNumber armstrongNumber = new ArmstrongNumber();
    if(armstrongNumber.armstrongNumberCheck(n)){
      System.out.println("It is an Armstrong Number");
    }
    else{
      System.out.println("NOT an Armstrong Number");
    }
  }
}