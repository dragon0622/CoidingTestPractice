import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sg_h = sc.nextInt();
        int sg_m = sc.nextInt();
        int cy_h;
        int cy_m;

        if (sg_m < 45) {
            if (sg_h == 0) {
                cy_h = 23;
            }
            else{
                cy_h = sg_h - 1;
            }
            cy_m = 60 - (45-sg_m); 
        }
        else{
            cy_h = sg_h;
            cy_m = sg_m - 45;
        }

        System.out.println(cy_h + " " + cy_m);

    }
}
