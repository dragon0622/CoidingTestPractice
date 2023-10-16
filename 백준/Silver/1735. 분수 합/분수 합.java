import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        int mo;
        int ja;

        mo = b * d;
        ja = a*d + b*c;
        
        int x = method(mo, ja);

        System.out.println(ja/x + " " + mo/x);

    }

    public static int method(int mo, int ja){

        if(mo % ja == 0){
            return ja;
        }
        else{
            return method(ja, mo%ja);
        }

    }
}
