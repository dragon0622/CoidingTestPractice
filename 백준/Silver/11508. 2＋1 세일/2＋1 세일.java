import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[] arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr,Collections.reverseOrder());


        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            cnt++;
            if(cnt % 3 != 0){
                sum += arr[i];
            }
            else{
                continue;
            }
        }

        System.out.println(sum);


    }
}
