import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Arrays;
public class Main {

    static int budget;
    static int n;
    static int[] arr;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int sum = 0;
        
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken(" "));
            sum += arr[i];
        }

        Arrays.sort(arr);

        m = Integer.parseInt(bf.readLine());

        int left = 0;
        int right = arr[n-1];

        while (left <= right) {
            int mid = (left + right) / 2;
            long budget = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>mid) {
                    budget += mid;
                }
                else{
                    budget += arr[i];
                }
                
            }
            if (budget <= m) {
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }
        System.out.println(right);

        }
}