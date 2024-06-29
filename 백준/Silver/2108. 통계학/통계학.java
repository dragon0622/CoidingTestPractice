import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        first(arr);
        second(arr);
        third(arr);
        fourth(arr);
    }


    private static void first(int[] arr) {
        int sum = 0;
        int result;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        result = Math.round((float) sum /arr.length);

        System.out.println(result);

    }

    private static void second(int[] arr) {
        int targetNumber = arr.length/2;
        System.out.println(arr[targetNumber]);
    }

    private static void third(int[] arr) {
        int count = 0;
        int max = -1;
        int mod = arr[0];
        boolean check = false;
        
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i + 1]) {
                count++;
            }else {
                count = 0;
            }

            if(max < count) {
                max = count;
                mod = arr[i];
                check = true;
            }else if(max == count && check == true) {
                mod = arr[i];
                check = false;
            }
        }
        System.out.println(mod);
    }

    private static void fourth(int[] arr) {
        int cal = arr[arr.length-1] - arr[0];
        System.out.println(cal);
    }

}
