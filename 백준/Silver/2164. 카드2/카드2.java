import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        int numOfCard = sc.nextInt();

        for (int i = 0; i < numOfCard; i++) {
            queue.add(i+1);
        }

        for (int i = 0; i < numOfCard-1; i++) {
            queue.poll();
            if (!queue.isEmpty()){
                int goBottom = queue.poll();
                queue.add(goBottom);
            }
        }

        System.out.println(queue.poll());
    }
}
