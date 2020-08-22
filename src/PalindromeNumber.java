import java.util.Scanner;
public class PalindromeNumber {
  //Logic used will be : Reverse a number
  public boolean palindromCheck(int n){
    boolean flag = false;
    int digit = 0, reversedNumber = 0, actualNumber = n;
    while(n>0){
      digit = n % 10;
      reversedNumber = (reversedNumber * 10) + digit;
      n = n / 10;
    }
    if(reversedNumber == actualNumber) {
      flag = true;
    }
    else{
      flag = false;
    }
    return flag;
  }
  public static void main(String[] args){
    System.out.println("Enter the number to check = ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    PalindromeNumber palindromeNumber = new PalindromeNumber();
    if(palindromeNumber.palindromCheck(n)){
      System.out.println("It is a Palindrome Number");
    }
    else{
      System.out.println("It is NOT a  Palindrome Number.");
    }
  }
}