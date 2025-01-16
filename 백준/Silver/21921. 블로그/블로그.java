import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        solution(arr, X);
    }

    private static void solution(int[] arr, int x) {

        int max = 0;
        int numbers = 0;

        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += arr[i];
        }

        int start = 0;
        int end = x - 1;

        while (end < arr.length) {
            if (sum > max) {
                max = sum;
                numbers = 1;
            } else if (sum == max) {
                numbers++;
            }

            start++;
            end++;
            if (end < arr.length) {
                sum = sum - arr[start - 1] + arr[end];
            }
        }

        if (max == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(max + "\n" + numbers);
        }
    }
}
