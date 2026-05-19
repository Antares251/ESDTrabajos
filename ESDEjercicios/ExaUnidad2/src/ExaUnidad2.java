public class ExaUnidad2 {

  public static int Exa2(int n, int r) {
    return n == 0 || n == 1 || r == 0 || n == r ? 1 : Exa2(n - 1, r) + Exa2(n - 1, r - 1);
  }

  public static void main(String[] args) {
    for (int i = 0; i <= 6; i++) {
      for (int ii = 0; ii <= i; ii++) {
        System.out.print(Exa2(i, ii) + " ");
      }
      System.out.println();
    }
  }
}
