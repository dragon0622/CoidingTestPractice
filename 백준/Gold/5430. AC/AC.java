import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            String method = sc.next();
            int arrNum = sc.nextInt();
            String arr = sc.next();
            printAnswer(method, arrNum, arr);
        }
    }

    private static void printAnswer(String method, int arrNum, String arr) {

        arr = arr.replace("[", "").replace("]", "");

        String[] strNumbers = arr.split(",");
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < arrNum; i++) {
            if (!strNumbers[i].trim().isEmpty()) {
                deque.add(Integer.parseInt(strNumbers[i].trim()));
            }
        }

        boolean isReversed = false;

        for (char c : method.toCharArray()) {
            if (c == 'R') {
                isReversed = !isReversed;
            } else if (c == 'D') {
                if (deque.isEmpty()) {
                    System.out.println("error");
                    return;
                }
                if (isReversed) {
                    deque.removeLast();
                } else {
                    deque.removeFirst();
                }
            }
        }

        StringBuilder result = new StringBuilder("[");
        while (!deque.isEmpty()) {
            result.append(isReversed ? deque.removeLast() : deque.removeFirst());
            if (!deque.isEmpty()) {
                result.append(",");
            }
        }
        result.append("]");
        System.out.println(result);
    }

}
