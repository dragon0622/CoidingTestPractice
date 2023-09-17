import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if(N%7 == 0 || N%7 == 2){
            System.out.println("CY");
        }
        else{
            System.out.println("SK");
        }

        sc.close();
    }
}

