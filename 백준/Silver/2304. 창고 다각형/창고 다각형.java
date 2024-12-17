import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            map.put(sc.nextInt(), sc.nextInt());
        }

        Map.Entry<Integer, Integer> highestEntry = map.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .orElseThrow(() -> new RuntimeException("Empty Map"));

        int totalArea = left(map, highestEntry);

        totalArea += right(map, highestEntry);

        totalArea += highestEntry.getValue();

        System.out.println(totalArea);
    }

    private static int left(TreeMap<Integer, Integer> map, Map.Entry<Integer, Integer> highestEntry) {
        int total = 0;
        int maxHeight = 0;
        int prevX = map.firstKey();

        for (Map.Entry<Integer, Integer> entry : map.headMap(highestEntry.getKey(), true).entrySet()) {
            int curX = entry.getKey();
            int curHeight = entry.getValue();


            if (curHeight >= maxHeight){
                total += (curX - prevX) * maxHeight;
                maxHeight = Math.max(maxHeight, curHeight);
                prevX = curX;
            }

        }
        
        return total;
    }

    private static int right(TreeMap<Integer, Integer> map, Map.Entry<Integer, Integer> highestEntry) {
        int total = 0;
        int maxHeight = 0;
        int prevX = map.lastKey();

        for (Map.Entry<Integer, Integer> entry : map.tailMap(highestEntry.getKey(), true).descendingMap().entrySet()) {
            int curX = entry.getKey();
            int curHeight = entry.getValue();

            if (curHeight >= maxHeight){
                total += (prevX - curX) * maxHeight;
                maxHeight = Math.max(maxHeight, curHeight);
                prevX = curX;
            }
        }

        return total;
    }
}

