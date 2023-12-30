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
                        sb.append(-1).append("\n");
                    }
                    else{
                        sb.append(item).append("\n");
                    }
                    break;

                case "size":
                    sb.append(queue.size()).append("\n");
                    break;

                case "empty":
                    if (queue.isEmpty()){
                        sb.append(1).append("\n");
                    }
                    else{
                        sb.append(0).append("\n");
                    }
                    break;

                case "front":
                    Integer item2 = queue.peek();
                    if (item2 == null){
                        sb.append(-1).append("\n");
                    }
                    else{
                        sb.append(item2).append("\n");
                    }
                    break;

                case "back":
                    Integer item3 = queue.peekLast();
                    if (item3 == null){
                        sb.append(-1).append("\n");
                    }
                    else{
                        sb.append(item3).append("\n");
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


