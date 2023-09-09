import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int numOfCity = sc.nextInt();
        int []dis = new int[numOfCity - 1];
        int []fuel = new int[numOfCity];

        for (int i = 0; i < numOfCity-1; i++) {
            dis[i] = sc.nextInt();
        }

        for (int i = 0; i < numOfCity; i++) {
            fuel[i] = sc.nextInt();
        }

        int charger = fuel[0];
        int cost = 0;
        
        for (int i = 0; i < numOfCity-1; i++) {
            if (fuel[i]>fuel[i+1]) {      
                charger = fuel[i+1];
            } 
            cost += charger * dis[i];       
        }

        System.out.println(cost);
        sc.close();
    }
}
