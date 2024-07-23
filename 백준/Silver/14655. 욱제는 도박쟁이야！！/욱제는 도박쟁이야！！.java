import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        int sum = 0;
        sum += getSumOfAbsoluteValues(br.readLine());
        sum += getSumOfAbsoluteValues(br.readLine());

        System.out.println(sum);
    }

    private static int getSumOfAbsoluteValues(String input) {
        return Arrays.stream(input.split("\\s+"))
                     .mapToInt(Integer::parseInt)
                     .map(Math::abs)
                     .sum();
    }
}
