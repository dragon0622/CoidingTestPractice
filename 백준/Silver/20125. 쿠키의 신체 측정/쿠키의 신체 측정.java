import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[][] map = new char[n][n];

        for (int i = 0; i < n; i++) {
            map[i] = sc.next().toCharArray();
        }

        int headX = 0, headY = 0;

        // 머리 좌표 찾기
        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == '*') {
                    headX = i;
                    headY = j;
                    break outer;
                }
            }
        }

        int heartX = headX + 1;
        int heartY = headY;

        // 왼팔 길이
        int leftArm = 0;
        for (int j = heartY - 1; j >= 0; j--) {
            if (map[heartX][j] == '*') leftArm++;
            else break;
        }

        // 오른팔 길이
        int rightArm = 0;
        for (int j = heartY + 1; j < n; j++) {
            if (map[heartX][j] == '*') rightArm++;
            else break;
        }

        // 허리 길이
        int waist = 0;
        for (int i = heartX + 1; i < n; i++) {
            if (map[i][heartY] == '*') waist++;
            else break;
        }

        // 왼다리 길이
        int leftLeg = 0;
        for (int i = heartX + waist + 1; i < n; i++) {
            if (map[i][heartY - 1] == '*') leftLeg++;
            else break;
        }

        // 오른다리 길이
        int rightLeg = 0;
        for (int i = heartX + waist + 1; i < n; i++) {
            if (map[i][heartY + 1] == '*') rightLeg++;
            else break;
        }

        // 출력
        System.out.println((heartX + 1) + " " + (heartY + 1)); // 심장 좌표 (1-indexed)
        System.out.println(leftArm + " " + rightArm + " " + waist + " " + leftLeg + " " + rightLeg);
    }
}
