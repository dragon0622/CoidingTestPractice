import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub`
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] min = new int[N];

        for (int i = 0; i < N; i++) {
            min[i] = sc.nextInt();
        }

        Arrays.sort(min);

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                sum += min[j];
            }
        }
        System.out.println(sum);


        sc.close();
    }

}

