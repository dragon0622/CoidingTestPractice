import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());


        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;

        String arr1[] = new String[N];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = bf.readLine();
        }

        for (int i = 0; i < M; i++) {
            String target = bf.readLine();
            for (int j = 0; j < N; j++) {
                if(arr1[j].equals(target)){
                    cnt++;
                }    
            }
        }

        System.out.println(cnt);


    }
}
