import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> dancePerson = new HashSet<>();

        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String[] person = sc.nextLine().split(" ");

            if (person[0].equals("ChongChong")||person[1].equals("ChongChong")){
                startDance(person, dancePerson);
            }

            if (dancePerson.contains(person[0])||dancePerson.contains(person[1])){
                letsDance(person, dancePerson);
            }
        }

        System.out.println(dancePerson.size());



    }

    private static void letsDance(String[] person, Set<String> dancePerson) {
        if (dancePerson.contains(person[0])){
            dancePerson.add(person[1]);
        }
        else{
            dancePerson.add(person[0]);
        }
    }

    private static void startDance(String[] person, Set<String> dancePerson) {
        if (person[0].equals("ChongChong")){
            dancePerson.add(person[1]);
        }
        else{
            dancePerson.add(person[0]);
        }
    }
}
