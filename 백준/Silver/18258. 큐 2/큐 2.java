//밑에 해설이랑은 다른 버전(append.append 미적용)
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(n-- > 0) {
            StringTokenizer s = new StringTokenizer(br.readLine(), " ");

            switch (s.nextToken()){
                case "push":
                    queue.offer(Integer.parseInt(s.nextToken()));
                    break;

                case "pop":
                    Integer item = queue.poll();
                    if (item == null){
                        sb.append("-1\n");
                    }
                    else{
                        sb.append(item + "\n");
                    }
                    break;

                case "size":
                    sb.append(queue.size()+"\n");
                    break;

                case "empty":
                    if (queue.isEmpty()){
                        sb.append("1\n");
                    }
                    else{
                        sb.append("0\n");
                    }
                    break;

                case "front":
                    Integer item2 = queue.peek();
                    if (item2 == null){
                        sb.append("-1\n");
                    }
                    else{
                        sb.append(item2 + "\n");
                    }
                    break;

                case "back":
                    Integer item3 = queue.peekLast();
                    if (item3 == null){
                        sb.append("-1\n");
                    }
                    else{
                        sb.append(item3 + "\n");
                    }
                    break;
            }
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}


