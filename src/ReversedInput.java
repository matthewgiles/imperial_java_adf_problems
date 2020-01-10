import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class ReversedInput {

  public static void main(String[] args) throws IOException {

    Deque<String> inputs = new ArrayDeque<String>();

    BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));

    String line = reader.readLine();

    while (!line.equals("")) {
      inputs.push(line);
      line = reader.readLine();
    }

    while (inputs.size() > 0) {
      System.out.println(inputs.pop());
    }

  }
}
