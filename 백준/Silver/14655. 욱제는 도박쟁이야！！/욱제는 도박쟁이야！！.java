import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int sum = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            sum += Math.abs(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            sum += Math.abs(Integer.parseInt(st.nextToken()));
        }

        System.out.println(sum);
    }
}
