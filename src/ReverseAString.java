import java.util.Scanner;
public class ReverseAString {
  public String reverseString(String string) {
    String reversedString = "";
    int stringLength = string.length();
    for(int i = stringLength-1; i>=0; i--) {
      reversedString = reversedString + string.charAt(i);
    }
    return reversedString;
  }
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter a name = ");
    String string = sc.next();    
    ReverseAString obj = new ReverseAString();
    System.out.println(obj.reverseString(string));
  }
}