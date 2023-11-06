import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int result = 0;


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            result += arr[i] - 1;
        }

        result += 1;

        System.out.println(result);


    }
}