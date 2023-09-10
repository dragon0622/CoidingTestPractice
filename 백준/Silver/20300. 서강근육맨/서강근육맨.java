import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] M = new long[N];
        for (int i = 0; i < N; i++) {
            M[i] = sc.nextLong();
        }

        
        Arrays.sort(M);

        long sum = 0;
        long max = M[N-1];

        if(N % 2 == 1){
            for (int i = 1; i <= N/2; i++) {
                sum = M[i-1] + M[N - i - 1];

                if(max<sum){
                    max = sum;
                }
            }
        }
        else{
            for (int i = 1; i <= N/2; i++) {
                sum = M[i-1] + M[N - i];

                if(max<sum){
                    max = sum;
                }
            }
        }
        
        System.out.println(max);

        sc.close();
    }
}
