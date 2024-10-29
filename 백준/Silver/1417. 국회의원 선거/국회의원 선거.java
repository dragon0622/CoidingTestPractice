import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int start = arr[0];
        int maxIdx = whoIsTop(arr);
        while (maxIdx != 0) {
            arr[0]++;
            arr[maxIdx]--;
            maxIdx = whoIsTop(arr);
        }

        int answer = start - arr[0];
        System.out.println(Math.abs(answer));
    }
    private static int whoIsTop(int[] arr) {
        int maxIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
