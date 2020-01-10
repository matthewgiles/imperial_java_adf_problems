import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lottery {

  public static void main(String[] args) {

    Set<Integer> winners = new HashSet<Integer>();

    Random gen = new Random();

    int next;

    for (int x = 0; x < 7; x++) {
      next = gen.nextInt(49) + 1;

      while (winners.contains(next)) {
        next = gen.nextInt(49) + 1;
      }

      winners.add(next);

      if (x == 6) {
        System.out.print("Bonus Number: " + next);
      } else {
        System.out.println("Number " + (x + 1) + ": " + next);
      }

    }
  }

}
