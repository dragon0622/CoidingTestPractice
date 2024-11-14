import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int busNum = sc.nextInt();
        int ys = sc.nextInt();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < busNum; i++) {

            int startBus = sc.nextInt();
            int betweenBus = sc.nextInt();
            int numberOfBus = sc.nextInt();

            int makeTime = makeTime(ys, startBus, betweenBus, numberOfBus);

            if (makeTime >= ys) { // ys 이후의 도착 시간만 고려
                priorityQueue.offer(makeTime);
            }
        }

        if (priorityQueue.isEmpty()) {
            System.out.println(-1); // ys 이후 도착하는 버스가 없을 때
        } else {
            int min = priorityQueue.peek();
            printResult(min, ys);
        }

    }

    private static void printResult(int min, int ys) {

        int result = min-ys;

        if (result < 0){
            System.out.println(-1);
        }
        else{
            System.out.println(result);
        }
    }

    private static int makeTime(int ys, int startBus, int betweenBus, int numberOfBus) {

        int answer = startBus;

        while (answer < ys && numberOfBus > 1) {
            answer += betweenBus;
            numberOfBus--;
        }

        return answer;
    }
}
