public class PalindromicCubes {

  public static void main(String[] args) {

    int x = 0;

    while (x <= 2000) {
      if (isPalindrome(x * x * x)) {
        System.out.println(x + " cubed is " + (x * x * x));
      }
      x++;
    }
  }

  private static boolean isPalindrome(int x) {
    String xString = String.valueOf(x);
    if (xString.length() < 2) {
      return true;
    }
    int lower = 0;
    int upper = xString.length() - 1;
    while (upper > lower) {
      if (xString.charAt(lower) != xString.charAt(upper)) {
        return false;
      }
      upper--;
      lower++;
    }
    return true;
  }
}
