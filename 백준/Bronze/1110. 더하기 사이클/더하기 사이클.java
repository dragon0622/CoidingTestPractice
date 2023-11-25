import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int goal = num;

        int sum = 0;

        int new_num;
        int cnt = 0;

        while (true) {
            cnt++;
            sum = num / 10 + num % 10;
            new_num = (num % 10) * 10 + (sum % 10);
            num = new_num;
            if (num == goal) {
                break;
            }
        }

        System.out.println(cnt);

        

        
        
    }
}
    
