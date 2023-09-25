import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []arr = new int[n+1];
        int []sum = new int[n+1];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum[i] = arr[i]+sum[i-1];
        }

        int result = 0;

        //bee_bee_pot
        for (int i = 2; i <= n-1; i++) {
            int tmp = sum[n] - arr[1] - arr[i] + sum[n] - sum[i];
            result = Math.max(tmp, result);
        }

        //bee_pot_bee
        for (int i = 2; i <= n-1; i++) {
            int tmp = sum[n-1] - sum[i-1] + sum[i] - sum[1];
            result = Math.max(tmp, result);
        }

        //pot_bee_bee
        for (int i = 2; i <= n-1; i++) {
            int tmp = sum[n-1] - arr[i] + sum[i-1];
            result = Math.max(tmp, result);
        }

        System.out.println(result);

        }

}