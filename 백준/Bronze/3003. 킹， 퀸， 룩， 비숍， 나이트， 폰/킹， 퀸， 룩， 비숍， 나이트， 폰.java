import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int king = sc.nextInt();
        int queen = sc.nextInt();
        int look = sc.nextInt();
        int bishop = sc.nextInt();
        int knight = sc.nextInt();
        int pawn = sc.nextInt();

        setOne(king, queen);
        setTwo(look, bishop, knight);
        setEight(pawn);

    }
    private static void setOne(int king, int queen) {
        System.out.print((1-king) + " " + (1-queen) + " ");
    }
    private static void setTwo(int look, int bishop, int knight) {
        System.out.print((2-look) + " " + (2-bishop) + " " + (2-knight) + " ");
    }
    private static void setEight(int pawn) {
        System.out.print((8-pawn));
    }
}
