public class Main {
    public static void main(String[] args) {
        PlayerList playerList = new PlayerList();
        RatedPlayerIterator ratedPlayerIterator = new RatedPlayerIterator(playerList.getPlayerList());

        while(ratedPlayerIterator.hasNext()) {
            Player nextPlayer = ratedPlayerIterator.next();
            PrintOutInformation(nextPlayer);
        }
    }

    public static void PrintOutInformation(Player nextPlayer) {
        System.out.println("-------------------");
        System.out.println(nextPlayer.getName());
        System.out.println(nextPlayer.getSport());
        System.out.println(nextPlayer.getPosition());
        System.out.println(nextPlayer.getRating());
        System.out.println("-------------------");
    }
}
