import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int[] arr = new int[input+1];

        arr[1] = 0;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] +1;
            if (i % 2 == 0 && arr[i] > arr[i/2] + 1) {
                arr[i] = arr[i/2] + 1;
            }
            if (i % 3 == 0 && arr[i] > arr[i/3] + 1) {
                arr[i] = arr[i/3] + 1;
            }
        }
        System.out.println(arr[input]);
    }
}
