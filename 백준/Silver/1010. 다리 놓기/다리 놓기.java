import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub`

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int N,M;
        long[]arr = new long[tc];

        for (int i = 0; i < tc; i++) {

            N = sc.nextInt();
            M = sc.nextInt();
            arr[i] = c(M,N);
        }

        for (int i = 0; i < tc; i++) {
            System.out.println(arr[i]);
        }
    }

    public static long c(int a, int b) {

        long result= 1;

        for (int i = 0; i < b; i++) {
            result *= (a-i);
            result /= (i+1);
        }
        return result;
    }
}

