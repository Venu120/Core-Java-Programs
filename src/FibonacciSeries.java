import java.util.*;
public class FibonacciSeries {
  public List<Integer> fibonacciSeries(int n) {
    List<Integer> list = new ArrayList<Integer>();
    if(n == 0) {
      return null;
    }
    if(n == 1) {
      list.addAll(Arrays.asList(0));
      return list;
    }
    if(n == 2) {
      list.addAll(Arrays.asList(0,1));
      return list;
    }
    int a = 0, b = 1, c = 0;
    list.addAll(Arrays.asList(0,1));
    for (int i = 0; i < n-2; i++) {
      c = a + b;
      list.add(c);
      a = b;
      b = c;
    }
    return list;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the nth terms = ");
    int n = sc.nextInt();
    FibonacciSeries fibonacciSeries = new FibonacciSeries();
    List<Integer> list = fibonacciSeries.fibonacciSeries(n);
    System.out.println(list);
  }
}