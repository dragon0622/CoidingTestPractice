import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        Character[] characters = new Character[word.length()];

        int cnt = 0;

        toCharacterArr(characters, word);

        cnt = getCnt(characters, cnt);

        makeResult(cnt, characters);

    }

    private static void toCharacterArr(Character[] characters, String word) {
        for (int i = 0; i < characters.length; i++) {
            characters[i] = word.charAt(i);
        }
    }

    private static int getCnt(Character[] characters, int cnt) {
        for (int i = 0; i < characters.length/2; i++) {
            if (characters[i] == characters[characters.length-1-i]){
                cnt++;
            }
        }
        return cnt;
    }

    private static void makeResult(int cnt, Character[] characters) {
        if (cnt == characters.length/2){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
