import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int target_1 = sc.nextInt();
        int target_2 = sc.nextInt();

        int count = 0;
        int result = 0;

        for (int i = 1; i <= target_1; i++) {
            if (target_1 % i == 0){
                count++;
            }

            if (count == target_2) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
