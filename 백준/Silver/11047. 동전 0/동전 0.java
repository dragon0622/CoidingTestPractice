import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  //동전 종류
        int k = sc.nextInt();  //목표 금액
        Integer pot = k;
        Integer cnt = 0;

        Integer[] value = new Integer[n];
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
        }

        Arrays.sort(value, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {

            if(pot == 0){
                break;
            }
            if(pot >= value[i]){
                cnt += pot/value[i];
                pot %= value[i];

            }
        }
        System.out.println(cnt);
    }

}


