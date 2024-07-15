import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.next();
            if (arr[i].contains("FBI")){
                sb.append(i+1 + " ");
            }
        }

        if(sb.length() == 0 ){
            System.out.println("HE GOT AWAY!");
        }
        else{
            System.out.println(sb);    
        }
    }
}
