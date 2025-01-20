import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfCountry = sc.nextInt();

        int targetCountry = sc.nextInt();

        List<Country> countries = new ArrayList<>();

        for (int i = 0; i < numberOfCountry; i++) {
            int countryNum = sc.nextInt();
            int gold = sc.nextInt();
            int silver = sc.nextInt();
            int bronze = sc.nextInt();
            boolean isTarget = (countryNum == targetCountry);
            countries.add(new Country(countryNum, gold, silver, bronze, isTarget));
        }

        countries.sort((c1, c2) -> {
            if (c1.gold != c2.gold) {
                return Integer.compare(c2.gold, c1.gold);
            }
            if (c1.silver != c2.silver) {
                return Integer.compare(c2.silver, c1.silver);
            }
            return Integer.compare(c2.bronze, c1.bronze);
        });

        int rank = 1;
        int prevGold = -1, prevSilver = -1, prevBronze = -1;
        int answer = 1;

        for (int i = 0; i < countries.size(); i++) {
            Country current = countries.get(i);

            if (current.gold != prevGold || current.silver != prevSilver || current.bronze != prevBronze) {
                rank = i + 1;
                prevGold = current.gold;
                prevSilver = current.silver;
                prevBronze = current.bronze;
            }

            if (current.target) {
                answer = rank;
                break;
            }
        }

        System.out.println(answer);


    }
    static class Country{
        int countryNum;
        int gold;
        int silver;
        int bronze;
        boolean target;

        public Country(int countryNum, int gold, int silver, int bronze, boolean bool) {
            this.countryNum = countryNum;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
            this.target = bool;
        }
    }
}