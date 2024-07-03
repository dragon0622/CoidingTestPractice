import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] size = new int[n][2];

        for (int i = 0; i < n; i++) {
            size[i][0] = sc.nextInt();
            size[i][1] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (i == j){
                    continue;
                }
                if (size[i][0] < size[j][0] && size[i][1] < size[j][1]){
                    rank++;
                }
            }

            System.out.println(rank);
        }

    }
}
