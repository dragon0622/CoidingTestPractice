import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(bf.readLine());

        for (int i = 0; i < cnt; i++) {
            String str = bf.readLine();
            String strArr[] = str.split(" ");

            System.out.print("Case #" + (i + 1) + ": ");
            for (int j = strArr.length - 1; j >= 0; j--) {
                System.out.print(strArr[j] + " ");
            }

            System.out.println();
        }
    }
}
