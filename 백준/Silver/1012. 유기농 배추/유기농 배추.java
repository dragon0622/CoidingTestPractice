import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Queue;
import java. util.LinkedList;

public class Main {

    static int[][] ground; // 배추밭
    static boolean[][] check;  // 배추 유무 체크
    static int weight; // 배추밭 가로
    static int height; // 배추밭 세로
    
    public static void main(String[] args) throws IOException{
    
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bf.readLine());

        StringTokenizer st;

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(bf.readLine(), " ");   // 공백을 기준으로 나눠서 저장
            weight = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());
            ground = new int[weight][height];
            check = new boolean[weight][height];

            int K = Integer.parseInt(st.nextToken());
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(bf.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                ground[x][y] = 1;   //배추가 있는 위치를 1로 초기화
            }

            int count = 0; //지렁이의 개수 증가를 위한 count 변수

            for (int j = 0; j < weight; j++) {
                for (int k = 0; k < height; k++) {
                    
                    if(ground[j][k] == 1 && !check[j][k]){
                        bfs(j, k);  //배추가 현재 존재하고, 체크한곳이 아닐때 해당 좌표를 bfs
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

    }

    private static void bfs(int startX, int startY){
        Queue<int[]> queue = new LinkedList<>();
        //나눠있는 영역마다 bfs를 수행해야 하므로 startX, startY의 좌표로 첫 좌표를 갱신
    
        queue.offer(new int[] {startX, startY});
        // startX, startY 값으로 큐에 좌표 저장

        check[startX][startY] = true;
        //처음 배추영역의 좌표, 앞으로 나올 배추영역의 좌표는 배추가 현재 이미 존재하므로 true
    
        int[] X = {0,0,-1,+1};
        int[] Y = {-1,+1,0,0};

        while(!queue.isEmpty()){  //queue가 비어있지 않다면~
            int[] poll = queue.poll();

            for (int i = 0; i<4; i++){
                int x = poll[0] + X[i];
                int y = poll[1] + Y[i];

                if(x < 0 || x >= weight || y < 0 || y >= height){
                    continue;
                }

                if(ground[x][y] == 1 & !check[x][y]){
                    queue.offer(new int[] {x,y});
                    check[x][y] = true;
                }
            }
        }
    }
}
