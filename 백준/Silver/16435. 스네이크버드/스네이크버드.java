import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfFruits = sc.nextInt();
        int snake = sc.nextInt();
        int[] fruit = new int[numOfFruits];

        for (int i = 0; i < numOfFruits; i++) {
            fruit[i] = sc.nextInt();
        }

        Arrays.sort(fruit);

        for (int i = 0; i < numOfFruits; i++) {
            if (fruit[i] <= snake){
                snake++;
            }
            else{
                break;
            }
        }

        System.out.println(snake);

    }
}
