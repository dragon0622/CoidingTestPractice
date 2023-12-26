import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Deque<int[]> deque = new ArrayDeque<>();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        sb.append("1 ");

        int in = arr[0];

        for (int i = 1; i < n; i++) {
            deque.add(new int[]{(i+1), arr[i]});
        }

        while(!deque.isEmpty()){
            if (in > 0){
                for (int i = 1; i < in; i++) {
                    deque.add(deque.poll());
                }

                int[] next = deque.poll();
                in = next[1];
                sb.append(next[0] + " ");
            }

            else{
                for (int i = 1; i < -in; i++) {
                    deque.addFirst(deque.pollLast());
                }

                int[] next = deque.pollLast();
                in = next[1];
                sb.append(next[0] + " ");
            }
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());

    }

}


