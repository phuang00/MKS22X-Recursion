import java.util.*;
public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      if (n == 0) return 0;
      return sqrtH(n, 1, tolerance);
    }

    private static double sqrtH(double n, double guess, double tolerance){
      if (Math.abs((Math.pow(guess, 2) - n) / n) * 100.0 <= tolerance) return guess;
      return sqrtH(n, (n / guess + guess) / 2, tolerance);
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 0; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      if (n == 0) return 0;
      if (n == 1) return 1;
      return fib(n - 1) + fib(n - 2);
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> ans = new ArrayList<>();
      sumsH(n, 0, ans);
      return ans;
    }

    private static void sumsH(int n, int ans, List<Integer> l){

    }


    public static void main(String[] args) {
      /*System.out.println(sqrt(100, 0.0001));
      System.out.println(sqrt(0, 0.0001));
      System.out.println(sqrt(1, 0.0001));
      System.out.println(sqrt(20, 0.0001));
      System.out.println(sqrt(36, 0.0001));
      System.out.println(sqrt(10, 0.0001));
      System.out.println(sqrt(50, 0.0001));*/
      System.out.println(fib(0));
      System.out.println(fib(1));
      System.out.println(fib(5));
    }
}
