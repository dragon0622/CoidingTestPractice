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

        int start = 0;
        int end = x-1;
        int dump = 0;

        for (int i = start; i <= end; i++) {
            dump += arr[i];
        }

        while(end < arr.length){

            if (start == 0){
                sum = dump;
            }
            else{
                dump = dump-arr[start-1] + arr[end];
                sum = dump;
            }

            if (sum > max){
                max = sum;
                numbers = 1;
            }
            else if(sum == max){
                numbers++;
            }

            start++;
            end++;
        }

        if (sum == 0){
            System.out.println("SAD");
        }
        else{
            System.out.println(max + "\n" + numbers);
        }

    }
}
