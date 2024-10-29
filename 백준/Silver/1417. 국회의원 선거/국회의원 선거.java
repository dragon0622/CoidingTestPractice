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

        while(true){
            arr = operation(maxIdx, arr);
            maxIdx = whoIsTop(arr);

            if (maxIdx == 0){
                break;
            }
        }

        int answer = start - arr[0];

        System.out.println(Math.abs(answer));

        sc.close();
    }

    private static int[] operation(int i1, int[] arr) {
        arr[0] ++;
        arr[i1]--;
        return arr;
    }

    private static int whoIsTop(int[] arr) {
        int maxIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[maxIdx] <= arr[i]){
                maxIdx = i;
            }
        }


        return maxIdx;
    }
}
