import java.util.*;

public class Main {
    static Deque<Integer> deque1 = new ArrayDeque<>();
    static Deque<Integer> deque2 = new ArrayDeque<>();
    static Deque<Integer> deque3 = new ArrayDeque<>();
    static Deque<Integer> deque4 = new ArrayDeque<>();

    public static void main(String[] args) {
        int NUMBER_OF_TOOTH = 8;

        Scanner sc = new Scanner(System.in);

        // 각 톱니바퀴 상태 입력
        String input1 = sc.next();
        for (int i = 0; i < NUMBER_OF_TOOTH; i++) deque1.add(input1.charAt(i) - '0');
        String input2 = sc.next();
        for (int i = 0; i < NUMBER_OF_TOOTH; i++) deque2.add(input2.charAt(i) - '0');
        String input3 = sc.next();
        for (int i = 0; i < NUMBER_OF_TOOTH; i++) deque3.add(input3.charAt(i) - '0');
        String input4 = sc.next();
        for (int i = 0; i < NUMBER_OF_TOOTH; i++) deque4.add(input4.charAt(i) - '0');

        // 회전 명령 입력
        int nRotate = sc.nextInt();
        for (int i = 0; i < nRotate; i++) {
            int rotateWheel = sc.nextInt();
            int rotateDistance = sc.nextInt();
            processRotation(rotateWheel, rotateDistance);
        }

        // 점수 계산
        int result = getScore();
        System.out.println(result);
    }

    private static void processRotation(int rotateWheel, int rotateDistance) {
        int[] rotations = new int[4];
        rotations[rotateWheel - 1] = rotateDistance;

        // 왼쪽으로 전파
        for (int i = rotateWheel - 1; i > 0; i--) {
            if (checkInteraction(getDequeByIndex(i - 1), getDequeByIndex(i))) {
                rotations[i - 1] = -rotations[i];
            } else {
                break;
            }
        }

        // 오른쪽으로 전파
        for (int i = rotateWheel - 1; i < 3; i++) {
            if (checkInteraction(getDequeByIndex(i), getDequeByIndex(i + 1))) {
                rotations[i + 1] = -rotations[i];
            } else {
                break;
            }
        }

        // 회전 실행
        for (int i = 0; i < 4; i++) {
            if (rotations[i] != 0) {
                rotate(getDequeByIndex(i), rotations[i]);
            }
        }
    }

    private static Deque<Integer> getDequeByIndex(int index) {
        switch (index) {
            case 0: return deque1;
            case 1: return deque2;
            case 2: return deque3;
            case 3: return deque4;
            default: throw new IllegalArgumentException("Invalid index: " + index);
        }
    }

    private static boolean checkInteraction(Deque<Integer> left, Deque<Integer> right) {
        // 톱니 간 상호작용 확인
        int leftRightTooth = getNthElement(left, 2); // 왼쪽 톱니의 오른쪽
        int rightLeftTooth = getNthElement(right, 6); // 오른쪽 톱니의 왼쪽
        return leftRightTooth != rightLeftTooth;
    }

    private static void rotate(Deque<Integer> deque, int direction) {
        if (direction == 1) { // 시계 방향 회전
            int n = deque.pollLast();
            deque.addFirst(n);
        } else { // 반시계 방향 회전
            int n = deque.pollFirst();
            deque.addLast(n);
        }
    }

    private static int getNthElement(Deque<Integer> deque, int index) {
        Iterator<Integer> iterator = deque.iterator();
        int currentIndex = 0;
        while (iterator.hasNext()) {
            int value = iterator.next();
            if (currentIndex == index) {
                return value;
            }
            currentIndex++;
        }
        return -1;
    }

    private static int getScore() {
        int score = 0;
        if (deque1.peekFirst() == 1) score += 1;
        if (deque2.peekFirst() == 1) score += 2;
        if (deque3.peekFirst() == 1) score += 4;
        if (deque4.peekFirst() == 1) score += 8;
        return score;
    }
}
