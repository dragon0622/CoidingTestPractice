import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        String[] board = new String[row];

        for (int i = 0; i < row; i++) {
            board[i] = sc.next();
        }

        int cnt = Integer.MAX_VALUE;
        for (int i = 0; i <= row-8; i++) {
            for (int j = 0; j <= col-8; j++) {
                int resultCnt = getMin(i,j,board);

                if (resultCnt < cnt){
                    cnt = resultCnt;
                }
            }
        }

        System.out.println(cnt);
    }

    private static int getMin(int startRow, int startCol, String[] board) {
    String exampleBoard[] = {"WBWBWBWB", "BWBWBWBW"};

    int whiteVerCnt = 0;

        for (int i = 0; i < 8; i++) {
            int row = startRow + i;
            for (int j = 0; j < 8; j++) {
                int col = startCol + j;

                if (board[row].charAt(col) != exampleBoard[row%2].charAt(j)){
                    whiteVerCnt++;
                }
            }
        }
        return Math.min(whiteVerCnt, 64-whiteVerCnt);
    }
}
