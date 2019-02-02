import java.util.*;
public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      if (n == 0) return 0;
      // if n is equal to zero, return zero
      return sqrtH(n, 1, tolerance);
      // else call the helper method with 1 as the initial guess
    }

    private static double sqrtH(double n, double guess, double tolerance){
      if (Math.abs((Math.pow(guess, 2) - n) / n) * 100.0 <= tolerance) return guess;
      //if the percent error is less than tolerance, return the guess;
      return sqrtH(n, (n / guess + guess) / 2, tolerance);
      // else call the method again with an updated guess
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 0; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return fibH(n, 0, 1);
      // call helper method with the first two numbers in the fibbonaci sequence
    }

    private static int fibH(int n, int one, int two){
      if (n == 0) return one;
      // if n is zero, return first number (one)
      if (n == 1) return two;
      // if n is one, return the second number (two)
      return fibH(n - 1, two, one + two);
      // else call itself again but with n decreased by one. the first number (one) becomes the second
      // and the second (two) becomes the sum of the first and second.
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> ans = new ArrayList<>();
      // creates a new ArrayList
      sumsH(n, 0, ans);
      // calls helper function
      return ans;
      // return modified ArrayList
    }

    private static void sumsH(int n, int ans, List<Integer> l){
      if (n == 0) l.add(ans);
      // if n is zero, add the sum (ans) to the list
      else{
        sumsH(n - 1, ans + n, l);
        // else call itself with n-1 as n and the ans raised by n (adding the number to the partial sum)
        sumsH(n - 1, ans, l);
        // also call itself with n-1 as n but does not increase ans (not adding the number to the partial sum)
      }
    }


    public static void main(String[] args) {
      System.out.println();
      System.out.println("Sqrt of 0: " + sqrt(0, 0.0001));
      System.out.println("Sqrt of 100: " + sqrt(100, 0.0001));
      System.out.println("Within tolerance percentage: " + ((sqrt(100, 0.0001) - Math.sqrt(100)) / Math.sqrt(100) * 100 < 0.0001));
      System.out.println("Sqrt of 1: " + sqrt(1, 0.0001));
      System.out.println("Within tolerance percentage: " + ((sqrt(1, 0.0001) - Math.sqrt(1)) / Math.sqrt(1) * 100 < 0.0001));
      System.out.println("Sqrt of 20: " + sqrt(20, 0.0001));
      System.out.println("Within tolerance percentage: " + ((sqrt(20, 0.0001) - Math.sqrt(20)) / Math.sqrt(20) * 100 < 0.0001));
      System.out.println("Sqrt of 36: " + sqrt(36, 0.0001));
      System.out.println("Within tolerance percentage: " + ((sqrt(36, 0.0001) - Math.sqrt(36)) / Math.sqrt(36) * 100 < 0.0001));
      System.out.println("Sqrt of 10: " + sqrt(10, 0.0001));
      System.out.println("Within tolerance percentage: " + ((sqrt(10, 0.0001) - Math.sqrt(10)) / Math.sqrt(10) * 100 < 0.0001));
      System.out.println("Sqrt of 50: " + sqrt(50, 0.0001));
      System.out.println("Within tolerance percentage: " + ((sqrt(50, 0.0001) - Math.sqrt(50)) / Math.sqrt(50) * 100 < 0.0001));
      System.out.println();
      System.out.println("Fib 0 (should print 0): " + fib(0));
      System.out.println("Fib 1 (should print 1): " + fib(1));
      System.out.println("Fib 2 (should print 1): " + fib(2));
      System.out.println("Fib 3 (should print 2): " + fib(3));
      System.out.println("Fib 4 (should print 3): " + fib(4));
      System.out.println("Fib 5 (should print 5): " + fib(5));
      System.out.println("Fib 6 (should print 8): " + fib(6));
      System.out.println("Fib 7 (should print 13): " + fib(7));
      System.out.println();
      System.out.println("makeAllSums(6): \n  (should print [21, 20, 19, 18, 18, 17, 16, 15, 17, 16, 15, 14, 14, 13, 12, 11, 16, 15, 14, 13, 13, 12, 11, 10, 12, 11, 10, 9, 9, 8, 7, 6, 15, 14, 13, 12, 12, 11, 10, 9, 11, 10, 9, 8, 8, 7, 6, 5, 10, 9, 8, 7, 7, 6, 5, 4, 6, 5, 4, 3, 3, 2, 1, 0]) \n\t\t" + makeAllSums(6));
      System.out.println("makeAllSums(5): \n  (should print [15, 14, 13, 12, 12, 11, 10, 9, 11, 10, 9, 8, 8, 7, 6, 5, 10, 9, 8, 7, 7, 6, 5, 4, 6, 5, 4, 3, 3, 2, 1, 0]) \n\t\t" + makeAllSums(5));
      System.out.println("makeAllSums(4): \n  (should print [10, 9, 8, 7, 7, 6, 5, 4, 6, 5, 4, 3, 3, 2, 1, 0]) \n\t\t" + makeAllSums(4));
      System.out.println("makeAllSums(3): \n  (should print [6, 5, 4, 3, 3, 2, 1, 0]) \n\t\t" + makeAllSums(3));
      System.out.println("makeAllSums(2): \n  (should print [3, 2, 1, 0]) \n\t\t" + makeAllSums(2));
      System.out.println("makeAllSums(1): \n  (should print [1, 0]) \n\t\t" + makeAllSums(1));
      System.out.println("makeAllSums(0): \n  (should print [0]) \n\t\t" + makeAllSums(0));
    }
}
