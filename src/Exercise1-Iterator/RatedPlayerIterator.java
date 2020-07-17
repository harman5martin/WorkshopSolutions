import java.util.Iterator;
import java.util.List;

public class RatedPlayerIterator implements Iterator<Player> {
    private List<Player> playersList;
    private int currentIndex;

    public RatedPlayerIterator(List<Player> playersList) {
        this.playersList = playersList;
    }

    public boolean hasNext() {
        if (currentIndex > playersList.size()) return false;

        while (currentIndex < playersList.size()) {
            if (playersList.get(currentIndex).getRating() >= 4) {
                return true;
            }
            currentIndex ++;
        }

        return false;
    }

    public Player next() {
        if (!hasNext()) {
            throw new RuntimeException("No more players.");
        }

        Player nextPlayer = playersList.get(currentIndex);
        currentIndex ++;
        return nextPlayer;
    }
}
