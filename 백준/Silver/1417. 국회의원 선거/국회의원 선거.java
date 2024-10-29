import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
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
        sc.close();
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
