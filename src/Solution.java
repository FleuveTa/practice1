public class Solution {
  public static long fibonacci(long n) {
    long f0 = 0;
    long f1 = 1;
    long fn = 1;
    if (n < 0) {
      return -1;
    } else if (n == 0 || n == 1) {
      return n;
    } else {
      for (int i = 2; i < n; i++) {
        f0 = f1;
        f1 = fn;
        fn = f0 + f1;
      }
      return fn;
    }
  }

  public static void main(String[] args) {
    System.out.println(fibonacci(5));
  }
}
