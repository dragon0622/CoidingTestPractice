import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numOfBurger = Integer.parseInt(st.nextToken());
        int numOfSide = Integer.parseInt(st.nextToken());
        int numOfDrink = Integer.parseInt(st.nextToken());

        int min = findMin(numOfBurger, numOfSide, numOfDrink);

        int totalBeforeSale = 0;
        Integer[] burger = new Integer[numOfBurger];
        Integer[] side = new Integer[numOfSide];
        Integer[] drink = new Integer[numOfDrink];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfBurger; i++) {
            burger[i] = Integer.parseInt(st.nextToken());
            totalBeforeSale += burger[i];
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfSide; i++) {
            side[i] = Integer.parseInt(st.nextToken());
            totalBeforeSale += side[i];
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfDrink; i++) {
            drink[i] = Integer.parseInt(st.nextToken());
            totalBeforeSale += drink[i];
        }

        Arrays.sort(burger, Collections.reverseOrder());
        Arrays.sort(side, Collections.reverseOrder());
        Arrays.sort(drink, Collections.reverseOrder());

        int totalAfterSale = 0;
        for (int i = 0; i < min; i++) {
            totalAfterSale += (int) ((burger[i] + side[i] + drink[i]) * 0.9);
        }

        for (int i = min; i < numOfBurger; i++) {
            totalAfterSale += burger[i];
        }

        for (int i = min; i < numOfSide; i++) {
            totalAfterSale += side[i];
        }

        for (int i = min; i < numOfDrink; i++) {
            totalAfterSale += drink[i];
        }

        System.out.println(totalBeforeSale);
        System.out.println(totalAfterSale);
    }

    private static int findMin(int numOfBurger, int numOfSide, int numOfDrink) {
        int min = numOfBurger;
        if (min > numOfSide) {
            min = numOfSide;
        }
        if (min > numOfDrink) {
            min = numOfDrink;
        }
        return min;
    }
}
