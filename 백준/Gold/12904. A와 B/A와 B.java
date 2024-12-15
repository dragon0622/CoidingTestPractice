import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();


        while(a.length() < b.length()){

            if (b.endsWith("A")) {
                b = b.substring(0, b.length() - 1);
            }

            else if (b.endsWith("B")) {
                b = b.substring(0, b.length() - 1);
                b = new StringBuilder(b).reverse().toString();
            }
        }

        if (a.equals(b)){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

    }

}
