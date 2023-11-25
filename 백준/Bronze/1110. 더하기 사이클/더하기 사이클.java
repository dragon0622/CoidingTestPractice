import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
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

        bf.close();

        

        
        
    }
}
    
