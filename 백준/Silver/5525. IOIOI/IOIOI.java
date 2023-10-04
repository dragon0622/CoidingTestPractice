import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        String s = sc.next();

        String arr = make(N);

        String test = "";
        int cnt = 0;

        for (int i = 0; i <= M-arr.length(); i++) {
            if (M < arr.length()){
                break;
            }
            test = s.substring(i, arr.length() + i);
            
            if(test.equals(arr)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static String make(int n) {
        String arr = "";
        
        for (int i = 0; i < n; i++) {
            arr+="I";
            arr+="O";
        }
        
        arr += "I";
        
        return arr;
    }
}


