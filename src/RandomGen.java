import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class RandomGen {

  public static void main(String[] args) {

    assert args.length == 1;

    int x = Integer.parseInt(args[0]);

    Set<Integer> generated = new HashSet<Integer>();
    Random generator = new Random();

    System.out.println("Generating random numbers:");

    int next;
    int count = 0;

    while (generated.size() != x) {
      next = generator.nextInt(x);
      generated.add(next);
      System.out.print(next + " ");
      count++;
    }

    System.out.println("\nI had to generate " + count
        + " random numbers between 0 and " + (x - 1)
        + " to have produced all such numbers at least once.");
  }
}
