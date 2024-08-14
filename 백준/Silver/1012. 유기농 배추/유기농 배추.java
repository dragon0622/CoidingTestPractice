import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java. util.LinkedList;

public class Main {

    static int[][] baechu;
    static boolean[][] check;
    static int garo;
    static int sero;

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int cnt = 0;
        int test = Integer.parseInt(bf.readLine());

        for (int i = 0; i < test; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            garo = Integer.parseInt(st.nextToken());
            sero = Integer.parseInt(st.nextToken());
            baechu = new int[garo][sero];
            check = new boolean[garo][sero];

            extracted(st, bf);

            System.out.println(getCnt(cnt));
        }

    }

    private static void extracted(StringTokenizer st, BufferedReader bf) throws IOException {
        int K = Integer.parseInt(st.nextToken());
        for (int j = 0; j < K; j++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            baechu[x][y] = 1;
        }
    }

    private static int getCnt(int cnt) {
        for (int j = 0; j < garo; j++) {
            for (int k = 0; k < sero; k++) {
                if(baechu[j][k] == 1 && !check[j][k]){
                    bfs(j, k);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private static void bfs(int startX, int startY){
        LinkedList<int[]> queue = new LinkedList<>();

        queue.offer(new int[] {startX, startY});

        check[startX][startY] = true;

        int[] X = {0,0,-1,1};
        int[] Y = {-1,1,0,0};

        for (int k = 0; k < queue.size(); k++) {
            int[] poll = queue.get(k);

            for (int i = 0; i < 4; i++) {
                int x = poll[0] + X[i];
                int y = poll[1] + Y[i];

                if (x < 0 || x >= garo || y < 0 || y >= sero) {
                    continue;
                }

                if (baechu[x][y] == 1 && !check[x][y]) {
                    queue.add(new int[] {x, y});
                    check[x][y] = true;
                }
            }
        }


    }
}
