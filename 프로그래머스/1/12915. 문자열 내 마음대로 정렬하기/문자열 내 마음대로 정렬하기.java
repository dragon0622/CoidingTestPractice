import java.io.*;
import java.util.Arrays;
class Solution {
    public static String[] solution(String[] strings, int n) {
        String[] superString  = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            superString[i] = strings[i].charAt(n) + strings[i];
        }

        Arrays.sort(superString);

        for (int i = 0; i < strings.length; i++) {
            superString[i] = superString[i].substring(1);
        }

        return superString;
    }
}