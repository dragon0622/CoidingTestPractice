import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){

            int num = sc.nextInt();

            if (num == 0){
                break;
            }

            List<int[]> combinations = new ArrayList<>();

            int[] arr = new int[num];

            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length - 5; i++) {
                for (int j = i + 1; j < arr.length - 4; j++) {
                    for (int k = j + 1; k < arr.length - 3; k++) {
                        for (int l = k + 1; l < arr.length - 2; l++) {
                            for (int m = l + 1; m < arr.length - 1; m++) {
                                for (int n = m + 1; n < arr.length; n++) {
                                    combinations.add(new int[]{arr[i], arr[j], arr[k], arr[l], arr[m], arr[n]});
                                }
                            }
                        }
                    }
                }
            }

            for (int[] combination : combinations) {
                for (int number : combination) {
                    System.out.print(number + " ");
                }
                System.out.println();
            }

            System.out.println();

        }
    }
}
