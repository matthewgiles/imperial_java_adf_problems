public class Terminate {

  public static void main(String[] args) {

    assert args.length == 1;

    int num = Integer.parseInt(args[0]);

    System.out.print(num);

    while (num != 1) {
      num = next(num);
      System.out.print(" " + num);
    }
  }

  private static int next(int n) {
    return (n % 2 == 0) ? (n/2) : (3 * n + 1);
  }
}
