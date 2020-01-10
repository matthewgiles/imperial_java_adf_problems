import java.util.Arrays;
import java.util.List;

public class PigLatin {

  public static void main(String[] args) {

    assert args.length > 0;

    StringBuilder result = new StringBuilder();

    for (String word : args) {
      result.append(toPig(word));
      result.append(" ");
    }

    System.out.println(result.toString());

  }

  private static String toPig(String str) {

    char zero = str.charAt(0);

    String vowels = "aeiouAEIOU";

    if (Character.isLetter(zero)) {

      if (vowels.indexOf(zero) == -1) {
        str = str.substring(1) + (String.valueOf(zero)).toLowerCase() + "ay";
      } else {
        str += "way";
      }

      if (Character.isUpperCase(zero)) {
        str = (String.valueOf(str.charAt(0)).toUpperCase()) + str.substring(1);
      }
      return str;

    }
    return str;
  }
}