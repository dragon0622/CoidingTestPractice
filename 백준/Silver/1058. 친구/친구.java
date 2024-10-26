import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    //입력 scanner 사용

        int n = sc.nextInt(); // n 명의 사람 수를 입력

        sc.nextLine();

        int[][] arr = new int[n][n]; // 친구 좌표를 넣을 arr 초기화

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = (line.charAt(j) == 'Y') ? 1 : 0; // 3항 연산자 -> line.charAt(j) 가 Y 이면 1을 arr에 대입 아니면 0 대입 (Y,N) 으로 주어진 입력을 1과 0으로 치환하는 과정
            }
        }

        int maxFriends = 0; //max 값 초기화

        for (int i = 0; i < n; i++) {
            boolean[] isFriend = new boolean[n]; // 친구인지 아닌지 확인 bool 형태의 배열 선언
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) { // 친구다
                    if (!isFriend[j]) {
                        isFriend[j] = true;
                        count++;
                    }
                    for (int k = 0; k < n; k++) {
                        if (arr[j][k] == 1 && k != i && !isFriend[k]) {
                            isFriend[k] = true;
                            count++;
                        }
                    }
                }
            }
            maxFriends = Math.max(maxFriends, count);
        }

        System.out.println(maxFriends);
        sc.close();
    }
}
