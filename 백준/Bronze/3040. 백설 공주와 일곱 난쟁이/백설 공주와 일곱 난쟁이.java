import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nine = new int[9];
        int sum = 0;
        int hund = 0;
        int fake_1 = 0;
        int fake_2 = 0;

        for (int i = 0; i < 9; i++) {
            nine[i] = sc.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            sum += nine[i];            
        }

        hund = sum - 100;

       
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(nine[i] != nine[j]&&nine[i]+nine[j]==hund){
                    fake_1 = nine[i];
                    fake_2 = nine[j];
                }
            }
        }
       
        

        for (int i = 0; i < 9; i++) {
            if(nine[i] != fake_1 && nine[i] != fake_2){
            System.out.println(nine[i]);
            }
        }

        sc.close();
    }
}
