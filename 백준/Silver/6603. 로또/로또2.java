import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            int n = sc.nextInt();
            if (n == 0){
                break;
            }

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int r = 6;
            List<int[]> combinations = new ArrayList<>();

            generateCombinations(arr, r, 0, new int[r], 0, combinations);

            for (int[] combination : combinations) {
                for (int num : combination) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

            System.out.println();
        }
    }

    private static void generateCombinations(int[] arr, int r, int index, int[] current, int start, List<int[]> combinations) {
        if (index == r) {
            combinations.add(current.clone());
            return;
        }

        for (int i = start; i < arr.length; i++) {
            current[index] = arr[i];
            generateCombinations(arr, r, index + 1, current, i + 1, combinations); // 다음 값 선택
        }
    }
}
