import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            String line = br.readLine();
            for (int j = 0; j < 8; j++) {
                char character = line.charAt(j);
                if (character == 'F'){
                    cnt = getCnt(i, j, cnt);
                }
            }
        }
        System.out.println(cnt);
    }

    private static int getCnt(int i, int j, int cnt) {
        if ((i + j)%2 == 0){
            cnt++;
        }
        return cnt;
    }
}
