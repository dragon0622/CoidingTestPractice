import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int sum = 0;

        if (K>=N){
            sum = 0;
        }
        else {
            int[] arr =new int[N];
            int[] between = new int[N-1];

            int minus = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }


            Arrays.sort(arr);


            int longest = 0;
            for (int i = 0; i < N-1; i++) {
                between[i] = Math.abs(arr[i+1] - arr[i]);
                sum += between[i];
            }

            Arrays.sort(between);

            for (int i = N-2; i > N-K-1; i--) {
                minus += between[i];
            }

            sum = sum-minus;
        }



        System.out.println(sum);

    }

}
