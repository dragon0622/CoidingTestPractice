import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numOfPlayer = sc.nextInt();
        int maxPlayerOfRoom = sc.nextInt();

        List<Room> rooms = new ArrayList<>();

        for (int i = 0; i < numOfPlayer; i++) {
            int level = sc.nextInt();
            String name = sc.next();

            boolean joined = false;

            for (Room room : rooms) {
                if (room.canJoin(level)) {
                    room.addPlayer(new Player(name, level));
                    joined = true;
                    break;
                }
            }

            if (!joined) {
                Room newRoom = new Room(level - 10, level + 10, maxPlayerOfRoom);
                newRoom.addPlayer(new Player(name, level));
                rooms.add(newRoom);
            }
        }

        for (Room room : rooms) {
            room.printRoom();
        }

        sc.close();
    }

    static class Room {
        int minLevel;
        int maxLevel;
        int maxPlayers;
        List<Player> players;

        public Room(int minLevel, int maxLevel, int maxPlayers) {
            this.minLevel = minLevel;
            this.maxLevel = maxLevel;
            this.maxPlayers = maxPlayers;
            this.players = new ArrayList<>();
        }

        public boolean canJoin(int level) {
            return players.size() < maxPlayers && level >= minLevel && level <= maxLevel;
        }

        public void addPlayer(Player player) {
            players.add(player);
        }

        public void printRoom() {
            if (players.size() == maxPlayers) {
                System.out.println("Started!");
            } else {
                System.out.println("Waiting!");
            }

            players.sort(Comparator.comparing(player -> player.name));

            for (Player player : players) {
                System.out.println(player.level + " " + player.name);
            }
        }
    }

    static class Player {
        String name;
        int level;

        public Player(String name, int level) {
            this.name = name;
            this.level = level;
        }
    }

}
