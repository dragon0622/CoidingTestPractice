import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stubsc.close();
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    boolean[][] no = new boolean[N+1][N+1];
    int cnt = 0;

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            no[a][b] = no[b][a] = true;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = i+1; j <= N; j++) {
                if(no[i][j] == false){
                    for (int k = j+1; k <= N; k++) {
                        if (no[i][k]==false && no[j][k] == false) {
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);

    }
}

