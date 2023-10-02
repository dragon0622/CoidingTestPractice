
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] between = new int[n-1];
        int[] key = new int[n];
        int result = 0;

        if(n <= k){
            result = 0;
        }
        else{
            for (int i = 0; i < n; i++) {
                key[i] = sc.nextInt();
            }

            for (int i = 0; i < n-1; i++) {
                between[i] = key[i+1] - key[i] ;
            }
            Arrays.sort(between);

            for (int i = 0; i < n-k; i++) {
                result += between[i];
            }


        }



        System.out.println(result);
    }
}


