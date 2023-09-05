import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int max = 0;

        for (int i = 0; i < N; i++) {
            max = Math.max(max, arr[i]*(N-i));
        }

        System.out.println(max);
        

        sc.close();
    }
}
