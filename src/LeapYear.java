import java.util.*;
public class LeapYear {
  public static void leapYear(int year) {
    if((year%400==0) || (year%4==0 && year%100 !=  0)) {
      System.out.println("It is a leap year.");
    }
    else {
      System.out.println("It is NOT a leap year.");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year= ");
    int year = sc.nextInt(); //Get year from user
    leapYear(year);
  }
}