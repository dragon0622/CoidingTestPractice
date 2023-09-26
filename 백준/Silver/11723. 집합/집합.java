import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws Exception{


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int M = Integer.parseInt(br.readLine());
    HashSet<Integer> set = new HashSet<>();
    StringBuilder sb = new StringBuilder();


        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String calculate = st.nextToken();
            int n = 0;

            switch (calculate){
                case "add":
                    n = Integer.parseInt(st.nextToken());
                    set.add(n);
                    break;
                case "remove":
                    n = Integer.parseInt(st.nextToken());
                    set.remove(n);
                    break;
                case "check":
                    n = Integer.parseInt(st.nextToken());
                    sb.append(set.contains(n)? "1":"0").append("\n");
                    break;
                case "toggle":
                    n = Integer.parseInt(st.nextToken());
                    if (set.contains(n)) {
                        set.remove(n);
                    }
                    else{
                        set.add(n);
                    }
                    break;
                case "all":
                    set.clear();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        System.out.println(sb);
    }
    
}
