import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        int count = 1;
        boolean flag = true;
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        while(true){
            if (stack.isEmpty()&&!queue.isEmpty()){   //옆길에 비켜준 사람이 없는 경우
                if (count == queue.peek()){    //대기 줄 맨 앞 사람이 count와 같을때
                    count++;
                    queue.poll();
                }
                else {                          //대기 줄 맨 앞 사람이 count와 다를 때
                    stack.push(queue.poll());
                }
            }

            else if (!stack.isEmpty() && !queue.isEmpty()){
                if (count == stack.peek()){
                    stack.pop();
                    count++;
                }
                else if (count == queue.peek()){
                    queue.poll();
                    count++;
                }
                else{
                    stack.push(queue.poll());
                }
            }

            else if (stack.isEmpty() && queue.isEmpty()){
                break;
            }

            else if (!stack.isEmpty() && queue.isEmpty()){
                if (count == stack.peek()){
                    stack.pop();
                    count++;
                }
                else {
                    flag = false;
                    break;
                }
            }

        }

        if (flag){
            bw.write("Nice");
        }
        else{
            bw.write("Sad");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}


