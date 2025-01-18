import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            answer[i] = 0;
        }

        for (int i = 0; i < N; i++) {
            placePosition(answer, arr, i);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(answer[i] + " ");
        }

    }

    private static void placePosition(int[] answer, int[] arr, int i) {
        int cnt = 0;
        int target = arr[i];

        for (int j = 0; j < answer.length; j++) {
            if (answer[j] == 0) {
                if (cnt == target) {
                    answer[j] = i + 1;
                    break;
                }
                cnt++;
            }
        }
    }

}
