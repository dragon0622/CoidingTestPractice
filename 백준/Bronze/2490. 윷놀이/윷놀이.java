import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += sc.nextInt();    
            }
        
            if (sum == 0) {
                System.out.println("D");
            }
            else if (sum == 1) {
                System.out.println("C");
            }
            else if (sum == 2) {
                System.out.println("B");
            }
            else if (sum == 3) {
                System.out.println("A");
            }
            else if (sum == 4) {
                System.out.println("E");
            }
        }
        
    }
}