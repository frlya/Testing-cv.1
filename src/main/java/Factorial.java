public class Factorial {

  public static int recursive(int n) {
    return n == 1? 1 :  n * Factorial.recursive(n - 1);
  }
}
