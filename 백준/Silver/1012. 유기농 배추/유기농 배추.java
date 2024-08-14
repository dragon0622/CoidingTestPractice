import java.io.*;
import java.util.StringTokenizer;
import java. util.LinkedList;

public class Main {

    static int[][] baechu;
    static boolean[][] invite;
    static int garo;
    static int sero;

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        int test = Integer.parseInt(bf.readLine());

        for (int i = 0; i < test; i++) {
            int jirungs = 0;
            st = new StringTokenizer(bf.readLine(), " ");
            garo = Integer.parseInt(st.nextToken());
            sero = Integer.parseInt(st.nextToken());
            baechu = new int[garo][sero];
            invite = new boolean[garo][sero];

            extracted(st, bf);

            jirungs = getCnt(jirungs);

            bw.write(String.valueOf(jirungs)+"\n");
        }
        bw.flush();
        bw.close();
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

    private static int getCnt(int jirungs) {
        for (int j = 0; j < garo; j++) {
            for (int k = 0; k < sero; k++) {
                if(baechu[j][k] == 1 && !invite[j][k]){
                    bfs(j, k);
                    jirungs++;
                }
            }
        }
        return jirungs;
    }

    private static void bfs(int startX, int startY){
        LinkedList<int[]> queue = new LinkedList<>();

        queue.offer(new int[] {startX, startY});

        invite[startX][startY] = true;

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

                if (baechu[x][y] == 1 && !invite[x][y]) {
                    queue.add(new int[] {x, y});
                    invite[x][y] = true;
                }
            }
        }


    }
}
