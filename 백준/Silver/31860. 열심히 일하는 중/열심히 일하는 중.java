import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int numberOfToDo = Integer.parseInt(st.nextToken());
        int decreasePointAfterComplete = Integer.parseInt(st.nextToken());
        int completeGoal = Integer.parseInt(st.nextToken());
        int satisfiedRate = 0;
        int days = 0;

        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < numberOfToDo; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        while (!pq.isEmpty() && pq.peek() > completeGoal) {
            int currentImportantPoint = pq.poll();
            satisfiedRate = setTodaySatisfied(satisfiedRate, currentImportantPoint);
            sb.append(satisfiedRate).append("\n");

            pq.offer(currentImportantPoint - decreasePointAfterComplete);
            days++;
        }

        bw.write(days + "\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static int setTodaySatisfied(int satisfiedRate, int importantPoint) {
        return satisfiedRate / 2 + importantPoint;
    }
}
